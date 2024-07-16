package com.grayMatter.banking;

import java.util.Scanner;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        SavingAccount savingAccount = new SavingAccount(
                "SA123456789",
                "Gnanendra Varma",
                1000.0,
                1234,
                "union Bank",
                "IFSC0001",
                500.0
        );

       
        CurrentAccount currentAccount = new CurrentAccount(
                "C9876543223A",
                "varma",
                222000.0,
                5678,
                "HDFC",
                "IFSC0002"
        );

        boolean exit = false;
        while (!exit) {
        	System.out.println("*********************");
            System.out.println("Select Account Type:");
            System.out.println("1. Saving Account");
            System.out.println("2. Current Account");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleSavingAccount(savingAccount, scanner);
                    break;
                case 2:
                    handleCurrentAccount(currentAccount, scanner);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    private static void handleSavingAccount(SavingAccount account, Scanner scanner) {
        boolean back = false;
        while (!back) {
        	 System.out.println("*********************\n");
            System.out.println("1. Withdraw");
            System.out.println("2. Print Account Details");
            System.out.println("3. Change PIN");
            System.out.println("4. Get Overdraft Limit");
            System.out.println("5. Back to Main Menu");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 2:
                    account.printAccountDetails();
                    break;
                case 3:
                    System.out.print("Enter new PIN: ");
                    int newPin = scanner.nextInt();
                    account.changePin(newPin);
                    break;
                case 4:
                    System.out.println("Overdraft Limit: " + account.getOverdraftLimit());
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void handleCurrentAccount(CurrentAccount account, Scanner scanner) {
        boolean back = false;
        while (!back) {
        	 System.out.println("*********************\n");
            System.out.println("1. Withdraw");
            System.out.println("2. Print Account Details");
            System.out.println("3. Change PIN");
            System.out.println("4. Get Balance");
            System.out.println("5. Back to Main Menu");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 2:
                    account.printAccountDetails();
                    break;
                case 3:
                    System.out.print("Enter new PIN: ");
                    int newPin = scanner.nextInt();
                    account.changePin(newPin);
                    break;
                case 4:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
