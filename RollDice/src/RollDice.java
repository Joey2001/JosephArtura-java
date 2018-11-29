import java.lang.reflect.Array;
import java.util.Scanner;
public class RollDice {
    public static int DICENUM = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Want to play a game? (Y or N)");
        String contin = input.next();
        int count = 0;
        while (contin.toLowerCase() == "y") {
            rollDice();
            System.out.println("Roll Dice");
            printDice();
            System.out.println("Print Dice");
            drawLine();
            System.out.println("Draw Line");
            count++;
            System.out.println("Do you want to play again? (Y or N)");
            contin = input.next();
        }
        if (count == 1) {
            System.out.println("You have rolled once.");
        } else {
            System.out.println("You have rolled " + count + " times.");
        }
    }

    public static void defineDice() {

    }

    public static void rollDice() {

    }

    public static void printDice() {

    }

    public static void drawLine() {

    }
}