package com.grayMatter.banking;

public class SavingAccount extends Account {
    private double overdraftLimit;

    public SavingAccount(String accNo, String accountHolder, double balance, int pin, String bankName, String ifscCode, double overdraftLimit) {
        super(accNo, accountHolder, balance, pin, bankName, ifscCode);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient Amount!!!");
        }
    }

    @Override
    public void printAccountDetails() {
        super.printAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
