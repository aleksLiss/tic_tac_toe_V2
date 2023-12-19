package org.example.model;

import org.example.ConsoleRunner;
import org.example.concoleIO.ConsoleInput;
import org.example.exceptions.EmptyPositionException;
import org.example.exceptions.PositionException;

public class Game {

    public void run(){

        Player p1 = new Player(PositionsPlayer.X);
        Player p2 = new Player(PositionsPlayer.O);

        while (Field.isEmptyField()){
            p1.go(ConsoleInput.getPosition());
            Field.isWin();
            p2.go(ConsoleInput.getPosition());
            Field.isWin();
            Field.viewField();
        }

    }

}


class Test{
    public static void main(String[] args) {
        Integer a = null;
        Integer b = null;

        System.out.println(a.equals(b));
    }
}