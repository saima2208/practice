package Class_3;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int prime = sc.nextInt();

        // Check if the number is prime
        if (prime <= 1) {
            System.out.println(prime + " is not a prime number.");
        } else if (prime == 2) {
            // 2 is a prime number
            System.out.println(prime + " is a prime number.");
        } else {
            // Check divisibility from 2 to the square root of the number
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(prime + " is a prime number.");
            } else {
                System.out.println(prime + " is not a prime number.");
            }
        }
    }
}
