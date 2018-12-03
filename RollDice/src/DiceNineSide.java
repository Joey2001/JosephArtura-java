import java.util.Scanner;
public class DiceNineSide {
    private static int DICENUM = 10;
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        String play = "yes";
        String[][] setOfDice = constructDice();
        while (play.equalsIgnoreCase("yes")){
            printDice(constructDice());
            String[][] diceSet = new String[DICENUM][DICENUM];
            for(int i = 1; i <= DICENUM; i++){
                int roll = (int) Math.round(Math.random() * (constructDice().length - 1));
                diceSet[i - 1] = setOfDice[roll];
            }
            printDice(diceSet);
            count++;
            System.out.println("Do you want to play again?");
            play = in.next();
            line();
        }
        if(count == 1)
            System.out.println("You rolled once.");
        if(count > 1)
            System.out.println("You have rolled " + count + " times.");
    }
    private static String[][] constructDice(){
        String topBot = " --------- ";
        String E =      "|         |";
        String M1 =     "|    *    |";
        String M2 =     "|  *   *  |";
        String L1 =     "|  *      |";
        String R1 =     "|      *  |";
        String M3 =     "| *  *  * |";
        String[] One = {topBot, E, M1, E, topBot};
        String[] Two = {topBot, E, M2, E, topBot};
        String[] Three = {topBot, L1, M1, R1, topBot};
        String[] Four = {topBot, M2, E, M2, topBot};
        String[] Five = {topBot, M2, M1, M2, topBot};
        String[] Six = {topBot, M2, M2, M2, topBot};
        String[] Seven = {topBot, M2, M3, M2, topBot};
        String[] Eight = {topBot, M3, M2, M3, topBot};
        String[] Nine = {topBot, M3, M3, M3, topBot};

        return new String[][]{One, Two, Three, Four, Five, Six, Seven, Eight, Nine};
    }
    private static void printDice(String[][] allDice){
        for(int dice = 0; dice < allDice[0].length; dice++){
//            for (int side = 0; side < allDice.length; side++)
//                System.out.print(allDice[side][dice] + "\t");
            for (String[] anAllDice : allDice)
                System.out.print(anAllDice[dice] + "\t");
            System.out.println();
        }
    }
    private static void line(){
        for(int i = 0; i < 14 * DICENUM; i++)
            System.out.print("-");
        System.out.println();
    }
}