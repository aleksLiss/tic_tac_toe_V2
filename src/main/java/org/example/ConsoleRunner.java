package org.example;

public class ConsoleRunner {
    public void run() {

        Player p1 = new Player(PositionsPlayer.X);
        Player p2 = new Player(PositionsPlayer.O);
        Field f = new Field();

        f.viewField();
        p1.go();
        f.viewField();
        p2.go();
        f.viewField();

    }
}



class Test{
    public static void main(String[] args) {

    }
}