package org.example.model;

public enum Messages {

    INPUT_POSITION("Input position..."),
    LINE("--------------------"),
    EMPTY_POSITION_EX("Position is not empty"),
    POSITION_EX("Input correct number of position: from 1 till 9"),
    GET_OUT_OF_THE_GAME("Input (l) or (L) for leave of the game"),
    START_MESSAGE("Welcome to tic-tac-toe!"),
    PLAYER_EXIT("Player give up");
    private String msg;

    Messages(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
