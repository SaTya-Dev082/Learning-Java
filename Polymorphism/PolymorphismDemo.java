package Polymorphism;

// Definition:
// Polymorphism មានន័យថា method ឈ្មោះដូចគ្នា ប៉ុន្តែ behavior ផ្សេងគ្នា។

// មាន 2 ប្រភេទ៖
//          Type                                         Meaning
// Method Overloading                      method ឈ្មោះដូចគ្នា តែ parameter ខុស
// Method Overriding                       child class rewrite method របស់ parent/interface

// Real example: Payment method ដូចគ្នា ប៉ុន្តែ payment logic ខុស។

public class PolymorphismDemo {
    public static void main(String[] args) {
        Payment payment1 = new CashPayment();
        Payment payment2 = new AbaPayment();
        Payment payment3 = new AcledaPayment();

        payment1.pay(50);
        payment2.pay(100);
        payment3.pay(200);
    }
}

interface Payment {
    void pay(double amount);
}

class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " by Cash");
    }
}

class AbaPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " by ABA");
    }
}

class AcledaPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " by ACLEDA");
    }

}