package MachineProblem1Abstraction;

import java.util.Scanner;

public class LazadaView {

    private Scanner scanner = new Scanner(System.in);

    //customer information
    public String getCustomerName() {
        System.out.print("Enter Customer Name: ");
        return scanner.nextLine();
    }

    public String getShippingAddress() {
        System.out.print("Enter Shipping Address: ");
        return scanner.nextLine();
    }

    // Display available products
    public void displayProducts(Product[] phones) {
        System.out.println("Select Your Mobile Phone");

        for (int i = 0; i < phones.length; i++) {
            System.out.printf("%d - %s (Php %.2f)%n",
                    i + 1,
                    phones[i].getProductName(),
                    phones[i].getPrice());
        }
    }

    // Get selected product
    public Product getPhoneSelection(Product[] phones) {

        while (true) {
            System.out.print("Enter Phone Model (1-" + phones.length + "): ");

            String choice = scanner.nextLine();

            try {
                int selection = Integer.parseInt(choice);

                if (selection >= 1 && selection <= phones.length) {
                    return phones[selection - 1];
                }

                System.out.println("Invalid selection. Please choose from the menu.");

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // Get quantity
    public int getQuantity() {

        while (true) {
            System.out.print("Enter Number of Items: ");
            String input = scanner.nextLine();

            try {
                int quantity = Integer.parseInt(input);

                if (quantity > 0) {
                    return quantity;
                }

                System.out.println("Quantity must be greater than zero.");

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    // Get credit card number
    public String getCreditCardNumber() {
        System.out.print("Enter Credit Card Number: ");
        return scanner.nextLine().trim();
    }

    // Display card validation result
    public void displayInvalidCard() {
        System.out.println("Invalid credit card number. Please try again.");
    }

    public void displayValidCard() {
        System.out.println("Credit card number is valid.");
    }

    // Display order summary
    public void displayOrderSummary(Order order) {

        System.out.println("\n========== ORDER SUMMARY ==========");
        System.out.println("Customer Name: " + order.getCustomerName());
        System.out.println("Shipping Address: " + order.getShippingAddress());
        System.out.println("Item Ordered: " + order.getProduct().getProductName());
        System.out.println("Quantity: " + order.getQuantity());

        System.out.printf("Gross Amount: Php %.2f%n", order.getGrossAmount());
        System.out.printf("VAT (12%%): Php %.2f%n", order.getVat());
        System.out.printf("Total Price: Php %.2f%n", order.getTotalPrice());

        System.out.println("===================================");
    }

    // buy again
    public boolean askBuyAgain() {

        while (true) {
            System.out.print("\nDo you want to buy again? (Y/N): ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }

            System.out.println("Invalid input. Please enter Y or N.");
        }
    }

    public void displayThankYouMessage() {
        System.out.println("\nThank you for shopping with Lazada!");
    }

    // Close Scanner
    public void closeScanner() {
        scanner.close();
    }
}