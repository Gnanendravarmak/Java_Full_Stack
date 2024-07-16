package com.grayMatter.banking;

public class CurrentAccount extends Account {
    public CurrentAccount(String accNo, String accountHolder, double balance, int pin, String bankName, String ifscCode) {
        super(accNo, accountHolder, balance, pin, bankName, ifscCode);
    }

    public double getBalance() {
        return balance;
    }
}


