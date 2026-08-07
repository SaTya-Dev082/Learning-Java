package Generics;

import java.util.List;

public class WildCardGeneric {
    public static void printList(List<?> items) {
            for (Object item : items) {
                System.out.println(item);
            }
        }

        public static void main(String[] args) {
            List<String> names = List.of("Makara", "Dara");
            List<Integer> numbers = List.of(10, 20, 30);

            printList(names);
            printList(numbers);
        }
}
