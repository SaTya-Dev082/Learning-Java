package Fundamentals;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args){
        int a;
        int b;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=scan.nextInt();
        System.out.print("Enter second number: ");
        b=scan.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modulus: "+(a%b));
        System.out.println("Increment: "+(++a));
        System.out.println("Decrement: "+(--b));
        System.out.println("Greater than: "+(a>b));
        System.out.println("Less than: "+(a<b));
        System.out.println("Equal to: "+(a==b));
        System.out.println("Not equal to: "+(a!=b));
        System.out.println("Greater than or equal to: "+(a>=b));
        System.out.println("Less than or equal to: "+(a<=b));
        scan.close();
    }
}
