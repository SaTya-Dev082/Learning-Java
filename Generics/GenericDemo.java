package Generics;

// Definition: Generics គឺធ្វើឲ្យ class/method reusable ហើយ type-safe។

// Where use: API response,repository,utility class.

// When use: ពេលចង់ class មួយ support many data types។

// Real backend example:
// ApiResponse<User>userResponse;
// ApiResponse<List<Product>>productResponse;
// ApiResponse<Order>orderResponse;

public class GenericDemo {
    public static void main(String[] args) {

        ApiResponse<String> response1 = new ApiResponse<>(true, "User found", "Makara");
        ApiResponse<Integer> response2 = new ApiResponse<>(true, "Total users", 100);

        response1.show();
        response2.show();

    }
}

class ApiResponse<T> {

    private String message;

    private T data;

    public ApiResponse(boolean success, String message, T data) {

        this.message = message;

        this.data = data;

    }

    public void show() {

        System.out.println(message);

        System.out.println(data);

    }

}
