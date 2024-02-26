package com.example.challenge78;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double balance) {
        if (balance <= 0) {
            System.out.println("Invalid deposit.");
        } else {
            this.balance += balance;
            System.out.println("Money deposit successfully.");
        }

    }

    public void withdrawMoney(double balance) {
        if (this.balance < balance || balance == 0) {
            System.out.println("Invalid transaction.");
        } else {
            this.balance -= balance;
            System.out.println("Money withdraw successfully.");
        }
    }
}
