package Generics;

class Calculator<T extends Number> {
    private T number1;
    private T number2;

    public Calculator(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double sum() {
        return number1.doubleValue() + number2.doubleValue();
    }
}

public class BoundedDemo {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(10, 20);
        Calculator<Double> doubleCalc = new Calculator<>(5.5, 4.5);

        System.out.println(intCalc.sum());
        System.out.println(doubleCalc.sum());

        // Calculator<String> wrong = new Calculator<>("A", "B"); // Error
    }
}