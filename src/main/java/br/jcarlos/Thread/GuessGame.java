package br.jcarlos.Thread;
import java.util.Scanner;

import java.util.Random;

public class GuessGame {
    
    private int maxTime = 30;
    private final int  upperBound;


    public GuessGame(int upperBound){
        this.upperBound = upperBound;
    }

    public GuessGame(int upperBound, int maxTime){

        this.upperBound = upperBound;
        this.maxTime = maxTime;
    }

    public void Start() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        TimerThread timer = new TimerThread(maxTime);
        String yourShot;
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

            }else if (!yourShot.equals(Integer.toString(randomNumber))) {
                count++;
                System.out.print(Integer.parseInt(yourShot) > randomNumber ? "Esse numero é maior\nNova Tentativa: " : "Esse numero é menor" + "\nNova Tentativa: ");

            }

        }

    }

}
