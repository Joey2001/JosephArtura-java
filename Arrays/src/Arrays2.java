import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] money = {7, 3, 1100, 49};
        int[] array = {-10, -2, 4, -4, 9, -5, 19, -7, 39};
        int[] a = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 7};
        exercise1A(money);
        for (int x : money) {
            System.out.println(x);
        }
        System.out.println(average(array));
        System.out.println(max(money));
        exercise1B();
        exercise1C();
        System.out.println(mode(a));
        System.out.println(Arrays.toString(exercise1B()));
        System.out.println(Arrays.toString(exercise2(exercise1B())));
        System.out.println(range(money));
    }

    private static void exercise1A(int[] m) {
        for (int i = 0; i < m.length; i++) {
            m[i] *= 2;
        }
        //The array of the method is:
        //{14, 6, 2200, 98}
    }

    private static int[] exercise1B() {
        int[] numbers = new int[8];
        numbers[1] = 4;
        numbers[2] = 99;
        numbers[3] = 2;
        int x = numbers[1];
        numbers[x] = 44;
        numbers[numbers[7]] = 11;
        return numbers;
        //The array of the method is:
        //[11, 4, 99, 2, 44, 0, 0, 0]
    }

    private static void exercise1C() {
        int[] data = new int[8];
        data[0] = 3;
        data[7] = -18;
        data[4] = 5;
        data[1] = data[0];
        int x = data[4];
        data[4] = 6;
        data[x] = data[0] * data[1];
        //The array of the method is:
        //[3, 3, 0, 0, 6, 9, 0, -18]
    }

    //exercise 1d
    private static int max(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    //exercise 1e
    private static double average(int[] a) {
        int b = 0;
        for (int i : a) {
            b += i;
        }
        return (b / a.length);
    }

    //exercise 3
    private static double range(int[] array) {
        int min = array[0];
        int max = array[array.length - 1];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return (max - min) / 2;
    }

    //exercise 2a-c
    private static int[] exercise2(int[] single) {
        int[] tmp = new int[2 * single.length];
        for (int i = 0; i < tmp.length; i++) {
            if (i < 4) {
                Arrays.fill(tmp, i, i + 1, single[i]);
            } else {
                Arrays.fill(tmp, i, i + 1, 42);
            }
        }
        return tmp;
    }
    //exercise 4
    private static int mode(int[] a) {
        Arrays.sort(a);
        return getMostPopularElement(a);
    }
    private static int getMostPopularElement(int[] a) {
        int maxElementIndex = getArrayMaximumElementIndex(a);
        int[] b = new int[a[maxElementIndex] + 1];
        for (int anA : a) {
            ++b[anA];
        }
        return getArrayMaximumElementIndex(b);
    }

    private static int getArrayMaximumElementIndex(int[] a) {
        int maxElementIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] >= a[maxElementIndex]) {
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }
}
