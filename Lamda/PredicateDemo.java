package Lamda;
import java.util.function.Predicate;


public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = number -> number > 0;

        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-5));
    }
}