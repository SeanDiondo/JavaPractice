
import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the kilowatt-hours consumed
        System.out.print("Enter kWh consumed: ");
        double kWh = scanner.nextDouble();

        // Fixed monthly charge
        double monthlyCharge = 50.00;
        double electricityCost = 0.00;

        // Validate input and calculate the electricity cost
        if (kWh < 0) {
            System.out.println("Invalid input. kWh cannot be negative.");
        } else {
            if (kWh <= 100) {
                electricityCost = kWh * 5.00;
            } else if (kWh <= 200) {
                electricityCost = (100 * 5.00)
                        + ((kWh - 100) * 8.00);
            } else if (kWh <= 300) {
                electricityCost = (100 * 5.00)
                        + (100 * 8.00)
                        + ((kWh - 200) * 10.00);
            } else {
                electricityCost = (100 * 5.00)
                        + (100 * 8.00)
                        + (100 * 10.00)
                        + ((kWh - 300) * 12.00);
            }

            // Add the fixed monthly charge
            double totalBill = electricityCost + monthlyCharge;

            // Display the total bill
            System.out.printf("Electricity Cost: PHP %.2f%n", electricityCost);
            System.out.printf("Monthly Charge: PHP %.2f%n", monthlyCharge);
            System.out.printf("Total Electricity Bill: PHP %.2f%n", totalBill);
        }

        scanner.close();
    }
}
