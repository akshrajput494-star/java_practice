package com.bank.core;

public class BankAccount_2 {
    // Private: Strictly hidden from outside this class
    private String accountNumber;

    // Default (Package-Private): Hidden from outside the com.bank.core package
    String branchCode;

    public BankAccount_2(String accountNumber, String branchCode) {
        this.accountNumber = accountNumber;
        this.branchCode = branchCode;
    }

    // Public: Safely accessible from anywhere in the application
    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Public Getter: Read-only access to the private account number
    public String getAccountNumber() {
        return this.accountNumber;
    }
}