package BankAccountManagementSystem;

public class BankAccount {
    private int accountNo;
    private double balance;



    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;

    }


    public BankAccount(int accountNo) {
    }

    public BankAccount() {

    }

    public void deposit(double amount) {

    }

    public void withdrawal(double amount) {

    }

    public void calculatingInterest() {

    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(int i) {

    }
}
