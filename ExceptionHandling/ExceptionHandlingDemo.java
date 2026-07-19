package ExceptionHandling;

// Definition: Exception Handling គឺការគ្រប់គ្រង error ដើម្បីមិនឲ្យ app crash។

// Where use: Database,API,file upload,login,validation.

// When use: ពេល code អាចមាន error ដូចជា user not found,wrong password,file missing។

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        UserService service = new UserService();

        try {
            String user = service.findUserById(5);
            System.out.println(user);
        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}

class UserService {
    public String findUserById(int id) {
        if (id != 1) {
            throw new UserNotFoundException("User with id " + id + " not found");
        }
        return "Makara";
    }
}
