package OOP;
import java.util.Scanner;

public class ATM {

    static double balance = 20000;

  
    static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

  
    static void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited: ₹" + amount);
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

  
    static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: ₹" + amount);
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient Balance!");
            System.out.println("Available Balance: ₹" + balance);
        }
    }


    static void displayMenu() {
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}