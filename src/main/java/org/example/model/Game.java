package org.example.model;

public class Game {

    private static boolean isStopOfGame = false;

    public Game() {
        isStopOfGame = true;
    }

    public static boolean getIsStopOfGame() {
        return isStopOfGame;
    }

    public static void stopOfTheGame() {
        isStopOfGame = false;
    }

    private static void cycleOfTheGame(Player player){
        player.go();
        Field.viewField();
        Field.isWin();
        Field.isEmptyField();
    }

    public void run() {

        Player p1 = new Player(PositionsPlayer.X);
        Player p2 = new Player(PositionsPlayer.O);
        System.out.println(Messages.START_MESSAGE.getMsg());
        System.out.println(Messages.GET_OUT_OF_THE_GAME.getMsg());
        while (isStopOfGame) {
            cycleOfTheGame(p1);
            cycleOfTheGame(p2);
        }

    }

}