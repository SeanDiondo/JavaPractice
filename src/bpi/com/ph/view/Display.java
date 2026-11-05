package bpi.com.ph.view;

import bpi.com.ph.forex.model.Customer;

public class Display {

    public static void showMenu() { //static or class method
        System.out.println("List foreign currency");
        System.out.println("1 - USD");
        System.out.println("2 - EUR");
        System.out.println("3 - JPY");
        System.out.println("4 - AUD");
        System.out.print("Select foreign currency: ");
    }

    public static void showTransaction(Customer kustomer) {
        //output
        if (kustomer.isValid) {
            System.out.println("\nCustomer Name: " + kustomer.name);
            System.out.println("Philippine Peso: Php " + kustomer.pesoAmount);
            System.out.println("Foreign Currency Equivalent: "
                    + kustomer.currencyEquivalent+kustomer.convertedAmount);
        } else {
            System.err.println("\nInvalid selection of foreign currency target. Please try again.");
        }
    }
}
