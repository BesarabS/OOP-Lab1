package lab4.task1.paymentprocessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        Customer regularCustomer = new RegularCustomer();
        Customer premiumCustomer = new PremiumCustomer();

        double regularDiscount = paymentProcessor.calculateDiscount(regularCustomer, 1000);
        double premiumDiscount = paymentProcessor.calculateDiscount(premiumCustomer, 1000);

        System.out.println("Regular Discount: " + regularDiscount);
        System.out.println("Premium Discount: " + premiumDiscount);
    }
}

interface Customer {
    double calculateDiscount(double amount);
}

class RegularCustomer implements Customer {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}

class PremiumCustomer implements Customer {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}

class PaymentProcessor {
    public double calculateDiscount(Customer customer, double amount) {
        return customer.calculateDiscount(amount);
    }
}

