package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Exception {
    public static void main(String[] args) {


            try {
                Scanner input = new Scanner(System.in);
                int x = input.nextInt();
                int y = input.nextInt();
                int result = x/y;
                if (y == 0) {
                    throw new ArithmeticException("Divisor can not be zero");
                }
                System.out.println(result);
                //if ()
            } catch (ArithmeticException e) {
                System.out.println("Divisor can not be zero ");
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch");
           } finally {
               //input.close();
            }


        }
    }




