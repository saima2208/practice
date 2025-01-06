package Homework;

import java.util.Objects;
import java.util.Scanner;

public class SaimaException extends Throwable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email Address: ");
        String email = input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();


        try {
            validatePassword(password);
            validateEmail(email);
            System.out.println("|>>   Welcome, " + email+ "   |");
        } catch (CustomException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    private static void validateEmail(String email) {
        String actualEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!Objects.equals(email, actualEmail)) {
            throw new CustomException("Incorrect email ");
        }
    }


    private static void validatePassword(String password) {
        String actualPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&])[a-zA-Z\\d!@#$%^&]{6,}$";
        if (!Objects.equals(password, actualPassword)) {
            throw new CustomException("Incorrect password!");
        }
    }


    public static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }
}
