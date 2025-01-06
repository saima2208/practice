package Homework;

import java.util.Scanner;

public class resultCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter midterm marks");
        double mid = sc.nextInt();
        System.out.println("enter monthly exam marks");
        double monthMarks = sc.nextInt();
        double sum =(mid * 0.2) + (monthMarks * 0.8);
                if( sum >= 30 ){
                    System.out.println("PASS");
                }else{
                    System.out.println("FAIL");
                }
    }
}
