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
import java.util.*;
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
            parseString(fraction1, operation, fraction2);
            System.out.println("Do you want to continue?");
            playCalc = in.next();
        }
        System.out.println("Goodbye.");
    }
    private static void parseString(String frac1, String operand, String frac2){
        int wholeNum1;
        int numerator;
        int denominator;
        int wholeNum2;
        int numerator2;
        int denominator2;
        if(frac1.contains("_")){
            wholeNum1 = parseWholeNum(frac1);
            numerator = parseNumerator(frac1);
            denominator = parseDenominator(frac1);
            numerator = (wholeNum1 * denominator)+ numerator;
        } else if(frac1.contains("/")) {
            numerator = Integer.parseInt(frac1.substring(0,frac1.indexOf("/")));
            denominator = Integer.parseInt(frac1.substring(frac1.indexOf("/")+1));
        } else {
            wholeNum1 = Integer.parseInt(frac1);
            numerator = wholeNum1;
            denominator = 1;
        }
        if(frac2.contains("_")){
            wholeNum2 = parseWholeNum(frac2);
            numerator2 = parseNumerator(frac2);
            denominator2 = parseDenominator(frac2);
            numerator2 = wholeNum2 * denominator2 + numerator2;
        } else if(frac2.contains("/")) {
            numerator2 = parseNumerator(frac2);
            denominator2 = parseDenominator(frac2);
        } else {
            numerator2 = Integer.parseInt(frac2);
            denominator2 = 1;
        }
        calculations(numerator, numerator2, denominator, denominator2, operand);
    }
    private static int parseWholeNum(String frac){
        return Integer.parseInt(frac.substring(0,frac.indexOf("_")));
    }
    private static int parseNumerator(String frac){
        return Integer.parseInt(frac.substring(frac.indexOf("_")+1,frac.indexOf("/")));
    }
    private static int parseDenominator(String frac){
        return Integer.parseInt(frac.substring(frac.indexOf("/")+1));
    }
    private static void calculations(int num1, int num2, int denom1, int denom2, String op) {
        if(op.equals("+")){
            System.out.println(add(num1, num2, denom1, denom2));
        } else if(op.equals("-")) {
            num2 *= -1;
            System.out.println(add(num1, num2, denom1, denom2));
        } else if(op.equals("*") || op.equalsIgnoreCase("x")) {
            System.out.println(multiply(num1, num2, denom1, denom2));
        } else if(op.equals("/")){
            int temp = denom2;
            denom2 = num2;
            num2 = temp;
            System.out.println(multiply(num1, num2, denom1, denom2));
        }else{
            System.out.println("Please enter valid characters.");
        }
    }
    private static String add(int num1, int num2, int denom1, int denom2) {
        int numerator = (num1 * denom2) + (num2 * denom1);
        int denominator = denom1 * denom2;
        boolean negativeFrac = negativeReturn(numerator, denominator);
        if(negativeFrac){
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        int commonFactor = commonFactor(numerator, denominator);
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNum = wholeNumReturn(numerator, denominator);
        numerator -= (wholeNum * denominator);
        return stringReturn(wholeNum, numerator, denominator, negativeFrac);
    }
    private static String multiply(int num1, int num2, int denom1, int denom2) {
        int numerator = num1 * num2;
        int denominator = denom1 * denom2;
        boolean negativeFrac = negativeReturn(numerator, denominator);
        if(negativeFrac){
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
        }
        int commonFactor = commonFactor(numerator, denominator);
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNum = wholeNumReturn(numerator, denominator);
        numerator -= (wholeNum * denominator);
        return stringReturn(wholeNum, numerator, denominator, negativeFrac);
    }
    private static int commonFactor(int numerator, int denominator){
        int limit;
        int commonFactor = 1;
        if(numerator > denominator){
            limit = numerator;
        }else{
            limit = denominator;
        }
        if((numerator % denominator) != 0) {
            for (int i = 1; i < limit; i++) {
                if (numerator % i == 0 && denominator % i == 0 && commonFactor % i != 0) {
                    commonFactor *= i;
                }
            }
        }
        return commonFactor;
    }
    private static boolean negativeReturn(int numerator, int denominator){
        boolean negativeNum = false;
        boolean negativeDenom = false;
        if(Math.abs(numerator) != numerator){
            negativeNum = true;
        }
        if(Math.abs(denominator) != denominator){
            negativeDenom = true;
        }
        return (negativeDenom != negativeNum);
    }
    private static int wholeNumReturn(int numerator, int denominator){
        int wholeNum = 0;
        while(numerator >= denominator){
            wholeNum++;
            numerator -= denominator;
        }
        return wholeNum;
    }
    private static String stringReturn(int wholeNum, int numerator, int denominator, boolean negativeFrac){
        String answer = "";
        if(negativeFrac)
            answer += "-";
        if(wholeNum != 0 && numerator == 0)
            answer += wholeNum;
        if(wholeNum != 0 && numerator != 0)
            answer += wholeNum + "_" + numerator + "/" + denominator;
        if(numerator != 0 && wholeNum == 0)
            answer += numerator + "/" + denominator;
        if(numerator == 0 && wholeNum == 0)
            answer = "0";
        return answer;
    }
}