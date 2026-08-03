package Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaWithSorting {
    static Comparator<Integer> com = (a, b) -> a - b;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(62);
        num.add(32);
        num.add(22);
        num.add(82);

        names.add("Sokha");
        names.add("Makara");
        names.add("Dara");

        // names.sort((a, b) -> com(a,b));
        Collections.sort(num, com);
        System.out.println(num);

        System.out.println(names);
    }
}
