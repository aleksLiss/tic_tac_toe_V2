package org.example.model;

import org.example.ConsoleRunner;
import org.example.concoleIO.ConsoleInput;
import org.example.exceptions.EmptyPositionException;
import org.example.exceptions.PositionException;

public class Game {

    private static boolean isStopOfGame = false;

    public static void stopOfTheGame(){
        System.out.println(Messages.PLAYER_EXIT.getMsg());
        isStopOfGame = true;
    }

    public void run() {

        Player p1 = new Player(PositionsPlayer.X);
        Player p2 = new Player(PositionsPlayer.O);
        System.out.println(Messages.START_MESSAGE.getMsg());
        System.out.println(Messages.GET_OUT_OF_THE_GAME.getMsg());
        while (Field.isEmptyField() && !Field.isWin() && !isStopOfGame) {
            p1.go();
            Field.viewField();
            p2.go();
            Field.viewField();
        }

    }

}