package OOP.OverloadOverride.Exercise;

public class SumValue {
    static void sum(int... numbers) {

        int total = 0;

        for (int number : numbers) {

            total += number;

        }

        System.out.println("Sum = " + total);

    }
}
