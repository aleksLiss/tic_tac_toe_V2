package org.example.model;

public enum Messages {

    INPUT_POSITION("Input position..."),
    LINE("--------------------"),
    EMPTY_POSITION_EX("position is not empty"),
    POSITION_EX("Input correct number of position: from 1 till 9");
    private String msg;

    Messages(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
