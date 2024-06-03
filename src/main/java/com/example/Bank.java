package com.example;

// Starter code for Bank class
public class Bank {
    // Attributes
    private String bankName;
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Add a constructor here
    // public Bank(String bankName, String accountHolderName, String accountNumber, double balance) { ... }
    public Bank(String bankName, String accountHolderName, String accountNumber, double balance) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Add getter and setter methods here
    // public String getBankName() { ... }
    // public void setBankName(String bankName) { ... }
    // public String getAccountHolderName() { ... }
    // public void setAccountHolderName(String accountHolderName) { ... }
    // public String getAccountNumber() { ... }
    // public void setAccountNumber(String accountNumber) { ... }
    // public double getBalance() { ... }
    // public void setBalance(double balance) { ... }


    

    public String getBankName(){
        return getBankName();
    }
    public void setBankName(String bankName){
        this.bankName=bankName;
    }
    public String getAccountHolderName(){
        return accountHolderName;

    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    // Method to display account details
    public void displayAccountDetails() {
        // TODO: Implement this method
        System.out.println("Bank Name:  "+bankName);
        System.out.println("Account Holder Name:  "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance:  "+balance);

    }

    // Method to deposit money
    public void deposit(double amount) {
        // TODO: Implement this method
        if(amount>0){
            amount +=amount;
            System.out.println("Successfully deposited amount $"+amount);
        }
        System.out.println("please deposit more than zero");
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        // TODO: Implement this method
       
    }
}
