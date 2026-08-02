package Lamda;

import java.util.ArrayList;
import java.util.List;

public class ObjectSorting {
    



public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Phone", 500));
        products.add(new Product("Laptop", 900));
        products.add(new Product("Mouse", 20));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        products.forEach(product -> System.out.println(product));
    }
}

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - $" + price;
    }
}
