package OOP.ClassNObject.Exerciase;

public class StudentApp {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = studentService.createStudent();

        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Gmail: " + student.getGmail());
    }
}
