import java.util.Scanner;
import java.util.Random;
public class Rochambeau {
    private static Random ran = new Random();
    private static Scanner human = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Do you want to play a game?");
        ran.setSeed(System.currentTimeMillis());
        while (human.next().toLowerCase().equals("y")) {
            int round = 0;
            int compPts = 0;
            int huPts = 0;
            int a;
            ran.setSeed(System.currentTimeMillis());
            while ((round < 3) && ((huPts < 2) && (compPts < 2))) {
                System.out.println("Rock, paper, or scissors?");
                String huSrg = human.next().toLowerCase();

                int randInt = ran.nextInt(3);
                System.out.println(randInt);

                if (huSrg.equals("rock")) {
                    a = 0;
                } else if (huSrg.equals("paper")) {
                    a = 1;
                } else if (huSrg.equals("scissors")) {
                    a = 2;
                } else {
                    a = 3;
                }
                System.out.println(a);
                if (a > randInt) {
                    System.out.println("You win this round.");
                    huPts++;
                    System.out.println("Human wins" + huPts);
                }else if(a == randInt){
                    System.out.println("It's a tie");
                }else {
                    System.out.println("Computer wins this round.");
                    compPts++;
                    System.out.println("Computer wins" + compPts);
                }
                round++;
            }
            System.out.println("Do you want to play again?");
        }
    }
}
