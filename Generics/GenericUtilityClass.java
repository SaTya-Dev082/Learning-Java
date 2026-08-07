package Generics;

class Validator<T> {
    public boolean isNull(T value) {
        return value == null;
    }

    public boolean isNotNull(T value) {
        return value != null;
    }
}


public class GenericUtilityClass {
    public static void main(String[] args) {
        Validator<String> stringValidator = new Validator<>();
        Validator<Integer> intValidator = new Validator<>();

        System.out.println(stringValidator.isNull("null"));
        System.out.println(stringValidator.isNotNull("Makara"));
        System.out.println(intValidator.isNotNull(100));
    }
}
