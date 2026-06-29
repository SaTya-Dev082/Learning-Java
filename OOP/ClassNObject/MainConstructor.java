package OOP.ClassNObject;

public class MainConstructor {
    public static void main(String[] args) {

        System.out.println("===== Practice 1: Person Constructor =====");

        Person person = new Person("John", 20);

        person.showInfo();

        System.out.println("\n===== Practice 2: Product Constructor =====");

        Product product = new Product("Keyboard", 25.5, 2);

        product.showProduct();

        System.out.println("\n===== Practice 3: Bank Account Constructor =====");

        BankAccount account = new BankAccount("David", 100);

        account.deposit(50);

        account.withdraw(30);

        account.showBalance();

        System.out.println("\n===== Practice 4: Student Constructor =====");

        Student student = new Student(1, "Alice", 21, "alice@gmail.com");

        student.showStudent();

        System.out.println("\n===== Practice 5: Constructor Overloading =====");

        Employee employee1 = new Employee("John");

        Employee employee2 = new Employee("David", 900);

        employee1.showEmployee();

        System.out.println();

        employee2.showEmployee();

    }
}
