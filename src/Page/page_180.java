package Page;

import java.util.Scanner;

public class page_180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println();
        System.out.println("Enter first positive number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second positive number: ");
        int num2 = sc.nextInt();
        int gcd = 1 ;
        int k = 2 ;
        while (k <= num1 && k <= num2){
            if ( num1 % k == 0 && num2 % k ==0)
                gcd = k ;
            k++;
        }
        System.out.println(" The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);


    }
}
