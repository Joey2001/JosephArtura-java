public class DrawBox {

    public static void main(String[] args){
        int a = 1;
        int b = 1;

        drawBox(a,b);
        if((a*b) == 1){
                System.out.println("\nYou have printed " + (a*b) + " box!");
        }
        System.out.println("\nYou have printed " + (a*b) + " boxes!");
    }
    private static void drawBox(int columns, int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("+--------+\t");
            }

            System.out.println();

            for (int j = 0; j < columns; j++) {
                System.out.print("|        |\t");
            }

            System.out.println();

            for (int j = 0; j < columns; j++) {
                System.out.print("|        |\t");
            }

            System.out.println();

            for (int j = 0; j < columns; j++) {
                System.out.print("+--------+\t");
            }
            System.out.println();
        }
    }
}
