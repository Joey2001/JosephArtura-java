public class ThreeBoxes{
    public static void main(String[] args) {
        Symbol(3, 4, '*');
        Symbol(2, 5, '$');
        Symbol(1, 6, '#');
    }

    private static void Symbol(int rows, int columns, char character) {
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++)
                System.out.print(character);
            System.out.println();
        }
    }
}