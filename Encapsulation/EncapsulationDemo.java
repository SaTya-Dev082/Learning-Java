package Encapsulation;

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
public class EncapsulationDemo {
    public static void main(String[] args) {

        User user = new User("Makara", 20);

        System.out.println(user.getName());

        System.out.println(user.getAge());

    }
}
