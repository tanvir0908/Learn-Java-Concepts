package com.example.challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("001", "Tanvir Hasan");
        account1.depositMoney(1000);
        account1.withdrawMoney(2000);
        account1.withdrawMoney(0);
    }
}
