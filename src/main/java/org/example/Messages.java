package org.example;

public enum Messages {


    INPUT_NAME("Input you're name..."),
    ERROR_INPUT_POSITION("Input correct number of position"),
    INPUT_POSITION("Input position...");
    private String msg;

    Messages(String msg) {
        this.msg = msg;
    }

    Messages(){};

    public String getMsg() {
        return msg;
    }
}
