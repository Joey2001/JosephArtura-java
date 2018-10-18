/*
 * **********************************
 * Joseph Artura
 *
 * AP CS A
 *
 * Period 1
 *
 * October 18, 2018
 *
 * Distance Assignment
 *
 * *********************************
 * */

public class Distance {
    public static void main(String[] args) {
        double AtT = distance(21,21,16,10);
        double TtBl = distance(16,10,23,10);
        double BltA = distance(23,10,21,21);
        System.out.println("The distance from Auburn to Tacoma is " + AtT + " miles.\n");
        System.out.println("The distance from Tacoma to Bonney Lake is " + TtBl + " miles.\n");
        System.out.println("The total distance traveled so far is " + (AtT + TtBl) + " miles.\n");
        System.out.println("The distance from Bonney Lake to Auburn is " + BltA + " miles.\n");
        System.out.println("The total distance traveled is " + (AtT + TtBl + BltA) + " miles.");
    }

    private static double distance(int x1, int y1, int x2, int y2){
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        return Math.sqrt(x + y);
    }
}