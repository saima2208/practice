package Homework;

import java.util.Scanner;

public class Calculator_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Input operator
        System.out.println("Select an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        int result = 0;

        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Remainder is: " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, /, or %.");
        }

        sc.close();
    }
}
