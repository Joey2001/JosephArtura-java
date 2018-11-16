/*
 * **********************************
 * Joseph Artura
 *
 * AP CS A
 *
 * Period 1
 *
 * November 14, 2018
 *
 * Rochambeau Assignment
 *
 * *********************************
 * */

//imports the scanner method to allow for input
import java.util.Scanner;
//imports the random method to get a random number so the number isn't predetermined
import java.util.Random;
public class Rochambeau {
    //calling the random import and referring to it as ran
    private static Random ran = new Random();
    //calling the scanner import and referring ot it as human
    private static Scanner human = new Scanner(System.in);
    public static void main(String[] args) {
        //printing the prompt for the while loop
        System.out.println("Do you want to play a game? (Y or N)");
        //getting a seed for the random value based on time
        ran.setSeed(System.currentTimeMillis());
        //initializing the while loop with a check to see if the string is equal to y
        while (human.next().toLowerCase().equals("y")) {
            //initializes the round count
            int round = 0;
            //initializes the how many rounds the computer wins count
            int compPts = 0;
            //initializes the how many rounds the human wins count
            int huPts = 0;
            //initializes the variable that is checked from a string value
            int a;
            //resets the seed every time a round occurs
            ran.setSeed(System.currentTimeMillis());
            //initializing the while loop to check if it's not past round three and either the human or computer has less than two points
            while ((round < 3) && ((huPts < 2) && (compPts < 2))) {
                //This is the prompt for the user to choose rock paper or scissors
                System.out.println("Rock, paper, or scissors?");
                //sets the input to a string all in lower case
                String huSrg = human.next().toLowerCase();
                //initializes the random integer that has a maximum value of 3
                int randInt = ran.nextInt(3);
                //checks if the input is rock and sets the variable a to 0
                if (huSrg.equals("rock")) {
                    a = 0;
                }
                //checks if the input is paper and sets the variable a to 1
                else if (huSrg.equals("paper")) {
                    a = 1;
                }
                //checks if the input is scissors and sets the variable a to 2
                else if (huSrg.equals("scissors")) {
                    a = 2;
                }
                //checks if the input is incorrect and sets the variable a to -1
                else {
                    a = -1;
                }
                //checks if it is less than, equal to, or greater than the random integer assigned to the computer
                if (a > randInt) {
                    if(huPts < 2) {
                        System.out.println("You win this round.");
                    }
                    huPts++;
                    if(huPts == 2){
                        System.out.println("You won the game!");
                    }
                }else if(a == randInt){
                    System.out.println("It's a tie");
                }else {
                    if(compPts < 2) {
                        System.out.println("You win this round.");
                    }
                    compPts++;
                    if(compPts == 2){
                        System.out.println("You won the game!");
                    }
                }
                //increments the round count
                round++;
            }
            //prompts the user if they want to play again
            System.out.println("Do you want to play again?");
        }
    }
}
