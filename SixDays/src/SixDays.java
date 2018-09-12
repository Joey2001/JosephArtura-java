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
        System.out.println();
        Verse1();
        Day1();
        Verse2();
        Day2();
        Verse3();
        Day3();
        Verse4();
        Day4();
        Verse5();
        Day5();
        Verse6();
        Day6();
    }
    //This prints the gifts for Day 1
    public static void Day1(){
        System.out.println("a partridge in a pear tree.\n");
    }
    //This prints the gifts for Day 2
    public static void Day2(){
        System.out.println("two turtle doves, and");
        Day1();
    }
    //This prints the gifts for Day 3
    public static void Day3(){
        System.out.println("three French hens,");
        Day2();
    }
    //This prints the gifts for Day 4
    public static void Day4(){
        System.out.println("four calling birds");
        Day3();
    }
    //This prints the gifts for Day 5
    public static void Day5(){
        System.out.println("five golden rings,");
        Day4();
    }
    //This prints the gifts for Day 6
    public static void Day6(){
        System.out.println("six geese a-laying");
        Day5();
    }
    //This prints the first day
    public static void Verse1(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
    }
    //This prints the second day
    public static void Verse2(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
    }
    //This prints the third day
    public static void Verse3(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
    }
    //This prints the fourth day
    public static void Verse4(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
    }
    //This prints the fifth day
    public static void Verse5(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
    }
    //This prints the sixth day
    public static void Verse6(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
    }
}