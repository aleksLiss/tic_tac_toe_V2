package org.example.model;

import org.example.concoleIO.ConsoleInput;
import org.example.exceptions.EmptyPositionException;

import java.util.Arrays;

public class Field {
    private static PositionsPlayer[] Field = new PositionsPlayer[9];

    public static void inputPosition(PositionsPlayer figure) {

        while (true) {
            try {
                int pos = ConsoleInput.getPosition();
                EmptyPosition(pos);
                Field[pos - 1] = figure;
                break;
            } catch (EmptyPositionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void EmptyPosition(int position) throws EmptyPositionException {
        if (Field[position - 1] != null) {
            throw new EmptyPositionException(Messages.EMPTY_POSITION_EX.getMsg());
        }
    }

    public static boolean isEmptyField() {
        for (PositionsPlayer pos : Field) {
            if (pos == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWin() {
        int[][] arrOfWinsPositions = WinsPositions.WinsPositions;
        boolean flag = false;
        for (int i = 0; i < arrOfWinsPositions.length; i += 3) {
            if (isNullPosition(i, i + 1, i + 2)) {
                continue;

            }
            if (Field[i].equals(Field[i + 1])
                    && Field[i + 1].equals(Field[i + 2])
                    && Field[i + 2].equals(Field[i])) {
                flag = true;
            }
        }
        return flag;
    }

    private static boolean isNullPosition(int a, int b, int c) {
        if (Field[a] == null || Field[b] == null || Field[c] == null) {
            return true;
        }
        return false;
    }

    public static void viewField() {
        int counter = 0;
        System.out.println(Messages.LINE.getMsg());
        for (PositionsPlayer s : Field) {
            System.out.print("| " + s);
            counter++;
            if (counter % 3 == 0) {
                System.out.print(" |");
                System.out.println();
                System.out.println(Messages.LINE.getMsg());
            }
        }
    }

}

