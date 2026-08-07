package Generics;

import java.util.ArrayList;
import java.util.List;

class Animal {
}

class Dog extends Animal {
    public String toString() {
        return "Dog";
    }
}


public class LowerBoundedWildcard {
    public static void addDogs(List<? super Dog> animals) {
        animals.add(new Dog());
        animals.add(new Dog());
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        addDogs(animals);

        System.out.println(animals);
    }
}
