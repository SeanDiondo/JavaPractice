package java_Polymorphism;

public class Main {
    public static void main(String[] args) {
        //Animals
        /*
        polymorphism_Animal animal1 = new Dog();
        polymorphism_Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();

        //Employee
        Employee Employee1 = new Developer();
        Employee Employee2 = new Designer();

        Employee1.performTask();
        Employee2.performTask(); */

        PaymentProcessor payment = new PaymentProcessor();
        payment.processPayment(500);

        payment.processPayment(1000, "Sean");

        payment.processPayment(1500, "Sean", "REF-12345");

        payment.processPayment("Sean", 2000);

    }
}
