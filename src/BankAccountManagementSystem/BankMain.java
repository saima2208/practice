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
