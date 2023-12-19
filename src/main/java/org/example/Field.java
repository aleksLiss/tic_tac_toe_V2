package org.example;

public class Field {
    private static PositionsPlayer[] Field = new PositionsPlayer[9];

    public static void inputPosition(int position, PositionsPlayer figure) {
        if (isEmptyPosition(position)) {
            Field[position] = figure;
        } else {
            System.out.println(Messages.ERROR_EMPTY_POSITION.getMsg());
        }
    }

    private static boolean isEmptyPosition(int position) {
        return Field[position] == null;
    }

    public boolean isEmptyField(){
        for (PositionsPlayer pos: Field){
            if(pos == null){
                return true;
            }
        }
        return false;
    }
    public boolean isWin() {
        int[][] arrOfWinsPositions = WinsPositions.WinsPositions;
        boolean flag = false;
        for (int[] pos : arrOfWinsPositions) {
            int a = pos[0];
            int b = pos[1];
            int c = pos[2];
            if (Field[a].equals(Field[b]) && Field[b].equals(Field[c]) && Field[c].equals(Field[a])) {
                flag = true;
            }
        }
        return flag;
    }

    public void viewField() {
        int counter = 0;
        System.out.println("------------------------");
        for (PositionsPlayer s : Field) {
            System.out.print("| " + s + " |");
            counter++;
            if (counter % 3 == 0) {
                System.out.println();
                System.out.println("------------------------");
            }
        }
    }


}

