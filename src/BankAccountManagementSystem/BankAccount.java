package BankAccountManagementSystem;

public class BankAccount {
    private int accountNo;
    private double balance;
    private String type;
    private double interest;

    public BankAccount(int accountNo, double balance, String type, double interest) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.type = type;
        this.interest = interest;
    }


    public BankAccount(int accountNo) {
    }

    public BankAccount() {

    }

    public void deposit(double amount) {

    }

    public void withdrawal(double amount) {

    }

    public double calculatingInterest() {
        return interest;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
