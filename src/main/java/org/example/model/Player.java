package org.example.model;

public class Player {
    private final PositionsPlayer position;

    public Player(PositionsPlayer pos) {
        this.position = pos;
    }

    public PositionsPlayer getPosition() {
        return position;
    }

    public void go(){
        if (Game.getIsStopOfGame()){
            Field.inputPosition(this.getPosition());
        }

    }


}
