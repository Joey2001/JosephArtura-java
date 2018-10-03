public class RocketShip {
    private static final int COLUMN = 7;
    public static void main(String[] args) {
        Cone();
        line();
        TopHalf();
        BottomHalf();
        line();
        BottomHalf();
        TopHalf();
        line();
        Cone();
    }
    private static void Cone() {
        for (int y = 1; y < COLUMN * 2; y++) {
            for (int i = COLUMN * 2; i > y; i--) {
                System.out.print(' ');
            }
            for (int j = 0; j < y; j++) {
                System.out.print('/');
            }
            System.out.print("**");
            for (int k = 0; k < y; k++) {
                System.out.print('\\');
            }
            System.out.println();
        }
    }
    private static void line() {
        System.out.print("+");
        for(int i = 0; i < COLUMN * 2; i++){
            System.out.print("=*");
        }
        System.out.println("+");
    }
    private static void TopHalf() {
        for (int y = 0; y < COLUMN; y++) {
            System.out.print("|");
            for(int l = 0; l < 2; l++) {
                for (int i = COLUMN - 1; i > y; i--) {
                    System.out.print('.');
                }
                for (int j = 0; j <= y; j++) {
                    System.out.print("/\\");
                }
                for (int i = COLUMN - 1; i > y; i--) {
                    System.out.print('.');
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
    private static void BottomHalf() {
        for (int y = 0; y < COLUMN; y++) {
            System.out.print("|");
            for(int l = 0; l < 2; l++) {
                for (int i = 0; i < y; i++) {
                    System.out.print('.');
                }
                for (int j = COLUMN; j > y; j--) {
                    System.out.print("\\/");
                }
                for (int i = 0; i < y; i++) {
                    System.out.print('.');
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
}