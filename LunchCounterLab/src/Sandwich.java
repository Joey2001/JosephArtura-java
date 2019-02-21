public class Sandwich implements MII {
    private double price;
    private String name;
    public Sandwich(double price, String name){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
