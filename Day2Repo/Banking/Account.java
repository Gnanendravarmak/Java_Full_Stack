package com.grayMatter.banking;



public class Account {
    private String accNo;
    private String accountHolder;
    private int pin;
    private String bankName;
    private String ifscCode;
    protected double balance;

    public Account(String accNo, String accountHolder, double balance, int pin, String bankName, String ifscCode) {
        this.accNo = accNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
            
        } else {
            System.out.println("Insufficient amount!!!.");
        }
    }

    public void printAccountDetails() {
    	System.out.println("*********************\n");
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Bank Name: " + bankName);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Balance: " + balance);
       
    }

    public void changePin(int newPin) {
        pin = newPin;
        System.out.println("PIN changed successfully.");
     
    }

    public int getPin() {
        return pin;
    }
}
