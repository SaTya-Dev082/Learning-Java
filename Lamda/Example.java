package Lamda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Example {
    public static void main(String[] args) {
            List<Product> products = List.of(
                    new Product("Phone", 500),
                    new Product("Mouse", 20),
                    new Product("Laptop", 900)
            );

            Predicate<Product> expensiveProduct = product -> product.price >= 100;

            Function<Product, String> productLabel =
                    product -> product.name + " costs $" + product.price;

            products.stream()
                    .filter(expensiveProduct)
                    .map(productLabel)
                    .forEach(label -> System.out.println(label));
        }
}
