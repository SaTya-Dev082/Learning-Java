package Lamda;

import java.util.List;

public class MethodReference {
    public static void main(String[] agrs){
        List<String> users=List.of("Apple","Alphabet","Microsoft","Meta","SpaceX");

        // Lamda
        users.forEach(name->System.out.println(name));

        System.out.println("==================");
        
        // Method Reference
        users.forEach(System.out::println);
        System.out.println("==================");
        // Lamda
        users.forEach(name->System.out.println(name));
        System.out.println("==================");
        // MR
        users.forEach(System.out::println);

    }
}
