public class RocketShip {
    public static final int COLUMN = 6;
    public static void main(String[] args) {
        Cone();
        line();
        TopBody();
        BottomBody();
        line();
        BottomBody();
        TopBody();
        line();
        Cone();
    }
    public static void Cone() {
        for(int i = 1; i < COLUMN; i++){
            for(int j = i; j < COLUMN; j++){
                System.out.print(" ");
            }
            for(int k = 1; k < i; k++){
                System.out.print("/");
            }
            if(i != 1){
                System.out.print("**");
            }
            for(int l = 1; l < i; l++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
    public static void TopBody() {

    }
    public static void BottomBody() {

    }
    public static void line() {
        System.out.print("+");
        for(int i = 0; i < COLUMN-1; i++){
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }
}
