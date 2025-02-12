package lesson8.Homework;

public class Clothing implements Product {
    private final String name;
    private final int price;

    public String getName() {
        return name;
    }

    public double getFinalPrice() {
        return price * (1 - 0.15);
    }

    Clothing(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
