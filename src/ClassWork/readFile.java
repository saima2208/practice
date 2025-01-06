package ClassWork;


import java.io.*;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws Exception
    {
        // Creating BufferedReader for Input
        try {
            BufferedReader bfri = new BufferedReader(new InputStreamReader(System.in));


            System.out.print("Enter the Path : ");

            // Reading File name
           String path = bfri.readLine();


            // Note:  Double backquote is to avoid compiler
            // interpret words
            // like \test as \t (ie. as a escape sequence)

            // Creating an object of BufferedReader class
            BufferedReader bfro = new BufferedReader(
                    new FileReader(path));

            // Declaring a string variable
            String st;

            // Condition holds true till
            // there is character in a string
            while ((st = bfro.readLine()) != null)
                System.out.println(st);
        } catch (IOException e) {
            System.out.println(" File not found" + e.getMessage());
        }
    }
}






