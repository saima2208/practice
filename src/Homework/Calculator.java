package Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter numbers: ");

                String input = scanner.nextLine();
                String[] sum = input.split("(?=\\D)|(?<=\\D)");

                double num1 = Double.parseDouble(sum[0]);
                String operator = sum[1];
                double num2 = Double.parseDouble(sum[2]);

                switch (operator.charAt(0)) {
                    case '+' -> System.out.println(num1 + num2);
                    case '-' -> System.out.println(num1 - num2);
                    case '*' -> System.out.println(num1 * num2);
                    case '/' -> System.out.println(num1 / num2);
                    case '%' -> System.out.println(num1 % num2);
                }
            }
        }







        /*
        if (operator == 1){
            result = num1 + num2;
            System.out.println("Addition is " + result);
        }
        else if (operator == 2){
            result = num1 - num2;
            System.out.println("Subtraction is " + result);
        } else if (operator == 3) {
            result = num1 * num2;
            System.out.println("Multiplication is " + result);
        } else if (operator == 4) {
            result = num1 / num2;
            System.out.println("Division is " + result);
        }else {
            result = num1 % num2;
            System.out.println("Remaining :" + result);
        }*/







/*
import java.util.Scanner;
public class Solution {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        if(n%2==1){
            System.out.println("Weired");
        }else{
            if(2<=n && 5>=n){
                System.out.println("Not Weired");
            }else if(n>=6 && n<=20){
                System.out.println("Weired");
            }else if (n>20){
                System.out.println("Not Weired");
            }else{
                System.out.println("Weired");
            }
        }
        sc.close();
    }*/

