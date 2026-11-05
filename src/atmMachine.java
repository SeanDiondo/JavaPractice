import java.util.Scanner;

public class atmMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Atm given balance
        double accountBalance = 10_000.00;

        // Transaction type using switch
        System.out.print("1: Check Balance ");
        System.out.print("2: Deposit ");
        System.out.print("3: Withdraw ");
        System.out.print("4: Exit \n");
        System.out.print("Choose Transaction Type: ");
        int transactionType = scanner.nextInt();

         switch (transactionType) {
             case 1:
                 System.out.println("Check Balance: " + accountBalance);
                break;
             case 2:
                 System.out.print("Deposit Amount: ");
                 double depositAmount = scanner.nextDouble();
                 accountBalance = depositAmount + accountBalance;
                 System.out.println("Successfully Deposited to your Account");
                 System.out.println("Your Current Balance is: " + "PHP " + accountBalance);
                 break;
             case 3:
                 System.out.print("Enter withdrawal amount: PHP ");
                 double withdrawAmount = scanner.nextDouble();

                 if (withdrawAmount > accountBalance) {
                     System.out.println("Insufficient funds");
                 } else if (withdrawAmount > 5000) {
                     System.out.println("Exceeds single transaction limit");
                 } else {
                     accountBalance -= withdrawAmount;
                     System.out.println("Withdrawal successful!");
                     System.out.printf("Remaining Balance: PHP %,.2f%n", accountBalance);
                 }
                 break;
             case 4:
                 System.out.println("Thank you for using out ATM");
                 break;
             default:
                 System.out.println("Invalid input");
                 break;
         }
         scanner.close();
    }
}
