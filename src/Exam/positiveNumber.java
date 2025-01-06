package Exam;

import java.util.Scanner;

public class positiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter integers (negative integer to stop):");

        while (true) {
            number = input.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }

        System.out.println("The sum of positive integers is: " + sum);
        input.close();
    }
}



