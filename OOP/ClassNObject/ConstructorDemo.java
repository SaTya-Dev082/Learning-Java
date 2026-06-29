package OOP.ClassNObject;

public class ConstructorDemo {
    
}
class Person {

    String name;

    int age;

    // Constructor

    Person(String name, int age) {

        this.name = name;

        this.age = age;

    }

    void showInfo() {

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

    }

}

class Product {

    String name;

    double price;

    int quantity;

    Product(String name, double price, int quantity) {

        this.name = name;

        this.price = price;

        this.quantity = quantity;

    }

    double getTotal() {

        return price * quantity;

    }

    void showProduct() {

        System.out.println("Product: " + name);

        System.out.println("Price: $" + price);

        System.out.println("Quantity: " + quantity);

        System.out.println("Total: $" + getTotal());

    }

}

class BankAccount {

    String accountName;

    double balance;

    BankAccount(String accountName, double balance) {

        this.accountName = accountName;

        if (balance < 0) {

            this.balance = 0;

        } else {

            this.balance = balance;

        }

    }

    void deposit(double amount) {

        balance += amount;

    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

        } else {

            System.out.println("Not enough balance");

        }

    }

    void showBalance() {

        System.out.println("Account Name: " + accountName);

        System.out.println("Balance: $" + balance);

    }

}

class Student {

    int id;

    String name;

    int age;

    String gmail;

    Student(int id, String name, int age, String gmail) {

        this.id = id;

        this.name = name;

        this.age = age;

        this.gmail = gmail;

    }

    void showStudent() {

        System.out.println("ID: " + id);

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("Gmail: " + gmail);

    }

}

class Employee {

    String name;

    double salary;

    // Constructor 1

    Employee(String name) {

        this.name = name;

        this.salary = 300;

    }

    // Constructor 2: constructor overloading

    Employee(String name, double salary) {

        this.name = name;

        this.salary = salary;

    }

    void showEmployee() {

        System.out.println("Employee: " + name);

        System.out.println("Salary: $" + salary);

    }

}