package OOP.OverloadOverride.Exercise;

class StudentA {
    String name;
    int age;

    StudentA(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentManagementSystem {
    static void registerStudents(StudentA... students) {
        int totalAge = 0;
        StudentA oldest = students[0];
        StudentA youngest = students[0];

        System.out.println("===== Student List =====");

        for (int i = 0; i < students.length; i++) {
            StudentA student = students[i];

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