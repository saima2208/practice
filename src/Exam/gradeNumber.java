package Exam;

import java.util.Scanner;

public class gradeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = input.nextInt();

        if (marks >= 60 && marks <=69){
            System.out.println("Your grade is B" );
        } else if (marks>=70 && marks <=89) {
            System.out.println("Your grade is A" );
        } else if (marks >= 90 && marks <=100) {
            System.out.println("Your grade is A+" );
        }else {
            System.out.println("Failed" );
        }
        input.close();
    }
}
