package java_Polymorphism;

public class PaymentProcessor {
    public double processPayment(double amount){
        System.out.println("Cash Payment: ");
        return amount;
    }
    public void processPayment(double amount, String accountName){
       System.out.println("Amount: " + amount);
       System.out.println("Account Name: " + accountName);
    }
    public void processPayment(double amount, String accountName, String referenceNumber){
        System.out.println("Amount: " + amount);
        System.out.println("Account Name: " + accountName);
        System.out.println("Ref Number: " + referenceNumber);
    }
    public void processPayment(String accountName, double amount){
        System.out.println("Amount: " + amount);
        System.out.println("Account Name: " + accountName);
    }
}
