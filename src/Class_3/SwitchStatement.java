package Class_3;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNumber = sc.nextInt();

        // case expression
        caseExpression(monthNumber);

       // case statement
        caseStatement(monthNumber);

        //Basic ef/else logic
        basicIfElse(monthNumber);

    }

    private static void basicIfElse(int monthNumber) {
        System.out.println("With basic if/else ");
        if(monthNumber ==1){
            System.out.println("January");
        } else if(monthNumber ==2){
            System.out.println("February");
        } else if(monthNumber ==3){
            System.out.println("March");
        } else if(monthNumber ==4){
            System.out.println("April");
        } else if(monthNumber ==5){
            System.out.println("MAY");
        } else if(monthNumber ==6){
            System.out.println("JUNE");
        } else if(monthNumber ==7){
            System.out.println("JULY");
        } else if(monthNumber ==8){
            System.out.println("AUGUST");
        } else if(monthNumber ==9){
            System.out.println("SEPTEMBER");
        } else if(monthNumber ==10){
            System.out.println("OCTOBER");
        } else if(monthNumber ==11){
            System.out.println("NOVEMBER");
        } else if (monthNumber == 12) {
            System.out.println("DECEMBER");
        } else {
            System.out.println("input valid month");
        }
    }

    private static void caseStatement(int monthNumber) {
        System.out.println("With case statement");
        switch (monthNumber) {
            case 1 : System.out.println("January");
                break;
            case 2 : System.out.println("February");
                break;
            case 3 : System.out.println("March");
                break;
            case 4 : System.out.println("April");
                break;
            case 5 : System.out.println("MAY");
                break;
            case 6 : System.out.println("JUNE");
                break;
            case 7 : System.out.println("JULY");
                break;
            case 8 : System.out.println("AUGUST");
                break;
            case 9 : System.out.println("SEPTEMBER");
                break;
            case 10 : System.out.println("OCTOBER");
                break;
            case 11 : System.out.println("NOVEMBER");
                break;
            case 12 : System.out.println("DECEMBER");

            default : System.out.println("input valid month");
        }
    }

    private static void caseExpression(int monthNumber) {
        System.out.println("With case expression");
        switch (monthNumber) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("MAY");
            case 6 -> System.out.println("JUNE");
            case 7 -> System.out.println("JULY");
            case 8 -> System.out.println("AUGUST");
            case 9 -> System.out.println("SEPTEMBER");
            case 10 -> System.out.println("OCTOBER");
            case 11 -> System.out.println("NOVEMBER");
            case 12 -> System.out.println("DECEMBER");
            default -> System.out.println("input valid month");
        }
    }


}


