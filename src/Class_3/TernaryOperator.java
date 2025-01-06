package Class_3;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int numberOne = sc.nextInt();
        System.out.println("enter second number");
        sc.nextLine();
        int numberTwo = sc.nextInt();
        int max;

       /* System.out.println("First num: " + numberOne);
        System.out.println("Second num: " + numberTwo); */

        max = (numberOne > numberTwo) ? numberOne : numberTwo;
        System.out.println("Maximum number is = " + max);

    }
}
