package Projects;

import java.util.Scanner;

public class BankingProgram {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 14000;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;

                case 2:
                    balance = deposit(balance);
                    break;

                case 3:
                    balance = withdraw(balance);
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using the Banking System.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Show Balance
    public static void showBalance(double balance) {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Deposit Method
    public static double deposit(double balance) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
        return balance;
    }

    // Withdraw Method
    public static double withdraw(double balance) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
        return balance;
    }
}
