public class ChallengeTwo {
    public static int x = 0;
    public static void main(String[] args) {
        Star();
    }
    public static void Star(){
        System.out.println("*");
        if(x<125){
            Star();
            x++;
        }
    }
}