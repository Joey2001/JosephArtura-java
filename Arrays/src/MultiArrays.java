import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        //exercise 1
        double[] arrayDoub = new double[1028];
        //exercise 2
        int[][] multiArray = new int[5][4];
        //exercise 3
        String[][] studentSeating = new String[6][4];
        //exercise 4
        /*
           0   1   2   3
        0 ""  ""  ""  ""
        1 ""  ""  ""  ""
        2 ""  ""  ""  ""
        3 ""  ""  ""  ""
        4 ""  ""  ""  ""
        5 ""  ""  ""  ""
        */
        //exercise 5
        studentSeating[0][0] = "Kele";
        studentSeating[0][1] = "Drew";
        studentSeating[0][2] = "Daniel";
        studentSeating[0][3] = "Gabe";
        studentSeating[1][0] = "Jade";
        studentSeating[1][1] = "Connor";
        studentSeating[1][2] = "Allen";
        studentSeating[1][3] = "Grace";
        studentSeating[2][0] = "Frank";
        studentSeating[2][1] = "";
        studentSeating[2][2] = "Sean";
        studentSeating[2][3] = "Billy";
        studentSeating[3][0] = "Nick";
        studentSeating[3][1] = "Matthew T.";
        studentSeating[3][2] = "Joey";
        studentSeating[3][3] = "Jackson";
        studentSeating[4][0] = "Eric";
        studentSeating[4][1] = "Hunter";
        studentSeating[4][2] = "Gavin";
        studentSeating[4][3] = "Nick";
        studentSeating[5][0] = "Matthew V.";
        studentSeating[5][1] = "Issac";
        studentSeating[5][2] = "Bob";
        studentSeating[5][3] = "Joe";
        //exercise 6
        System.out.println(studentSeating[2][3]);
        //exercise 7
        studentSeating[2][1] = "The teacher's seat";
        //exercise 8
        String temp = studentSeating[3][2];
        studentSeating[3][2] = studentSeating[1][2];
        studentSeating[1][2] = temp;
        //exercise 9
        int[][] pernilTemp = new int[10][2];
        //exercise 10
        String[][] chess = new String[8][8];
        Arrays.fill(chess[1], 0, 8, "pawn");
        Arrays.fill(chess[6], 0, 8, "pawn");
        //exercise 11
        int[][] data = new int[4][7];
        for(int i = 2; i < 3; i++){
            for(int j = 0; j < data[i].length; j++){
                data[i][j] = j;
            }
        }
        //exercise 12
        int[][] matrix = new int[6][8];
        int[] tmp = new int[matrix[0].length];
        int[] tmp2 = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j == 1){
                    tmp[i] = matrix[i][j];
                }
                if(j == 4){
                    tmp2[i] = matrix[i][j];
                    matrix[i][j] = tmp[i];
                    matrix[i][1] = tmp2[i];
                }
            }
        }
        //exercise 13
        int[][] numbers = {{3, 4, 5, 6}, {4, 5, 6, 7}, {5, 6, 7, 8}};
        mystery(numbers);
        //the method mystery prints: {{4, 5, 6}, {5, 6, 7}, {6, 7, 8}}
        //exercise 14
        /*
        * 0 1   2   3   4   5   6
        * 1 1   2   3   4   5   6
        * 2 2   4   6   8   10  12
        * 3 3   6   9   12  15  18
        * 4 4   8   12  16  20  24
        * 5 5   10  15  20  25  30
        * 6 6   12  18  24  30  36
        * */
        //initializes the list
        int[][] multiply = new int[10][12];
        //first for loop controls which array we are inside the 2 dimension array
        for(int i = 0; i < multiply.length; i++){
            //second for loop controls which element we are inside of the array
            for(int j = 0; j < multiply[i].length; j++){
                //assigns the specific element to a numerical value that is found through i and j
                multiply[i][j] = (i + 1)*(j + 1);
            }
        }
        //exercise 15
        int[] tmps = new int[matrix[0].length];
        int[] tmps2 = new int[matrix[0].length];
        for(int i = 0; i < multiply.length; i++){
            for(int j = 0; j < multiply[i].length; j++){
                if(j == 2){
                    tmps[i] = multiply[i][j];
                }
                if(j == 6){
                    tmps2[i] = multiply[i][j];
                    multiply[i][j] = tmps[i];
                    multiply[i][2] = tmps2[i];
                }
            }
        }
    }
    public static void mystery(int[] [] a){
        int len = a[0].length - 1;
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < len; c++){
                if (a[r][c + 1] > a[r][c]){
                    a[r][c] =a[r][c+1];
                }
            }
        }
    }
}
