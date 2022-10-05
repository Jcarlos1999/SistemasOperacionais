package br.jcarlos.Thread;
import java.util.Scanner;

import java.util.Random;

public class GuessGame {
    
    private final Scanner sc;
    private final TimerThread timer;
    private final Random rand;
    private boolean isOver = false;
    private int maxTime = 30;
    private final int  upperBound;


    public GuessGame(int upperBound){
        this.sc = new Scanner(System.in);
        this.rand = new Random();
        this.upperBound = upperBound;
        this.timer = new TimerThread();
    }

    public GuessGame(int upperBound, int maxIime){
        this.sc = new Scanner(System.in);
        this.rand = new Random();
        this.upperBound = upperBound;
        this.timer = new TimerThread(maxIime);
        this.maxTime = maxIime;
    }

    public void Start() {
        String yourShot;
        String isNear;
        int randomNumber = rand.nextInt(this.upperBound);
        int count = 0;
        System.out.print("\nO Jogo Vai Começar!!!!\nSua tentativa: ");

        while (!isOver) {

            yourShot = sc.nextLine();

            if (yourShot.isEmpty()) {
                System.out.print("Digite novamente: ");
            } else if (yourShot.equals(Integer.toString(randomNumber))) {
                timer.interrupt();
                System.out.println("\n*******************************************\nParabens, você acertou o numero!!! \n" +
                        "Com " + count + " tentativas e em " + timer.getTime() + " segundos!!!!");
                break;

            } else if (timer.getTime() >= this.maxTime) {
                isOver = !isOver;
            } else if (!yourShot.equals(Integer.toString(randomNumber))) {
                count++;
                isNear = Integer.parseInt(yourShot) > randomNumber ? "Esse numero é maior" : "Esse numero é menor";
                System.out.print(isNear + "\nNova Tentativa: ");

            }

        }

    }

}
