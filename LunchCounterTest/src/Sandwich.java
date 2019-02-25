public class Sandwich implements MII{

    private double price;
    private String name;

    public Sandwich(double price, String name){
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString(){
        return getPrice() + "\n" + getName();
    }
}
