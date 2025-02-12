package lesson8.Homework;

public class Food implements Product {
    private final String name;
    private final int price;

    public String getName() {
        return name;
    }

    public double getFinalPrice() {
        return price;
    }

    Food(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
