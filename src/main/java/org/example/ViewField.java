package org.example;

public class ViewField {

    private String field =
            "------------------------\n" +
            "|   1  |   2   |  3    |\n"+
            "------------------------\n" +
            "|   4  |   5   |  6    |\n" +
            "------------------------\n" +
            "|   7  |   8   |   9   |\n" +
            "------------------------";
    public void viewField(){

    }
}


class TestField{
    public static void main(String[] args) {
        ViewField v = new ViewField();
        v.viewField();
    }
}
