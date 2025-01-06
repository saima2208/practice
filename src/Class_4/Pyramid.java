package Class_4;


import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of rows in the pyramid
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();

        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces for left alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();





    }
}
