/*
 * **********************************
 * Joseph Artura
 *
 * AP CS A
 *
 * Period 1
 *
 * October 3, 2018
 *
 * RocketShip Assignment
 *
 * *********************************
 * */

public class RocketShip {
    //sets how big the rocket is
    private static final int COLUMN = 10;
    public static void main(String[] args) {
        //method calls to make it into the shape of the rocket
        Cone();
        line();
        TopHalf();
        BottomHalf();
        line();
        BottomHalf();
        TopHalf();
        line();
        Cone();
    }
    private static void Cone() {
        //the first for loop allows for the cone generation to complete
        for (int y = 1; y < COLUMN * 2; y++) {
            //this for loop allows for the correct spacing to make a cone
            for (int i = COLUMN * 2; i > y; i--)
                System.out.print(' ');
            //generates the half of the cone in the shape of the cone
            for (int j = 0; j < y; j++)
                System.out.print('/');
            //generates the middle of the cone
            System.out.print("**");
            //generates the other half of the cone in the shape of the cone
            for (int k = 0; k < y; k++)
                System.out.print('\\');
            //goes to the next line to generate the next part of the cone
            System.out.println();
        }
    }
    private static void line() {
        //prints the first part of the line
        System.out.print("+");
        //prints the rest of the line
        for(int i = 0; i < COLUMN * 2; i++)
            System.out.print("=*");
        //prints end of the line
        System.out.println("+");
    }
    private static void TopHalf() {
        //this for loop continues the pattern for the length of the variable
        for (int y = 0; y < COLUMN; y++) {
            //prints the first part of the wall
            System.out.print("|");
            //this for loop generates the periods where there isn't /\
            for(int l = 0; l < 2; l++) {
                for (int i = COLUMN - 1; i > y; i--)
                    System.out.print('.');
                //this loop generates /\ and gets wider as it goes down
                for (int j = 0; j <= y; j++)
                    System.out.print("/\\");
                //this for loop generates the periods where there isn't /\
                for (int i = COLUMN - 1; i > y; i--)
                    System.out.print('.');
            }
            //ends the wall
            System.out.print("|");
            //goes to next line
            System.out.println();
        }
    }
    private static void BottomHalf() {
        for (int y = 0; y < COLUMN; y++) {
            //starts the wall
            System.out.print("|");
            for(int l = 0; l < 2; l++) {
                //this for loop generates the periods where there isn't \/
                for (int i = 0; i < y; i++)
                    System.out.print('.');
                //this loop generates \/ and gets wider as it goes down
                for (int j = COLUMN; j > y; j--)
                    System.out.print("\\/");
                //this for loop generates the periods where there isn't \/
                for (int i = 0; i < y; i++)
                    System.out.print('.');
            }
            //ends the wall
            System.out.print("|");
            //goes to next line
            System.out.println();
        }
    }
}