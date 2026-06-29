package OOP.OverloadOverride.Exercise;

class RegistrationStudent {
    int id;
    String name;
    int age;
    String gmail;
    String address;

    RegistrationStudent(int id, String name, int age, String gmail, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gmail = gmail;
        this.address = address;
    }
}

class StudentService {
    void register(RegistrationStudent... students) {
        sortByAge(students);

        int totalAge = 0;
        RegistrationStudent oldest = students[0];
        RegistrationStudent youngest = students[0];

        System.out.println("===== Student Registration System =====");

        for (RegistrationStudent student : students) {
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Gmail: " + student.gmail);
            System.out.println("Address: " + student.address);
            System.out.println();

            totalAge += student.age;

            if (student.age > oldest.age) {
                oldest = student;
            }

            if (student.age < youngest.age) {
                youngest = student;
            }
        }

        double averageAge = (double) totalAge / students.length;

        System.out.println("Total Students: " + students.length);
        System.out.println("Oldest Student: " + oldest.name);
        System.out.println("Youngest Student: " + youngest.name);
        System.out.println("Average Age: " + averageAge);

        checkDuplicateGmail(students);
    }

    void sortByAge(RegistrationStudent... students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].age > students[j].age) {
                    RegistrationStudent temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    void checkDuplicateGmail(RegistrationStudent... students) {
        boolean hasDuplicate = false;

        System.out.println("Duplicate Gmail:");

        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].gmail.equals(students[j].gmail)) {
                    System.out.println(students[i].gmail);
                    hasDuplicate = true;
                }
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicate Gmail found.");
        }
    }
}
