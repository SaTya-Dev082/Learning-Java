package Generics;

import java.util.Arrays;

public class ReturnType {
    static <T> String show(String data) {

        return data;
    }

    static <T> T getFirst(T[] items) {

        return items[0];
    }

    static <T> T[] getAll(T[] allItems) {
        return allItems;
    }

    public static void main(String[] agrs) {
        String result = show("Return Type");
        System.out.println(result);

        System.out.println("===================");

        String[] names = { "Satya", "Norak", "Mega" };
        Integer[] numbers = { 15, 82, 66 };

        System.out.println(getFirst(names));
        System.out.println(getFirst(numbers));
        System.out.println("==================");
        String[] allNames = getAll(names);

        Integer[] allNumbers = getAll(numbers);

        System.out.println(Arrays.toString(allNames));

        System.out.println(Arrays.toString(allNumbers));
    }
}
