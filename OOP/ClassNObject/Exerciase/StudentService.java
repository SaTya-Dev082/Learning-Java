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
            Student student = new Student();
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
             student.setAge(age);
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter student address: ");
            String address = scanner.nextLine();
             student.setAddress(address);
            System.out.print("Enter student gmail: ");
            String gmail = scanner.nextLine();
            student.setGmail(gmail);
            students[i] = student;
        }
        return students;
    }

    public void displayStudent(Student student) {
        System.out.println("Name: " + student.getName()+" ; Age: " + student.getAge()+" ; Address: " + student.getAddress()+" ; Gmail: " + student.getGmail());

    }
    public void displayMoreStudent(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(" Student [" + (i + 1) + "]: Name: " + students[i].getName() + " ; Age: " + students[i].getAge() + " ; Address: " + students[i].getAddress() + " ; Gmail: " + students[i].getGmail());
        }
    }
}
