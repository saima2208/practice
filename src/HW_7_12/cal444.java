package HW_7_12;



import java.util.Scanner;

public class cal444 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression (e.g., 3 + 4):");
        String input = scanner.nextLine();

        double result = calculate(input);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("There was an error with your input.");
        }

        scanner.close();
    }

    public static double calculate(String expression) {
        expression = expression.trim();
        if (expression.isEmpty()) {
            System.out.println("Input cannot be empty.");
            return Double.NaN;
        }

        char operator = ' ';
        int operatorIndex = -1;

        // Check for the presence of a valid operator
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                operator = c;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1) {
            System.out.println("Invalid operator. Please use +, -, *, /, or %.");
            return Double.NaN;
        }

        double num1, num2;
        try {
            // Split the expression into two numbers
            num1 = Double.parseDouble(expression.substring(0, operatorIndex).trim());
            num2 = Double.parseDouble(expression.substring(operatorIndex + 1).trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers. Please enter valid numeric values.");
            return Double.NaN;
        }

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: Division or modulus by zero is not allowed.");
                    return Double.NaN;
                }
                return operator == '/' ? num1 / num2 : num1 % num2;
            default:
                System.out.println("Unknown error.");
                return Double.NaN;
        }
    }
}
