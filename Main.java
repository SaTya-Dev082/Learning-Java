

public class Main {
    public static void main(String[] args) {
        System.out.println("JAVA BASIC LESSONS");
        System.out.println("==================");

        // JavaIntro.run();
        // JavaOutput.run();
        // JavaComments.run();
        // JavaVariables.run();
        // JavaDataTypes.run();
        // JavaTypeCasting.run();
        // JavaOperators.run();
        // JavaStrings.run();
        // JavaMath.run();
        // JavaBooleans.run();
        // JavaIfElse.run();
        // JavaSwitch.run();
        // JavaWhileLoop.run();
        // JavaForLoop.run();
        // JavaBreakContinue.run();
        // JavaArrays.run();
        // JavaMethods.run();
        // JavaMethodParameters.run();
        // JavaMethodOverloading.run();
        // JavaScope.run();
        JavaRecursion.run();
    }
}

class JavaIntro {
    static void run() {
        title("Java Intro");
        System.out.println("Java is a programming language for apps, web APIs, Android, and backend systems.");
    }

    static void title(String name) {
        System.out.println();
        System.out.println("--- " + name + " ---");
    }
}

class JavaOutput {
    static void run() {
        JavaIntro.title("Java Output");
        System.out.println("Hello Java");
        System.out.print("This stays on the same line. ");
        System.out.println("This finishes the line.");
    }
}

class JavaComments {
    static void run() {
        JavaIntro.title("Java Comments");
        // This is a single-line comment.
        /*
         * This is a multi-line comment.
         * Comments help explain code.
         */
        System.out.println("Comments do not run as code.");
    }
}

class JavaVariables {
    static void run() {
        JavaIntro.title("Java Variables");
        String name = "Makara";
        int age = 25;
        double salary = 500.50;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class JavaDataTypes {
    static void run() {
        JavaIntro.title("Java Data Types");
        int number = 10;
        double price = 12.99;
        char grade = 'A';
        boolean isActive = true;
        String city = "Phnom Penh";

        System.out.println(number);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(isActive);
        System.out.println(city);
    }
}

class JavaTypeCasting {
    static void run() {
        JavaIntro.title("Java Type Casting");
        int smallNumber = 10;
        double biggerNumber = smallNumber; // Automatic casting: int to double

        double price = 19.99;
        int wholePrice = (int) price; // Manual casting: double to int

        System.out.println("Automatic casting: " + biggerNumber);
        System.out.println("Manual casting: " + wholePrice);
    }
}

class JavaOperators {
    static void run() {
        JavaIntro.title("Java Operators");
        int a = 10;
        int b = 3;

        System.out.println("Add: " + (a + b));
        System.out.println("Minus: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Remainder: " + (a % b));
        System.out.println("Is a greater than b? " + (a > b));
    }
}

class JavaStrings {
    static void run() {
        JavaIntro.title("Java Strings");
        String firstName = "Puth";
        String lastName = "Makara";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println("Length: " + fullName.length());
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Contains Makara? " + fullName.contains("Makara"));
    }
}

class JavaMath {
    static void run() {
        JavaIntro.title("Java Math");
        System.out.println("Max: " + Math.max(10, 20));
        System.out.println("Min: " + Math.min(10, 20));
        System.out.println("Square root: " + Math.sqrt(64));
        System.out.println("Random number: " + Math.random());
    }
}

class JavaBooleans {
    static void run() {
        JavaIntro.title("Java Booleans");
        int age = 20;
        boolean canVote = age >= 18;

        System.out.println("Can vote: " + canVote);
    }
}

class JavaIfElse {
    static void run() {
        JavaIntro.title("Java If Else");
        int score = 75;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

class JavaSwitch {
    static void run() {
        JavaIntro.title("Java Switch");
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}

class JavaWhileLoop {
    static void run() {
        JavaIntro.title("Java While Loop");
        int i = 1;

        while (i <= 3) {
            System.out.println("While count: " + i);
            i++;
        }
    }
}

class JavaForLoop {
    static void run() {
        JavaIntro.title("Java For Loop");

        for (int i = 1; i <= 3; i++) {
            System.out.println("For count: " + i);
        }
    }
}

class JavaBreakContinue {
    static void run() {
        JavaIntro.title("Java Break Continue");

        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            }

            if (i == 4) {
                break;
            }

            System.out.println("Number: " + i);
        }
    }
}

class JavaArrays {
    static void run() {
        JavaIntro.title("Java Arrays");
        String[] students = {"Makara", "Dara", "Sokha"};

        System.out.println("First student: " + students[0]);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + students[i]);
        }
    }
}

class JavaMethods {
    static void run() {
        JavaIntro.title("Java Methods");
        sayHello();
        int total = sum(10, 20);
        System.out.println("Sum: " + total);
    }

    static void sayHello() {
        System.out.println("Hello from method");
    }

    static int sum(int a, int b) {
        return a + b;
    }
}

class JavaMethodParameters {
    static void run() {
        JavaIntro.title("Java Method Parameters");
        showStudent("Makara", 25);
        showStudent("Dara", 22);
    }

    static void showStudent(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
}

class JavaMethodOverloading {
    static void run() {
        JavaIntro.title("Java Method Overloading");
        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

class JavaScope {
    static void run() {
        JavaIntro.title("Java Scope");
        int localNumber = 100;
        System.out.println("This variable works only inside this method: " + localNumber);
    }
}

class JavaRecursion {
    static void run() {
        JavaIntro.title("Java Recursion");
        int result = sumFromOneTo(10);
        System.out.println("Sum from 1 to 10: " + result);
    }

    static int sumFromOneTo(int number) {
        if (number == 1) {
            return 1;
        }

        return number + sumFromOneTo(number - 1);
    }
}
