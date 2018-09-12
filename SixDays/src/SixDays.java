/*

**************************************************
* Joseph Artura
* AP CS A
* Period 1
* September 12, 2018
* Project #1 - SixDays of Xmas
**************************************************

*/
public class SixDays {
    public static void main(String[] args){
        Verse1();
        Verse2();
        Verse3();
        Verse4();
        Verse5();
        Verse6();
    }
    //This prints the gifts for Day 1
    private static void Day1(){
        System.out.println("a partridge in a pear tree.\n");
    }
    //This prints the gifts for Day 2
    private static void Day2(){
        System.out.println("two turtle doves, and");
        Day1();
    }
    //This prints the gifts for Day 3
    private static void Day3(){
        System.out.println("three French hens,");
        Day2();
    }
    //This prints the gifts for Day 4
    private static void Day4(){
        System.out.println("four calling birds");
        Day3();
    }
    //This prints the gifts for Day 5
    private static void Day5(){
        System.out.println("five golden rings,");
        Day4();
    }
    //This prints the gifts for Day 6
    private static void Day6(){
        System.out.println("six geese a-laying");
        Day5();
    }
    //This prints the first day
    private static void Verse1(){
        System.out.println();
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
        Day1();
    }
    //This prints the second day
    private static void Verse2(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        Day2();
    }
    //This prints the third day
    private static void Verse3(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        Day3();
    }
    //This prints the fourth day
    private static void Verse4(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        Day4();
    }
    //This prints the fifth day
    private static void Verse5(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        Day5();
    }
    //This prints the sixth day
    private static void Verse6(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        Day6();
    }
}