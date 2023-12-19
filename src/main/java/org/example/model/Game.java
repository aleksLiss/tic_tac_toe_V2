package org.example.model;

import org.example.ConsoleRunner;
import org.example.concoleIO.ConsoleInput;
import org.example.exceptions.EmptyPositionException;
import org.example.exceptions.PositionException;

public class Game {

    public void run(){

        Player p1 = new Player(PositionsPlayer.X);
        Player p2 = new Player(PositionsPlayer.O);


        p1.go(ConsoleInput.getPosition());
        p2.go(ConsoleInput.getPosition());
//        Field.viewField();
//        p1.go(ConsoleInput.getPosition());
//        p2.go(ConsoleInput.getPosition());
//        Field.viewField();
//        p1.go(ConsoleInput.getPosition());
//        p2.go(ConsoleInput.getPosition());
//        Field.viewField();
//        p1.go(ConsoleInput.getPosition());
//        p2.go(ConsoleInput.getPosition());

    }

}


