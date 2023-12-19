package org.example;

public class Player {
    private final String name;
    private final PositionsPlayer position;

    public Player(PositionsPlayer pos) {
        this.name = ConsoleInput.getName();
        this.position = pos;
    }


    public String getName() {
        return name;
    }

    public PositionsPlayer getPosition() {
        return position;
    }

    public void go() {
        int posit = ConsoleInput.getPosition();
        Field.inputPosition(posit, this.getPosition());
    }



}
