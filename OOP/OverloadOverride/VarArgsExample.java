
package OOP.OverloadOverride;


public class VarArgsExample {

    static void printNumbers(int... numbers) {
        System.out.println("Total numbers: " + numbers.length);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    static void printNumbers(String title, int... numbers){
        System.out.print("The title is "+title+" and the number is ");
        for (int number : numbers){
            System.out.print(number+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers();
        printNumbers(10);
        printNumbers(10, 20, 30);
        printNumbers(1, 2, 3, 4, 5);
        printNumbers("Array Numbers",10,20,30,40);
    }
}