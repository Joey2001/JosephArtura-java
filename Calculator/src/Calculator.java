/*
 *****************************************************
 * Name: Joseph Artura
 * AP CS A
 * Period 1
 * Date:
 * Fraction Calculator
 *****************************************************
 */

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner out = new Scanner(System.in);
        String looper = "yes";
        while (looper.equalsIgnoreCase("yes")) {
            System.out.println("Enter any fraction to add, subtract, multiply or divide:");
            String input = in.nextLine() + " ";
            stringParse(input);
            System.out.println("Do you want to continue?");
            looper = out.next();
        }
    }

    private static void stringParse(String string) {
        String word = "";
        int count = 0;
        String[] numberHold = new String[5];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' && string.charAt(i) != '_') {
                word += string.charAt(i);
            } else {
//                System.out.println(word);
                numberHold[count] = word;
                count++;
                word = "";
            }
        }
        String a = numberHold[numberHold.length /2];
        String b = numberHold[0];
        String c = numberHold[1];
        numberHold[0] = a;
        numberHold[1] = b;
        numberHold[2] = c;
        String[] num = Arrays.copyOfRange(numberHold, 1, numberHold.length);
        String[] sign = Arrays.copyOfRange(numberHold, 0, 1);
        String fraction = num[1] + "/" + num[3] + "/";
        int wholeNum = Integer.parseInt(num[0]);
        int wholeNum2 = Integer.parseInt(num[2]);
        String word2 = "";
        int count2 = 0;
        String[] fractionHold = new String[4];
        for (int i = 0; i < fraction.length(); i++) {
            if (fraction.charAt(i) != '/') {
                word2 += fraction.charAt(i);
            } else {
//                System.out.println(word2);
                fractionHold[count2] = word2;
                count2++;
                word2 = "";
            }
        }
        int A = Integer.parseInt(fractionHold[0]);
        int B = Integer.parseInt(fractionHold[1]);
        int C = Integer.parseInt(fractionHold[2]);
        int D = Integer.parseInt(fractionHold[3]);
        A += (wholeNum * B);
        C += (wholeNum2 * D);
//        System.out.println(Arrays.toString(numberHold));
//        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(sign));
//        System.out.println(Arrays.toString(fractionHold));
        System.out.print("The answer is: ");
        if(sign[0].equals("+")){
            System.out.println(add(A, B, C, D));
        }else if(sign[0].equals("-")){
            System.out.println(subtract(A, B, C, D));
        }else if(sign[0].equals("*")){
            System.out.println(multiply(A, B, C, D));
        }else if(sign[0].equals("/")){
            System.out.println(divide(A, B, C, D));
        }else{
            System.out.println("Please enter valid signs.");
        }
    }
    private static String add(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        int commonFactor = 1;
        int limit = 0;
        int numerator = ((firstNume * secondDenom) + (secondNume * firstDenom));
        int denominator = (secondDenom * firstDenom);
        if(numerator > denominator){
            limit = numerator;
        }else{
            limit = denominator;
        }
        for(int i = 2; i < limit; i++){
            if(numerator % i == 0 && denominator % i == 0 && commonFactor % i != 0){
                commonFactor *= i;
            }
        }
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNumCount = 0;
        while(numerator > denominator){
            numerator -= denominator;
            wholeNumCount++;
        }
        if(wholeNumCount > 0) {
            return wholeNumCount + "_" + numerator + "/" + denominator;
        }else{
            return numerator + "/" + denominator;
        }
    }

    private static String subtract(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        int commonFactor = 1;
        int limit = 0;
        int numerator = ((firstNume * secondDenom) - (secondNume * firstDenom));
        int denominator = (secondDenom * firstDenom);
        if(numerator > denominator){
            limit = numerator;
        }else{
            limit = denominator;
        }
        for(int i = 2; i < limit; i++){
            if(numerator % i == 0 && denominator % i == 0 && commonFactor % i != 0){
                commonFactor *= i;
            }
        }
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNumCount = 0;
        while(numerator > denominator){
            numerator -= denominator;
            wholeNumCount++;
        }
        if(wholeNumCount > 0) {
            return wholeNumCount + "_" + numerator + "/" + denominator;
        }else{
            return numerator + "/" + denominator;
        }
    }

    private static String multiply(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        int commonFactor = 1;
        int limit = 0;
        int numerator = (firstNume * secondNume);
        int denominator = (firstDenom * secondDenom);
        if(numerator > denominator){
            limit = numerator;
        }else{
            limit = denominator;
        }
        for(int i = 2; i < limit; i++){
            if(numerator % i == 0 && denominator % i == 0 && commonFactor % i != 0){
                commonFactor *= i;
            }
        }
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNumCount = 0;
        while(numerator > denominator){
            numerator -= denominator;
            wholeNumCount++;
        }
        if(wholeNumCount > 0) {
            return wholeNumCount + "_" + numerator + "/" + denominator;
        }else{
            return numerator + "/" + denominator;
        }
    }

    private static String divide(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        int commonFactor = 1;
        int limit = 0;
        int numerator = (firstNume * secondDenom);
        int denominator = (firstDenom * secondNume);
        if(numerator > denominator){
            limit = numerator;
        }else{
            limit = denominator;
        }
        for(int i = 2; i < limit; i++){
            if(numerator % i == 0 && denominator % i == 0 && commonFactor % i != 0){
                commonFactor *= i;
            }
        }
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNumCount = 0;
        while(numerator > denominator){
            numerator -= denominator;
            wholeNumCount++;
        }
        if(wholeNumCount > 0) {
            return wholeNumCount + "_" + numerator + "/" + denominator;
        }else{
            return numerator + "/" + denominator;
        }
    }

    public static int parseWhole(final String fraction) {
        return 0;
    }

    public static int parseNume(final String fraction) {
        return 0;
    }

    public static int parseDenom(final String fraction) {
        return 0;
    }
}
