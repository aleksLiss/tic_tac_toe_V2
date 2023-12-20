package org.example.model;

import org.example.concoleIO.ConsoleInput;
import org.example.exceptions.EmptyPositionException;

public class Player {
    private final PositionsPlayer position;

    public Player(PositionsPlayer pos) {
        this.position = pos;
    }

    public PositionsPlayer getPosition() {
        return position;
    }

    public void go(){
        Field.inputPosition(this.getPosition());
    }


}
