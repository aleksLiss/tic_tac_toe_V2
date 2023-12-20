package org.example.model;

import org.example.ConsoleRunner;
import org.example.concoleIO.ConsoleInput;
import org.example.exceptions.EmptyPositionException;
import org.example.exceptions.PositionException;

public class Game {

    public void run() {

        Player p1 = new Player(PositionsPlayer.X);
        Player p2 = new Player(PositionsPlayer.O);
        System.out.println(Messages.START_MESSAGE.getMsg());
        System.out.println(Messages.GET_OUT_OF_THE_GAME.getMsg());
        while (Field.isEmptyField() && !Field.isWin()) {
            p1.go();
            Field.viewField();
            Field.isWin();
            p2.go();
            Field.viewField();
            Field.isWin();

        }

    }

}