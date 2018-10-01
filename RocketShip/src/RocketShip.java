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

    }
    public static void TopBody() {

    }
    public static void BottomBody() {

    }
    public static void line() {
        System.out.print("+");
        for(int i = 0; i < COLUMN; i++){
            System.out.print("=*");
        }
        System.out.print("+");
    }
}
