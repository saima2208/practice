package Class_2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER AN INTEGER FOR SECOND: ");
        int seconds = input.nextInt();
        int minutes = seconds/ 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }
}
