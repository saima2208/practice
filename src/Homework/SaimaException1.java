package Homework;



import java.util.Scanner;
import java.util.regex.Pattern;

public class SaimaException1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter email Address: ");
        String email = input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();

        try {
            validatePassword(password);
            validateEmail(email);
            System.out.println(" Welcome, " + email + "   |");
        } catch (CustomException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    private static void validateEmail(String email) {
        // Regular expression for validating email
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!Pattern.matches(emailRegex, email)) {
            throw new CustomException("Incorrect email format!");
        }
    }

    private static void validatePassword(String password) {
        // Regular expression for validating password
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&])[a-zA-Z\\d!@#$%^&]{6,}$";
        if (!Pattern.matches(passwordRegex, password)) {
            throw new CustomException("Incorrect password format!");
        }
    }

    // Custom exception class
    public static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }
}
