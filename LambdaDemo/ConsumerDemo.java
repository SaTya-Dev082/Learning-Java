package LambdaDemo;

import java.util.function.Consumer;

// import java.util.function.Consumer;

// public class ConsumerDemo {
//     public static void main(String[] args) {

//         Consumer<String> consumer = data -> System.out.println(data);

//         Consumer<Integer> data = dataa -> System.out.println(dataa);

//         consumer.accept("Hello Java programming.");
//         consumer.accept("Wanna be Java and Mobile development.");
//         consumer.accept("In the future.");

//         data.accept(13);
//         data.accept(63);
//         data.accept(23);
//         data.accept(73);
//         data.accept(82);

        
//     }
// }


public class ConsumerDemo {

    public static void main(String[] args) {

        User user = new User("Makara", 25);

        Consumer<User> displayUser = value -> {

            System.out.println("Name: " + value.getName());

            System.out.println("Age: " + value.getAge());

        };

        displayUser.accept(user);

    }

}
class User {

    private String name;

    private int age;

    public User(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

}