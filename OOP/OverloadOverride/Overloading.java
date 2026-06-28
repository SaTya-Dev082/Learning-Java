package OOP.OverloadOverride;

public class Overloading {
    static void print(int text){
        System.out.println("The iteger is "+text);
    }
    static void print(float text){
        System.out.println("The float is "+text);
    }
    static void print(double text){
        System.out.println("The double is "+text);
    }
    static void print(String text){
        System.out.println("The String is "+text);
    }
    static void print(int id,String name, String address){
        System.out.println("The user detail is ID : "+id+" , Name : "+name+" , Address : "+address);
    }

    public static void main(String[] agrs){
        print(2121,"Satya","Phnom Penh");
    }
}
