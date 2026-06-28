
package OOP.OverloadOverride;


public class VarArgsExample {

    static void printNumbers(int... numbers) {
        System.out.println("Total numbers: " + numbers.length);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printNumbers();
        printNumbers(10);
        printNumbers(10, 20, 30);
        printNumbers(1, 2, 3, 4, 5);
    }
}