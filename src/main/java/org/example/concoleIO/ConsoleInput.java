package org.example.concoleIO;

import org.example.exceptions.PositionException;
import org.example.model.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

    public static Integer getPosition() {
        System.out.println(Messages.INPUT_POSITION.getMsg());
        Integer position = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String result = bufferedReader.readLine();
            try {
                correctInputOfPosition(result);
                position = Integer.valueOf(result);
            } catch (PositionException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return position;
    }


    public static void correctInputOfPosition(String position) throws PositionException{
        try {
            Integer.valueOf(position);
        }catch (NumberFormatException e){
            throw new PositionException(Messages.POSITION_EX.getMsg());
        }
    }
}
