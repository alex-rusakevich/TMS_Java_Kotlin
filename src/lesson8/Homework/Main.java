package lesson8.Homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Electronics("IPhone", 1000),
                new Clothing("Nike", 300),
                new Food("Crisps", 2)
        );

        for(Product product : products) {
            System.out.printf("%s: %.2f\n", product.getName(), product.getFinalPrice());
        }
    }
}
