package OOP.OverloadOverride.Exercise;

public class ShoppingCart {
    static void checkout(String customerName, double... prices) {

        double total = 0;

        for (double price : prices) {

            total += price;

        }

        double average = total / prices.length;

        System.out.println("Customer: " + customerName);

        System.out.println("Items: " + prices.length);

        System.out.println("Total: $" + total);

        System.out.println("Average price: $" + average);

    }
}
