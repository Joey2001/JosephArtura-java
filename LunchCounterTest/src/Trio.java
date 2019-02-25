public class Trio implements MII{
    private Sandwich sandwich;
    private Drink drink;
    private Salad salad;
    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich = sandwich;
        this.drink = drink;
        this.salad = salad;
    }

    public double getPrice(){
        double leastExpensive = Math.min(Math.min(drink.getPrice(),sandwich.getPrice()),  salad.getPrice());
        double twoItems;
        if(sandwich.getPrice() == leastExpensive){
            twoItems = salad.getPrice() + drink.getPrice();
        } else if (salad.getPrice() == leastExpensive){
            twoItems = sandwich.getPrice() + drink.getPrice();
        } else{
            twoItems = salad.getPrice() + sandwich.getPrice();
        }
        return twoItems;
    }

    public String getName(){
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
    }

    public String toString(){
        return getPrice() + "\n" + getName();
    }
}
