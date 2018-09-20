public class ChallengeOne {
    public static int x = 0;
    public static void main(String[] args){
        TenThousand();
    }
    public static void TenThousand(){
        System.out.println("*");
        if(x<10000){
            TenThousand();
        }
    }
}