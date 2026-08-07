package Generics;

import java.util.List;

class Animal {
    public void eat() {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class UpperBoundedWildcard {
    public static void feedAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat());

        feedAnimals(dogs);
        feedAnimals(cats);
    }
}
