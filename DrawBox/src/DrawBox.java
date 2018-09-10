public class DrawBox {

    public static void main(String[] args){
        int a = 1000;
        int b = 1000;

        drawBox(a,b);
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
