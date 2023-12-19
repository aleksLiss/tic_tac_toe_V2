package org.example.model;

import org.example.exceptions.EmptyPositionException;

public class Field {
    private static PositionsPlayer[] Field = new PositionsPlayer[9];

    public static void inputPosition(int position, PositionsPlayer figure){
        try {
            EmptyPosition(position);
            Field[position] = figure;
        }catch (EmptyPositionException e){
            System.out.println(e.getMessage());
        }

    }

    private static void EmptyPosition(int position) throws EmptyPositionException{
        if(Field[position] != null){
            throw new EmptyPositionException(Messages.EMPTY_POSITION_EX.getMsg());
        }
    }

    public static boolean isEmptyField(){
        for (PositionsPlayer pos: Field){
            if(pos == null){
                return true;
            }
        }
        return false;
    }
    public static boolean isWin() {
        int[][] arrOfWinsPositions = WinsPositions.WinsPositions;
        boolean flag = false;
        for (int[] pos : arrOfWinsPositions) {
            Integer a = pos[0];
            Integer b = pos[1];
            Integer c = pos[2];
            if (Field[a].equals(Field[b]) && Field[b].equals(Field[c]) && Field[c].equals(Field[a])) {
                flag = true;
            }
        }
        return flag;
    }

    public static void viewField() {
        int counter = 0;
        System.out.println(Messages.LINE.getMsg());
        for (PositionsPlayer s : Field) {
            System.out.print("| " + s + " |");
            counter++;
            if (counter % 3 == 0) {
                System.out.println();
                System.out.println(Messages.LINE.getMsg());
            }
        }
    }


    //ovverride equals method: if this and obj = null, or this/obj = null -> return false, else -> return true
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

