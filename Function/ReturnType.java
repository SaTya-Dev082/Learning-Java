package Function;

public class ReturnType {
    public static void main(String[] args){
        int result=returnTypeMethod(10,20);
        System.out.println("The sum is: " + result);
        display(643246,"Jown Brown","john.brown@example.com","123 Main St, Anytown, USA");
    }

    public static int returnTypeMethod(int a, int b){
        return a+b;
    }
    public static void display(int noId, String name, String email, String address){
        System.out.println("The information of the User is : NoId: " + noId + ", Name: " + name + ", Email: " + email + ", Address: " + address);
    }
}
