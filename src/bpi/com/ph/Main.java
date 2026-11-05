package bpi.com.ph;

import java.util.Scanner;
import bpi.com.ph.view.Display;
import bpi.com.ph.forex.model.Customer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Enter customer name: ");
        customer.name = scanner.nextLine();

        System.out.print("Enter amount in PHP: ");
        customer.pesoAmount = scanner.nextDouble();
        scanner.nextLine();

        Display.showMenu();
        customer.currencySelected = scanner.nextLine();

        customer.convertAmount();

        Display.showTransaction(customer);

        scanner.close();
    }
}