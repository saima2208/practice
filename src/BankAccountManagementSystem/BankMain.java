package BankAccountManagementSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount bankAccount3 = new BankAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

       // bankAccount1.setAccountNo(1001);
        //bankAccount1.setBalance(1000.00);
        //bankAccount1.setInterest(0.02);
       // bankAccount1.setType("Savings");
/*
        bankAccount2.setAccountNo(1002);
        bankAccount2.setBalance(2000.00);
        bankAccount2.setInterest(5.0);
        bankAccount2.setType("Current");

        bankAccount3.setAccountNo(1003);
        bankAccount3.setBalance(5000.00);
        bankAccount3.setInterest(0.015);
        bankAccount3.setType("Savings");*/


        try {
            File myObj = new File("C:\\Users\\Java Student PC-7\\Desktop\\JAVA\\practice\\Bank_Account.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");

        }







    }
}
