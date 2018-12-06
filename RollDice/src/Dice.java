/*
 * **********************************
 * Joseph Artura
 *
 * AP CS A
 *
 * Period 1
 *
 * December 6, 2018
 *
 * Dice Assignment
 *
 * *********************************
 * */

//imports the scanner method to allow for input
//imports everything in java.util
import java.util.*;
public class Dice {
    //sets the number of dice to roll per turn
    private static int DICENUM = 1;
    public static void main(String[] args) {
        //initializes the count variable to keep tract of how many games are played
        int count = 0;
        //initializes the scanner class;
        Scanner in = new Scanner(System.in);
        //initializes the string object 'play' to equal yes
        String play = "yes";
        //sets setOfDice to equal to contructDice
        String[][] setOfDice = constructDice();
        while (play.equalsIgnoreCase("yes")){
            //prints all of the dice in a line using the printDice method
            printDice(constructDice());
            //initializes the diceSet to equal a 2D array of size of the constant by the constant
            String[][] diceSet = new String[DICENUM][DICENUM];
            for(int i = 1; i <= DICENUM; i++){
                //sets roll to be a random int
                int roll = (int) Math.round(Math.random() * 5);
                //sets the diceSet to equal a certain dice in setOfDice which calls contructDice
                diceSet[i - 1] = setOfDice[roll];
            }
            //prints the finished dice to print
            printDice(diceSet);
            //increments count
            count++;
            //prompts the user to play again
            System.out.println("Do you want to play again?");
            //sets the variable play to whatever the user sets it to be
            play = in.next();
            //generates a line to separate the games
            line();
        }
        //checks if count is equal to one
        if(count == 1)
            System.out.println("You rolled once.");
        //checks if count is greater than one
        if(count > 1)
            //prints how many times you rolled
            System.out.println("You have rolled " + count + " times.");
    }
    private static String[][] constructDice(){
        String topBot = " ------- ";
        String E =      "|       |";
        String M1 =     "|   *   |";
        String M2 =     "| *   * |";
        String L1 =     "| *     |";
        String R1 =     "|     * |";
        String[] One = {topBot, E, M1, E, topBot};
        String[] Two = {topBot, E, M2, E, topBot};
        String[] Three = {topBot, L1, M1, R1, topBot};
        String[] Four = {topBot, M2, E, M2, topBot};
        String[] Five = {topBot, M2, M1, M2, topBot};
        String[] Six = {topBot, M2, M2, M2, topBot};
        //contructDice returns a 2D array of all the possible dice
        return new String[][]{One, Two, Three, Four, Five, Six};
    }
    private static void printDice(String[][] allDice){
        //for loop traverses through the dice
        for(int dice = 0; dice < allDice[0].length; dice++){
            //for-each loop traverses through the sides of the dice
            for (String[] anAllDice : allDice)
                //prints each part of each side of each dice
                System.out.print(anAllDice[dice] + "\t");
            //new line to start on for the part of each side of each dice
            System.out.println();
        }
    }
    private static void line(){
        // uses the constant to vary the length of the line
        for(int i = 0; i < 14 * DICENUM; i++)
            //prints the line
            System.out.print("-");
        //goes to the next line for the next game
        System.out.println();
    }
}