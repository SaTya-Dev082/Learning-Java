package LambdaDemo;

import java.util.function.Supplier;

public class SuplierDemo {
    public static void main(String[] args) {

        Supplier<String> messageSupplier =

                () -> "Hello from Supplier";

        String message = messageSupplier.get();

        System.out.println(message);

    }
}
