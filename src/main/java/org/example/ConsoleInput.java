package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {

    public static String getName(){
        System.out.println(Messages.INPUT_NAME.getMsg());
        String name = null;
        try {
            name = new BufferedReader(new InputStreamReader(System.in)).readLine();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return name;
    }

    public static Integer getPosition(){
        System.out.println(Messages.INPUT_POSITION.getMsg());
        Integer position = null;
        try (var scanner = new Scanner(System.in)){
            String result = scanner.nextLine();
            if (isNumeric(result)){
                position = Integer.valueOf(result);
            }else {
                System.out.println(Messages.ERROR_INPUT_POSITION.getMsg());
            }
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        return position;
    }

    public static boolean isNumeric(String number){
        try {
            Integer.parseInt(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
