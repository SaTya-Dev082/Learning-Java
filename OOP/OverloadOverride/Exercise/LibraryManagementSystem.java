package OOP.OverloadOverride.Exercise;

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class LibraryManagementSystem {
    static void printLibrary(Book... books) {
        double totalPrice = 0;
        Book mostExpensive = books[0];
        Book cheapest = books[0];

        System.out.println("========= Library =========");
        System.out.println();

        for (Book book : books) {
            System.out.println(book.title);
            System.out.println("Author : " + book.author);
            System.out.println("Price : $" + book.price);
            System.out.println();

            totalPrice += book.price;

            if (book.price > mostExpensive.price) {
                mostExpensive = book;
            }

            if (book.price < cheapest.price) {
                cheapest = book;
            }
        }

        double averagePrice = totalPrice / books.length;

        System.out.println("Total Books : " + books.length);
        System.out.println("Most Expensive : " + mostExpensive.title);
        System.out.println("Cheapest : " + cheapest.title);
        System.out.printf("Average Price : $%.2f\n", averagePrice);
    }
}

