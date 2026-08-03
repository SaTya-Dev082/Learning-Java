package Generics;

class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;

    public ApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public void printResponse() {
        System.out.println("Success: " + success);
        System.out.println("Message: " + message);
        System.out.println("Data: " + data);
    }
}

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return name + " - " + email;
    }
}


public class APIResponse {
    public static void main(String[] args) {
        User user = new User("Makara", "makara@gmail.com");

        ApiResponse<User> userResponse = new ApiResponse<>(true, "User found", user);

        ApiResponse<String> loginResponse = new ApiResponse<>(true, "Login success", "token_123456");

        ApiResponse<Integer> countResponse = new ApiResponse<>(true, "Total users", 50);

        userResponse.printResponse();
        loginResponse.printResponse();
        countResponse.printResponse();
    }
}
