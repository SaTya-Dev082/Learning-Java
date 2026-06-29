package OOP.OverloadOverride.Exercise;

public class SearchNumber {
 public static void contains(int target, int... numbers) {

        boolean found = false;

        for (int number : numbers) {

            if (number == target) {

                found = true;

                break;

            }

        }

        if (found) {

            System.out.println(target + " found.");

        } else {

            System.out.println(target + " not found.");

        }

    }   
}