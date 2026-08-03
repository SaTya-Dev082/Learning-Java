package LambdaDemo;

@FunctionalInterface
interface DiscountStrategy {
    double applyDiscount(double total);
}

class CheckoutService {
    public double checkout(double total, DiscountStrategy strategy) {
        return strategy.applyDiscount(total);
    }
}

public class LambdaStrategyPattern {
    

    public static void main(String[] args) {
        CheckoutService service = new CheckoutService();

        double normalDiscount = service.checkout(190, total -> total * 0.9);
        double vipDiscount = service.checkout(100, total -> total * 0.8);

        System.out.println(normalDiscount);
        System.out.println(vipDiscount);
    }
}
