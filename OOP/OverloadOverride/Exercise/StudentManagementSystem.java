package OOP.OverloadOverride.Exercise;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentManagementSystem {
    static void registerStudents(Student... students) {
        int totalAge = 0;
        Student oldest = students[0];
        Student youngest = students[0];

        System.out.println("===== Student List =====");

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];

            System.out.println((i + 1) + ". " + student.name + " (" + student.age + ")");

            totalAge += student.age;

            if (student.age > oldest.age) {
                oldest = student;
            }

            if (student.age < youngest.age) {
                youngest = student;
            }
        }

        int averageAge = totalAge / students.length;

        System.out.println();
        System.out.println("Total Students: " + students.length);
        System.out.println("Average Age: " + averageAge);
        System.out.println("Oldest Student: " + oldest.name);
        System.out.println("Youngest Student: " + youngest.name);
    }
}