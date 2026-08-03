package LambdaDemo;

import java.util.List;

public class FilteringData {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Satya", true),
                new User("Dara", false),
                new User("Khuntea", true),
                new User("Bopha", true));

        // Filter by true
        users.stream()
                .filter(user -> user.active)
                .forEach(user -> System.out.println(user.name));
        // Filter by fal se just add ! before property
        users.stream()
                .filter(user -> !user.active)
                .forEach(user -> System.out.println(user.name));
    }
}
