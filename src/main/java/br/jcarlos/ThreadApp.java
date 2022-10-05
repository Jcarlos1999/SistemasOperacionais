package br.jcarlos;
import br.jcarlos.Thread.GuessGame;

public class ThreadApp 
{
    public static void main( String[] args )
    {
        GuessGame game = new GuessGame(100, 30);

        game.Start();
    }
}
