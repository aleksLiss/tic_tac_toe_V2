package org.example.concoleIO;

import org.example.exceptions.PositionException;
import org.example.model.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

    public static int getPosition() {
        System.out.println(Messages.INPUT_POSITION.getMsg());
        int position;
        while (true) {
            String result = inputToString();
            try {
                correctInputOfPosition(result);
                position = Integer.parseInt(result);
                if (isNumberNotInRange(position)) {
                    System.out.println(Messages.POSITION_EX.getMsg());
                    continue;
                }
                break;
            } catch (PositionException e) {
                System.out.println(e.getMessage());
            }
        }
        return position;
    }

    public static boolean isNumberNotInRange(int number) {
        if (number < 0 || number > 8) {
            return true;
        }
        return false;
    }

    public static void correctInputOfPosition(String position) throws PositionException {
        try {
            Integer.valueOf(position);
        } catch (NumberFormatException e) {
            throw new PositionException(Messages.POSITION_EX.getMsg());
        }
    }

    public static String inputToString() {
        String result = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            result = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
