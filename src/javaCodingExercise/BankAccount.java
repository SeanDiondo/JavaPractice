package javaCodingExercise;

import java.util.prefs.BackingStoreException;

public class BankAccount{
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double depoAmount) {
        if (depoAmount > 0){
            balance += depoAmount;
            System.out.println("Successfully Deposited");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void withdraw(double withAmount){
        if (withAmount < balance) {
            balance -= withAmount;
            System.out.println("Balance Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public double getAmount(){
        return balance;
    }
    public void displayAccount(){
        System.out.println(accountHolder);
        System.out.println(balance);

    } public static void main (String[] args){
        BankAccount account1 = new BankAccount("Sean", 10_000.00);
        BankAccount accountSean = new BankAccount("Sean Diondo", 40_000.00);

        account1.displayAccount();

        account1.deposit(500);
        System.out.println("Balance: " + account1.getAmount());

        account1.withdraw(3000);
        System.out.println("Balance: " + account1.getAmount());

        accountSean.displayAccount();
        accountSean.withdraw(5000);
        System.out.println("Balance: " + accountSean.getAmount());
    }
}
