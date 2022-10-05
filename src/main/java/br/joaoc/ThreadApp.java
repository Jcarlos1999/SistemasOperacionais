package br.joaoc;
import br.joaoc.Thread.GuessGame;

public class ThreadApp 
{
    public static void main( String[] args )
    {
        GuessGame game = new GuessGame(100, 30);

        game.Start();
    }
}
