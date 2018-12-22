/*
 *****************************************************
 * Name: Joseph Artura
 * AP CS A
 * Period 1
 * Date:
 * Fraction Calculator
 *****************************************************
 */
import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        String playCalc = "yes";
        Scanner in = new Scanner(System.in);
        while(playCalc.equalsIgnoreCase("yes")){
            System.out.println("Enter any expression to add, subtract, multiply or divide: ");
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
        if(frac1.contains("_")){
            wholeNum1 = Integer.parseInt(frac1.substring(0,frac1.indexOf("_")));
            numerator = Integer.parseInt(frac1.substring(frac1.indexOf("_")+1,frac1.indexOf("/")));
            denominator = Integer.parseInt(frac1.substring(frac1.indexOf("/")+1));
            numerator = (wholeNum1 * denominator)+ numerator;
        } else if(frac1.contains("/")) {
            numerator = Integer.parseInt(frac1.substring(0,frac1.indexOf("/")));
            denominator = Integer.parseInt(frac1.substring(frac1.indexOf("/")+1));
        } else {
            wholeNum1 = Integer.parseInt(frac1);
            numerator = wholeNum1;
            denominator = 1;
        }
        int wholeNum2;
        int numerator2;
        int denominator2;
        if(frac2.contains("_")){
            wholeNum2 = Integer.parseInt(frac2.substring(0,frac2.indexOf("_")));
            numerator2 = Integer.parseInt(frac2.substring(frac2.indexOf("_")+1,frac2.indexOf("/")));
            denominator2 = Integer.parseInt(frac2.substring(frac2.indexOf("/")+1));
            numerator2 = wholeNum2 * denominator2 + numerator2;
        } else if(frac2.contains("/")) {
            numerator2 = Integer.parseInt(frac2.substring(0,frac2.indexOf("/")));
            denominator2 = Integer.parseInt(frac2.substring(frac2.indexOf("/")+1));
        } else {
            numerator2 = Integer.parseInt(frac2);
            denominator2 = 1;
        }
        calculations(numerator, numerator2, denominator, denominator2, operand);
    }
    private static void calculations(int num1, int num2, int denom1, int denom2, String op) {
        if(op.equals("+")){
            System.out.println(add(num1, num2, denom1, denom2));
        } else if(op.equals("-")) {
            num2 = -1 * num2;
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
        int commonFactor = commonFactor(numerator, denominator);
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNum = wholeNumReturn(numerator, denominator, 0);
        return stringReturn(wholeNum, numerator, denominator, "");
    }
    private static String multiply(int num1, int num2, int denom1, int denom2) {
        int numerator = num1 * num2;
        int denominator = denom1 * denom2;
        int commonFactor = commonFactor(numerator, denominator);
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNum = wholeNumReturn(numerator, denominator, 0);
        return stringReturn(wholeNum, numerator, denominator, "");
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
            for (int i = 2; i < limit; i++) {
                if (numerator % i == 0 && denominator % i == 0 && commonFactor % i != 0) {
                    commonFactor *= i;
                }
            }
        }
        return commonFactor;
    }
    private static int wholeNumReturn(int numerator, int denominator, int wholeNum){
        while(numerator >= denominator){
            wholeNum++;
            numerator -= denominator;
        }
        return wholeNum;
    }
    private static String stringReturn(int wholeNum, int numerator, int denominator, String answer){
        if(wholeNum != 0)
            answer += wholeNum;
        else
            answer += numerator + "/" + denominator;
        if(numerator == 0)
            answer = "0";
        return answer;
    }
}
