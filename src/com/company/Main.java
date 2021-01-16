package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = new BankAccount();
        System.out.println("Current sum "+bankAccount.deposit(20000.0));
        bankAccount.withDraw(6000);
    }
}
