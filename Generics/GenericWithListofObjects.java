package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericWithListofObjects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Makara", 90));
        students.add(new Student("Dara", 85));
        students.add(new Student("Sokha", 95));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return name + " - " + score;
    }
}

