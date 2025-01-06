package Exam;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = input.nextInt();
        System.out.println("Enter num2");
        int num2 = input.nextInt();
        System.out.println("Enter num3");
        int num3 = input.nextInt();

        int highestNumber = getHighestNumber(num1, num2, num3);

        int lowestNumber = getLowestNumber(num1, num2, num3);

        System.out.println("The highest number is: " + highestNumber);
        System.out.println("The lowest number is: " + lowestNumber);

       input.close();
    }

    private static int getLowestNumber(int num1, int num2, int num3) {
        int lowestNumber = num1;
        if (num2 <lowestNumber){
            lowestNumber = num2;
        }
        if (num3 <lowestNumber){
            lowestNumber = num3;
        }
        return lowestNumber;
    }

    private static int getHighestNumber(int num1, int num2, int num3) {
        int highestNumber = num1;
        if (num2 >highestNumber){
            highestNumber = num2;
        }
        if (num3 >highestNumber){
            highestNumber = num3;
        }
        return highestNumber;
    }
}
