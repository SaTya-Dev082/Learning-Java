package Inheritance;

// Definition:
// Inheritance គឺ class មួយយក property/method ពី parent class។

// Where use:
// ពេល class ច្រើនមាន common field/method ដូចគ្នា។

// When use:
// ពេលមាន relationship “is-a”។
// Example: Student is a Person, Teacher is a Person.

public class InheritanceDemo {
    public static void main(String[] args) {

        Student student = new Student("Makara", 20, "Java Class");

        student.showInfo();

        student.study();

    }
}


class Person {

    protected String name;

    protected int age;

    public Person(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public void showInfo() {

        System.out.println(name + " - " + age);

    }

}

class Student extends Person {

    private String className;

    public Student(String name, int age, String className) {

        super(name, age);

        this.className = className;

    }

    public void study() {

        System.out.println(name + " is studying in " + className);

    }

}