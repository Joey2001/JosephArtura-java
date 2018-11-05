public class Quadrant {
    public static void main(String[] args) {
        System.out.println(quadrant(1,1));
        System.out.println(quadrant(-1,1));
        System.out.println(quadrant(1,-1));
        System.out.println(quadrant(-1,-1));
        System.out.println(quadrant(0,0));
        System.out.println(quadrant(0,1));
        System.out.println(quadrant(1,0));
    }
    public static String quadrant(int x, int y){
        if(x > 0){
            if(y > 0){
                return "Quadrant 1";
            }else if (y == 0) {
                return "On the x-axis";
            }else{
                return "Quadrant 2";
            }
        }else if(x <= 0){
            if(y < 0) {
                return "Quadrant 3";
            }else if(x == 0){
                if (y == 0) {
                    return "You are on the origin";
                }else {
                    return "On the y-axis";
                }
            }else{
                return "Quadrant 4";
            }
        }else{
            return null;
        }
    }
}
