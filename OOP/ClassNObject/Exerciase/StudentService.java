package OOP.ClassNObject.Exerciase;

import java.util.Scanner;

public class StudentService {
    Student student=new Student();

    Scanner scanner=new Scanner(System.in);

    public Student createStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter student address: ");
        String address = scanner.nextLine();
        System.out.print("Enter student gmail: ");
        String gmail = scanner.nextLine();
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        student.setGmail(gmail);
        return student;
    }

    public Student[] createMoreStudent(int numberOfStudents) {
        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter student address: ");
            String address = scanner.nextLine();
            System.out.print("Enter student gmail: ");
            String gmail = scanner.nextLine();
            student.setName(name);
            student.setAge(age);
            student.setAddress(address);
            student.setGmail(gmail);
            students[i] = student;
        }
        return students;
    }
}
