package ClassWork;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
            boolean bool = true;
        if (sum <100){
            System.out.println(bool);
       }else {
            System.out.println("False");
        }
       //or
       // System.out.println(sum < 100);
       //LocalDateTime dateTime = new LocalDateTime.now();
    }
}
