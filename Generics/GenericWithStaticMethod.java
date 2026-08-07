package Generics;

class Utils {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}

public class GenericWithStaticMethod {
    public static void main(String[] args) {
        String[] names = { "Makara", "Dara" };
        Integer[] numbers = { 1, 2, 3 };

        Utils.printArray(names);
        Utils.printArray(numbers);
    }
}
