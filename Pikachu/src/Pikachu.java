public class Pikachu {
    public static void main(String[] args){
        String Pikachu = "  (\\__/)\n  (*^.^)\nz(_\")(\")";

        String Pikachu1 = "  (\\__/)";
        String Pikachu2 = "  (*^.^)";
        String Pikachu3 = "z(_\")(\")";

        int Pika = 3;
        int Puka = 3;

        for(int j = 0; j < Puka; j++) {
            for (int i = 0; i < Pika; i++) {
                System.out.print(Pikachu1);
            }
            System.out.println();
            for (int i = 0; i < Pika; i++) {
                System.out.print(Pikachu2);
            }
            System.out.println();
            for (int i = 0; i < Pika; i++) {
                System.out.print(Pikachu3);
            }
            System.out.println();
        }
        System.out.println("There have been " + (Pika * Puka) + " Pikachus printed");
    }
}
