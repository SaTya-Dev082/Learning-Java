package OOP.OverloadOverride.Exercise;

public class MiniCalculator {
    static void calculate(String operation, int... numbers) {
        switch (operation) {
            case "sum":
                int sum = 0;

                for (int number : numbers) {
                    sum += number;
                }

                System.out.println("Sum = " + sum);
                break;

            case "max":
                int max = numbers[0];

                for (int number : numbers) {
                    if (number > max) {
                        max = number;
                    }
                }

                System.out.println("Max = " + max);
                break;

            case "min":
                int min = numbers[0];

                for (int number : numbers) {
                    if (number < min) {
                        min = number;
                    }
                }

                System.out.println("Min = " + min);
                break;

            case "average":
                int total = 0;

                for (int number : numbers) {
                    total += number;
                }

                double average = (double) total / numbers.length;

                System.out.println("Average = " + average);
                break;

            default:
                System.out.println("Invalid operation");
        }
    }
}
