package Lamda;

import java.util.List;

public class Lamda {
    public static void main(String[] args) {
        List<String> names = List.of("Makara", "Dara", "Sokha");

        // 1. Old style
        for (String name : names) {
            System.out.println(name);
        }

        // 2. New style
        names.forEach(name -> System.out.println(name));
    }
}