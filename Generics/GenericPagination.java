package Generics;

import java.util.List;

class PageResponse<T> {
    private List<T> items;
    private int page;
    private int limit;
    private int total;

    public PageResponse(List<T> items, int page, int limit, int total) {
        this.items = items;
        this.page = page;
        this.limit = limit;
        this.total = total;
    }

    public void print() {
        System.out.println("Page: " + page);
        System.out.println("Limit: " + limit);
        System.out.println("Total: " + total);
        System.out.println("Items: " + items);
    }
}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}



public class GenericPagination {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Phone"),
                new Product("Laptop"),
                new Product("Mouse"));

        PageResponse<Product> productPage = new PageResponse<>(products, 1, 10, 3);

        productPage.print();
    }
}
