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
        while (looper.equalsIgnoreCase("yes") || looper.equalsIgnoreCase("Y")) {
            System.out.println("Enter any fraction to add, subtract, multiply or divide:");
            String input = in.nextLine() + " ";
            stringParse(input);
            System.out.println("Do you want to continue?");
            looper = out.next();
        }
    }

    private static void stringParse(String string) {
        StringBuilder word = new StringBuilder();
        int count = 0;
        String[] numberHold = new String[5];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' && string.charAt(i) != '_') {
                word.append(string.charAt(i));
            } else {
                numberHold[count] = word.toString();
                count++;
                word = new StringBuilder();
            }
        }
        String fraction;
        int wholeNum;
        int wholeNum2;
        String[] sign;
        if(numberHold[4] != null) {
            String a = numberHold[numberHold.length / 2];
            String b = numberHold[0];
            String c = numberHold[1];
            numberHold[0] = a;
            numberHold[1] = b;
            numberHold[2] = c;
            String[] num = Arrays.copyOfRange(numberHold, 1, numberHold.length);
            sign = Arrays.copyOfRange(numberHold, 0, 1);
            fraction = num[1] + "/" + num[3] + "/";
            wholeNum = Integer.parseInt(num[0]);
            wholeNum2 = Integer.parseInt(num[2]);
        }else{
            String[] shortNum = Arrays.copyOfRange(numberHold, 0, 3);
            sign = Arrays.copyOfRange(shortNum, 1,2);
            fraction = shortNum[0] + "/" + shortNum[2] + "/";
            wholeNum = 0;
            wholeNum2 = 0;
        }
        StringBuilder word2 = new StringBuilder();
        int count2 = 0;
        String[] fractionHold = new String[4];
        for (int i = 0; i < fraction.length(); i++) {
            if (fraction.charAt(i) != '/') {
                word2.append(fraction.charAt(i));
            } else {
                fractionHold[count2] = word2.toString();
                count2++;
                word2 = new StringBuilder();
            }
        }
        int A = Integer.parseInt(fractionHold[0]);
        int B = Integer.parseInt(fractionHold[1]);
        int C = Integer.parseInt(fractionHold[2]);
        int D = Integer.parseInt(fractionHold[3]);
        A += (wholeNum * B);
        C += (wholeNum2 * D);
        System.out.print("The answer is: ");
        if(sign[0].equals("+")){
            System.out.println(add(A, B, C, D));
        }else if(sign[0].equals("-")){
            System.out.println(subtract(A, B, C, D));
        }else if(sign[0].equals("*") || sign[0].equalsIgnoreCase("x")){
            System.out.println(multiply(A, B, C, D));
        }else if(sign[0].equals("/")){
            System.out.println(divide(A, B, C, D));
        }else{
            System.out.println("Please enter valid signs.");
        }
    }
    private static String add(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        int commonFactor = 1;
        int limit;
        int numerator = ((firstNume * secondDenom) - (-1 * secondNume * firstDenom));
        int denominator = (secondDenom * firstDenom);
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
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNumCount = 0;
        while(numerator > denominator){
            numerator -= denominator;
            wholeNumCount++;
        }
        if(wholeNumCount > 0 && numerator % denominator != 0) {
            return wholeNumCount + "_" + numerator + "/" + denominator;
        }else if(numerator % denominator == 0){
            int wholeNum = numerator / denominator;
            return (wholeNum + wholeNumCount) + "";
        }else if(numerator == 0){
            return "0";
        }else{
            return numerator + "/" + denominator;
        }
    }

    private static String subtract(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        int commonFactor = 1;
        int limit;
        int numerator = ((firstNume * secondDenom) - (secondNume * firstDenom));
        int denominator = (secondDenom * firstDenom);
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
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNumCount = 0;
        while(numerator > denominator){
            numerator -= denominator;
            wholeNumCount++;
        }
        if(wholeNumCount > 0 && numerator % denominator != 0) {
            return wholeNumCount + "_" + numerator + "/" + denominator;
        }else if(numerator % denominator == 0){
            int wholeNum = numerator / denominator;
            return (wholeNum + wholeNumCount) + "";
        }else if(numerator == 0){
            return "0";
        }else{
            return numerator + "/" + denominator;
        }
    }

    private static String multiply(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        int commonFactor = 1;
        int limit;
        int numerator = (firstNume * secondNume);
        int denominator = (firstDenom * secondDenom);
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
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNumCount = 0;
        while(numerator > denominator){
            numerator -= denominator;
            wholeNumCount++;
        }
        if(wholeNumCount > 0 && numerator % denominator != 0) {
            return wholeNumCount + "_" + numerator + "/" + denominator;
        }else if(numerator % denominator == 0){
            int wholeNum = numerator / denominator;
            return (wholeNum + wholeNumCount) + "";
        }else if(numerator == 0){
            return "0";
        }else{
            return numerator + "/" + denominator;
        }
    }

    private static String divide(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
        int commonFactor = 1;
        int limit;
        int numerator = (firstNume * secondDenom);
        int denominator = (firstDenom * secondNume);
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
        numerator /= commonFactor;
        denominator /= commonFactor;
        int wholeNumCount = 0;
        while(numerator > denominator){
            numerator -= denominator;
            wholeNumCount++;
        }
        if(wholeNumCount > 0 && numerator % denominator != 0) {
            return wholeNumCount + "_" + numerator + "/" + denominator;
        }else if(numerator % denominator == 0){
            int wholeNum = numerator / denominator;
            return (wholeNum + wholeNumCount) + "";
        }else if(numerator == 0){
            return "0";
        }else{
            return numerator + "/" + denominator;
        }
    }
}
