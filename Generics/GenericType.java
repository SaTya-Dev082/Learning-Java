package Generics;

class Box<T>{
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void showType() {
        System.out.println("Value: " + value);
        System.out.println("Type: " + value.getClass().getSimpleName());
    }
}
public class GenericType {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello Java");
        Box<Integer> intBox = new Box<>(100);
        Box<Double> doubleBox = new Box<>(99.99);

        stringBox.showType();
        intBox.showType();
        doubleBox.showType();
    }
}
