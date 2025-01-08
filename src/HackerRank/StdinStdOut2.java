package HackerRank;
import java.util.Scanner;
import java.io.*;

public class StdinStdOut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        System.out.println("Enter a double number");
        double num2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Write something ");
        String st = sc.nextLine();
        //sc.nextLine();
        sc.close();

        System.out.println("String: " + st);
        //sc.nextLine();
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num);
    }
}
