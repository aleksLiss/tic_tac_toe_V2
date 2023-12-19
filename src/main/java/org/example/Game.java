package org.example;

public class Game {

    public void run(){
        ConsoleRunner consoleRunner = new ConsoleRunner();
        consoleRunner.run();
    }

}



class TestGame{
    public static void main(String[] args) {
        new Game().run();
    }
}