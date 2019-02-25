public class test {
    public static void main(String[] args) {
        Sandwich clubSandwich = new Sandwich(2.75, "Club Sandwich");
        Sandwich burger = new Sandwich(2.75, "Cheese Burger");
        Salad coleSlaw = new Salad(1.25, "Cole Slaw");
        Salad spinach = new Salad(1.25, "Spinach Salad");
        Drink coffee = new Drink(3.50, "Cappuccino");
        Drink soda = new Drink(1.25, "Orange Soda");
        Trio tri1 = new Trio(clubSandwich, spinach, coffee);
        Trio tri2 = new Trio(burger, coleSlaw, soda);
        System.out.println(tri1.toString());
        System.out.println(tri2.toString());
    }
}
