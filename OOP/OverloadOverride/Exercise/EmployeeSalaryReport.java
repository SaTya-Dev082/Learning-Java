package OOP.OverloadOverride.Exercise;


class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class  EmployeeSalaryReport{
    static void salaryReport(Employee... employees) {
        double totalSalary = 0;
        Employee highest = employees[0];
        Employee lowest = employees[0];

        System.out.println("Employee Report");
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee.name + " : $" + employee.salary);

            totalSalary += employee.salary;

            if (employee.salary > highest.salary) {
                highest = employee;
            }

            if (employee.salary < lowest.salary) {
                lowest = employee;
            }
        }

        double averageSalary = totalSalary / employees.length;

        System.out.println();
        System.out.println("Highest Salary : " + highest.name);
        System.out.println("Lowest Salary : " + lowest.name);
        System.out.println("Average Salary : $" + averageSalary);
        System.out.println("Total Salary : $" + totalSalary);
        System.out.println("Employee Count : " + employees.length);
    }
}
