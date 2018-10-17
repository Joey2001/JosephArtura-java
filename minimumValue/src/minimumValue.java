public class minimumValue {
    public static void main(String[] args) {
        System.out.println(minimum(1,23,4));
        System.out.println(minMax(1,2,3));
    }

    private static int minimum(int a, int b, int c) {
        int min = Math.min(Math.min(a,b), c);
        return min;
    }
    private static double minMax(int d, int e, int f){
        double min  = Math.min(Math.min(d,e), f);
        double max  = Math.max(Math.min(d,e), f);
        return Math.sqrt(min + max);
    }
}
