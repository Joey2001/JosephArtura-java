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
        //declaring the double distance from Auburn to Tacoma and plugging in the coordinates for each
        double AtT = distance(21,21,16,10);
        //declaring the double distance from Tacoma to Bonney Lake and plugging in the coordinates for each
        double TtBl = distance(16,10,23,10);
        //declaring the double distance from Bonney Lake to Auburn plugging in the coordinates for each
        double BltA = distance(23,10,21,21);
        //prints the statement for the distance from Auburn to Tacoma
        System.out.println("The distance from Auburn to Tacoma is " + AtT + " miles.\n");
        //prints the statement for the distance from Tacoma to Bonney Lake
        System.out.println("The distance from Tacoma to Bonney Lake is " + TtBl + " miles.\n");
        //print the statement for the distance traveled so far
        System.out.println("The total distance traveled so far is " + (AtT + TtBl) + " miles.\n");
        //prints the statement for the distance from Bonney Lake to Auburn
        System.out.println("The distance from Bonney Lake to Auburn is " + BltA + " miles.\n");
        //prints the statement for the total distance traveled
        System.out.println("The total distance traveled is " + (AtT + TtBl + BltA) + " miles.");
    }
//new method called distance with parameters that take in the coordinates
    private static double distance(int x1, int y1, int x2, int y2){
        //this subtracts and squares the x values
        double x = Math.pow((x2 - x1), 2);
        //this subtracts and squares the y values
        double y = Math.pow((y2 - y1), 2);
        //this takes the square root of the added values of x and y and returns the value to the main method
        return Math.sqrt(x + y);
    }
}