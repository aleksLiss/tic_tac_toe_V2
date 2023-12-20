package org.example;

import org.example.exceptions.EmptyPositionException;
import org.example.model.Field;
import org.example.model.Game;
import org.example.model.Player;
import org.example.model.PositionsPlayer;

public class ConsoleRunner {
    public static void main(String[] args){
        Game g = new Game();
        g.run();
    }
}



