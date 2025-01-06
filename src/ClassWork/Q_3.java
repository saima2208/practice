package ClassWork;

import java.util.Arrays;

public class Q_3 {
    private static int sum;

    public static void main(String[] args) {
        int[] array = {33, 22, 77, 660, 12, 88, 99, 55, 2, 4, 5, 6, 7, 8, 9, 10};


        int sumOfEven = sumOfEven(array);
        System.out.println("The sum of even number is " + sumOfEven);
        int sumOfOdd = sumOfOdd(array);
        System.out.println("The sum of odd number is " + sumOfOdd);
        int difference = differenceOfOddAndEven(sumOfEven, sumOfOdd);
        System.out.println("The difference  between sum of even number and sum of odd number is " + difference);

    }

    static int sumOfEven(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    static int sumOfOdd(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 1) {
                sum += num;
            }
        }
        return sum;
    }

    static int differenceOfOddAndEven(int sumOfEven, int sumOfOdd) {
        return sumOfEven - sumOfOdd;
    }
}
