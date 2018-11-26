import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.fill;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //exercise 1
        int[] array0 = new int[8];
        //exercise 2a
        array0[0] = 1;
        array0[1] = 12;
        array0[2] = 22;
        array0[3] = 145;
        array0[4] = 123;
        array0[5] = 31;
        array0[6] = 90;
        array0[7] = 1024;
        //exercise 2b
        fill(array0, 4);
        //exercise 2c
        int[] array1 = new int[5];
        for(int i = 0; i < array1.length; i++){
            array1[i] = i + 3;
            System.out.println(array1[i]);
        }
        //exercise 2d
        System.out.println("How many elements in your list?");
        int a = scan.nextInt();
        int[] array2 = new int[a];
        for(int i = 0; i < array2.length; i++){
            System.out.println("What is the value for element " + i + "?");
            int b = scan.nextInt();
            array2[i] = b;
        }
        //exercise 2e
        int[] array3 = {-4, 19, 3, 20, 72, 58};
        //exercise 3a
        System.out.println(array2[array2.length - 1]);
//        //exercise 3b
        int middle;
        int middle2;
        if(array2.length % 2 == 0 && array2.length > 2){
            middle = (array2.length / 2) + 1;
            middle2 = (array2.length / 2) - 1;
            int midVal = (array2[middle] + array2[middle2])/2;
            System.out.println(midVal);
        }else{
            middle = array2.length / 2;
            System.out.println(array2[middle]);
        }
        //exercise 3c
        for(int i = 0; i < array2.length; i++){
            array2[i]--;
        }
        System.out.println(Arrays.toString(array2));
        //exercise 3d
        int[] even = new int[500];
        int eve = 0;
        for(int i = 0; i < (even.length * 2); i++) {
            if(i % 2 == 0) {
                even[eve] += i;
                eve++;
            }
        }
        System.out.println(Arrays.toString(even));
        //exercise 3f
        System.out.println(even[100]);
        //exercise 3g
        System.out.println(even[278] + "\n" + even[456]);
        //exercise 3h
        int[] odd = new int[5];
        int odder = 0;
        for(int i = -4; i < 6; i++) {
            if(i % 2 != 0) {
                odd[odder] += i;
                odder++;
            }
        }
        System.out.println(Arrays.toString(odd));
        //exercise 3i
        System.out.println("What is the minimum value you want to evaluate?");
        int min = scan.nextInt();
        if(min % 2 != 0)
            min--;
        System.out.println("What is the maximum value you want to evaluate?");
        int max = scan.nextInt();
        if(max % 2 != 0)
            max++;
        int range = (max - min)/2;
        int[] oddIn = new int[range];
        int oddest = 0;
        for(int i = min; i <= max; i++) {
            if(i % 2 != 0) {
                oddIn[oddest] += i;
                oddest++;
            }
        }
        System.out.println(Arrays.toString(oddIn));
    }
}
