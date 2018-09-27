public class PractiveProject {
    private static final int COLUMNS = 5;
    private static final int ROWS = 4;
    public static void main(String[] args) {
        Star();
        Dollar();
        Pound();
    }

    private static void Star() {
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void Dollar() {
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
    private static void Pound() {
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
