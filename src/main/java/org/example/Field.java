package org.example;

public class Field {

    private static String [][] Field = new String[3][3];

    public static void setPosition(int position, String figure){
       switch (position){
           case 1:
               Field[0][0] = figure;
               break;
           case 2:
               Field[0][1] = figure;
               break;
           case 3:
               Field[0][2] = figure;
               break;
           case 4:
               Field[1][0] = figure;
               break;
           case 5:
               Field[1][1] = figure;
               break;
           case 6:
               Field[1][2] = figure;
               break;
           case 7:
               Field[2][0] = figure;
               break;
           case 8:
               Field[2][1] = figure;
               break;
           case 9:
               Field[2][2] = figure;
               break;
           default:
               System.out.println(Messages.ERROR_INPUT_POSITION.getMsg());
       }
    }
}
