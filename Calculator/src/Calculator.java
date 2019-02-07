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

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner out = new Scanner(System.in);
        String looper = "yes";
        while(looper.equalsIgnoreCase("yes")) {
            System.out.println("Enter anything you want:");
            String input = in.nextLine() + " ";
            stringParse(input);
            System.out.println("Do you want to continue?");
            looper = out.next();
        }
    }
    private static void stringParse(String string){
        String word = "";
        String numerator;
        String denominator;
        int count = 0;
        ArrayList<String> numberHold = new ArrayList<String>();
        string.replace('_', ' ');
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' && string.charAt(i) != '_') {
                word += string.charAt(i);
            } else {
                System.out.println(word);
                numberHold.add(word);
                count++;
                word = "";
            }
        }
        for(int i = 0; i < numberHold.size(); i++){
            if(numberHold.get(i).contains("/")){
                numerator = numberHold.get(i).substring(0, numberHold.get(i).indexOf("/"));
                denominator = numberHold.get(i).substring(numberHold.get(i).indexOf("/"));
            }
        }
        System.out.println(numberHold);
    }
    public static String add(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
            return "";
    }

    public static String subtract(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
            return "";
    }

    public static String multiply(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
            return "";
    }

    public static String divide(final int firstNume, final int firstDenom, final int secondNume, final int secondDenom) {
            return "";
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
