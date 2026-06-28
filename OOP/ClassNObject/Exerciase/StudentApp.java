package OOP.ClassNObject.Exerciase;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scan = new Scanner(System.in);

        
        // studentService.displayStudent(student);

        System.out.print("Enter the number of students: ");
        int numberOfStudents=scan.nextInt();
        Student[] students = studentService.createMoreStudent(numberOfStudents);
        System.out.println("Student Details:");
        studentService.displayMoreStudent(students);

    }
}
