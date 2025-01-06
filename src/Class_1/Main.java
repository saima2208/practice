package Class_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n = 0;
        try {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println(n + " can be fitted in byte");
            } else if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                System.out.println(n + " can be fitted in short");
            } else if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                System.out.println(n + " can be fitted in integer");
            } else if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                System.out.println(n + " can be fitted in integer");
            } else {
                System.out.println(n + " can't be fitted anywhere");
            }
        } catch (Exception e) {
            System.out.println(n + " can't be fitted anywhere");
            ;
        }
    }
    }






