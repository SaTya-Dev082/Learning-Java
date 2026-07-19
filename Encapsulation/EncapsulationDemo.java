package Encapsulation;
// Definition:
// Encapsulation គឺការលាក់ field/data មិនឲ្យ access directly ពីខាងក្រៅ class។ យើងប្រើ private field និង getter/setter។

// Where use:
// Model class, Entity class, DTO class.

// When use:
// ពេលចង់ protect data ឬ validate data មុន save។

// Real example: User age មិនអាចតូចជាង 0។

public class EncapsulationDemo {
    public static void main(String[] args) {

        User user = new User("Makara", 20);

        System.out.println(user.getName());

        System.out.println(user.getAge());

    }
}

class User {

    private String name;

    private int age;

    public User(String name, int age) {

        this.name = name;

        setAge(age);

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        if (age < 0) {

            throw new IllegalArgumentException("Age cannot be negative");

        }

        this.age = age;

    }

}

