package ClassWork;

import java.util.Scanner;

public class ReturnNextNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int n = sc.nextInt();
        int nextNumber = nextNumber(n);
      System.out.println("Next number is " + nextNumber(n));


    }
    static int nextNumber(int n){
        return n+1;
    }
}
