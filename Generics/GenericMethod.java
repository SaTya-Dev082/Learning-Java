package Generics;

public class GenericMethod {
    static <T> void printData(T value){
        System.out.println("Value: "+ value);
        System.out.println("Type: "+ value.getClass().getSimpleName());
    }
    static void main(String []args){
        printData("SaTya");
        printData(82);
        printData(true);
    }
}
