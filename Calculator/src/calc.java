/*
 *****************************************************
 * Name: Joseph Artura
 * AP CS A
 * Period 1
 * Date:
 * Fraction Calculator
 *****************************************************
 */
//imports the java.util library for everything I need
import java.util.Scanner;
public class calc{
    public static void main(String[] args) {
        //initializes playCalc to yes to initially enter the while loop
        String playCalc = "yes";
        //initializes the scanner called 'in'
        Scanner in = new Scanner(System.in);
        //while loop to test if the input equals yes or y
        while(playCalc.equalsIgnoreCase("yes") || playCalc.equalsIgnoreCase("y")){
            System.out.println("Enter any expression to add, subtract, multiply or divide: ");
            //sets the strings below to the input
            String fraction1 = in.next();
            String operation = in.next();
            String fraction2 = in.next();
            //parses the string from different sections and sets the numbers to fractions and detects the sign
            parseString(fraction1, operation, fraction2);
            System.out.println("Do you want to continue?");
            playCalc = in.next();
        }
        System.out.println("Goodbye.");
    }
    private static void parseString(String frac1, String operand, String frac2){
        //initializing the necessary variables here instead of the if statements
        int wholeNum1;
        int numerator;
        int denominator;
        int wholeNum2;
        int numerator2;
        int denominator2;
        //checks if the whole number is in the string
        if(frac1.contains("_")){
            //wholeNum is equal to whatever parsewholenum spits out
            wholeNum1 = parseWholeNum(frac1);
            //numerator is equal to whatever parsenumerator spits out
            numerator = parseNumerator(frac1);
            //denominator is equal to whatever parsedenominator spits out
            denominator = parseDenominator(frac1);
            //adds the whole number to numerator properly
            numerator += (wholeNum1 * denominator);
        } else if(frac1.contains("/")) {
            //numerator is whatever the parseInt is equal to
            numerator = Integer.parseInt(frac1.substring(0,frac1.indexOf("/")));
            //denominator is whatever the parseInt is equal to
            denominator = Integer.parseInt(frac1.substring(frac1.indexOf("/")+1));
        } else {
            //numerator is whatever the parseInt is equal to
            numerator = Integer.parseInt(frac1);
            denominator = 1;
        }
        //the same thing happens here that happened in finding the first fraction
        if(frac2.contains("_")){
            wholeNum2 = parseWholeNum(frac2);
            numerator2 = parseNumerator(frac2);
            denominator2 = parseDenominator(frac2);
            numerator2 = wholeNum2 * denominator2 + numerator2;
        } else if(frac2.contains("/")) {
            numerator2 = Integer.parseInt(frac2.substring(0,frac2.indexOf("/")));
            denominator2 = Integer.parseInt(frac2.substring(frac2.indexOf("/")+1));
        } else {
            numerator2 = Integer.parseInt(frac2);
            denominator2 = 1;
        }
        //puts the numbers found here into calculations for processing
        calculations(numerator, numerator2, denominator, denominator2, operand);
    }
    private static int parseWholeNum(String frac){
        //finds a number
        return Integer.parseInt(frac.substring(0,frac.indexOf("_")));
    }
    private static int parseNumerator(String frac){
        //finds a number
        return Integer.parseInt(frac.substring(frac.indexOf("_")+1,frac.indexOf("/")));
    }
    private static int parseDenominator(String frac){
        //finds a number
        return Integer.parseInt(frac.substring(frac.indexOf("/")+1));
    }
    private static void calculations(int num1, int num2, int denom1, int denom2, String op) {
        //checks the operator
        if(op.equals("+")){
            //prints the final result
            System.out.println(add(num1, num2, denom1, denom2));
        } else if(op.equals("-")) {
            num2 *= -1;
            //prints the final result
            System.out.println(add(num1, num2, denom1, denom2));
        } else if(op.equals("*") || op.equalsIgnoreCase("x")) {
            //prints the final result
            System.out.println(multiply(num1, num2, denom1, denom2));
        } else if(op.equals("/")){
            //switch the second numerator with the second denominator
            int temp = denom2;
            denom2 = num2;
            num2 = temp;
            //prints the final result
            System.out.println(multiply(num1, num2, denom1, denom2));
        }else{
            System.out.println("Please enter valid characters.");
        }
    }
    private static String add(int num1, int num2, int denom1, int denom2){
        //does the logic to add fractions
        int numerator = (num1 * denom2) + (num2 * denom1);
        int denominator = denom1 * denom2;
        //checks if the output has to be negative
        boolean negativeFrac = negativeReturn(numerator, denominator);
        //removes negative signs to make life easier
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        //finds common factor
        int commonFactor = commonFactor(numerator, denominator);
        //divides by common factor
        numerator /= commonFactor;
        denominator /= commonFactor;
        //finds whole number
        int wholeNum = wholeNumReturn(numerator, denominator);
        //removes whole number equivalent from numerator
        numerator -= (wholeNum * denominator);
        //returns a string with the numbers and a boolean as parameters
        return stringReturn(wholeNum, numerator, denominator, negativeFrac);
    }
    private static String multiply(int num1, int num2, int denom1, int denom2) {
        //does the logic for multiplying numbers
        int numerator = num1 * num2;
        int denominator = denom1 * denom2;
        //from here it does the same thing as the add method
        boolean negativeFrac = negativeReturn(numerator, denominator);
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        int commonFactor = commonFactor(numerator, denominator);
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNum = wholeNumReturn(numerator, denominator);
        numerator -= (wholeNum * denominator);
        return stringReturn(wholeNum, numerator, denominator, negativeFrac);
    }
    private static int commonFactor(int numerator, int denominator){
        //sets the limit to whatever number is bigger
        int limit = Math.max(numerator, denominator);
        int commonFactor = 1;
        //checks if the numerator is divisible
        if((numerator % denominator) != 0) {
            //finds the common factor here
            for (int i = 1; i < limit; i++) {
                if (numerator % i == 0 && denominator % i == 0 && commonFactor % i != 0)
                    commonFactor *= i;
            }
        }
        //returns the common factor
        return commonFactor;
    }
    private static boolean negativeReturn(int numerator, int denominator){
        //checks if the numerator and denominator are negative
        boolean negativeNum = (Math.abs(numerator) != numerator);
        boolean negativeDenom = (Math.abs(denominator) != denominator);
        //returns true if one or the other is true and false for every other case
        return (negativeDenom != negativeNum);
    }
    private static int wholeNumReturn(int numerator, int denominator){
        //initializes wholeNum to zero
        int wholeNum = 0;
        //loops until it finds the maximum whole number
        while(numerator >= denominator){
            wholeNum++;
            numerator -= denominator;
        }
        //returns the whole number
        return wholeNum;
    }
    private static String stringReturn(int wholeNum, int numerator, int denominator, boolean negativeFrac){
        //initializes the string answer as a blank
        String answer = "The answer is: ";
        //checks if negative is true
        if(negativeFrac)
            answer += "-";
        //checks if wholenumber is not 0 and numerator is 0
        if(wholeNum != 0 && numerator == 0)
            answer += wholeNum;
        //checks if wholenumber is not 0 and numerator is not 0
        if(wholeNum != 0 && numerator != 0)
            answer += wholeNum + "_" + numerator + "/" + denominator;
        //checks if wholenumber is 0 and numerator is not 0
        if(numerator != 0 && wholeNum == 0)
            answer += numerator + "/" + denominator;
        //checks if wholenumber is 0 and numerator is 0
        if(numerator == 0 && wholeNum == 0)
            answer += "0";
        return answer;
    }
}