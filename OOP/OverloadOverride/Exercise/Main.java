package OOP.OverloadOverride.Exercise;

public class Main {
    // public static void main(String[] agrs){
    //     VarAgrs varAgrs=new VarAgrs();
    //     varAgrs.findMaxValue(32,45,12,88,54,23,66,23);
    // }

    public static void main(String[] args) {
        System.out.println("=====  =====");
        SumValue.sum(10, 20, 30);

        System.out.println("\n===== Calculate Student Average =====");
        CalculateStudentAverage.average("John", 90, 80, 100);
        CalculateStudentAverage.average("Alice", 70, 75);
        CalculateStudentAverage.average("Bob", 100, 95, 90, 85);

        System.out.println("\n===== Shopping Cart =====");
        ShoppingCart.checkout("David", 15.5, 20, 12.5, 50);

        System.out.println("\n===== Search Number =====");
        SearchNumber.contains(20, 10, 20, 30, 40);
        SearchNumber.contains(100, 10, 20, 30);

        System.out.println("\n===== Student Management System =====");
        StudentManagementSystem.registerStudents(
                new Student("John", 20),
                new Student("Alice", 21),
                new Student("David", 19)
        );

        System.out.println("\n===== Employee Salary Report =====");
        EmployeeSalaryReport.salaryReport(
                new Employee("John", 500),
                new Employee("David", 900),
                new Employee("Alice", 700)
        );

        System.out.println("\n===== Mini Calculator =====");
        MiniCalculator.calculate("sum", 1, 2, 3, 4);
        MiniCalculator.calculate("max", 5, 7, 2);
        MiniCalculator.calculate("min", 10, 20, 30);
        MiniCalculator.calculate("average", 50, 60, 70);

        System.out.println("\n===== Library Management System =====");
        LibraryManagementSystem.printLibrary(
                new Book("Java Programming", "James", 25),
                new Book("Python Basics", "Mike", 18),
                new Book("PHP Advanced", "David", 30)
        );

        System.out.println("\n===== Final Challenge =====");
        StudentService service = new StudentService();

        service.register(
                new RegistrationStudent(1, "John", 20, "john@gmail.com", "Phnom Penh"),
                new RegistrationStudent(2, "Alice", 21, "alice@gmail.com", "Siem Reap"),
                new RegistrationStudent(3, "David", 19, "david@gmail.com", "Battambang"),
                new RegistrationStudent(4, "Makara", 22, "john@gmail.com", "Kampot")
        );
    }

}
