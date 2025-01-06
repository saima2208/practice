package Class_6;

import java.util.Arrays;
import java.util.Scanner;

public class Single_Dimensional_Array {
    public static void main(String[] args) {

        int [] marks = new int[14];
        marks[0] = 50;
        marks[2] = 55;

        marks[13] = 75;

        String [] names = {"Iqram", "OMAR","HIMU","RASEL","ZAKARIA","FAYSAL","ZAHID","HEMEL","MEME","BITHY","SAIMA","FARZANA","ASHIK","NAHID"};
        names [5] = "rffg";
        System.out.println(names[5]);


        System.out.println(marks[13]);

        System.out.println("Common for loop ");
        for ( int i = 0; i < marks.length; i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
        System.out.println("For each");
        System.out.print("[");


            String st = "";
        for ( int m : marks){
            st = st + m + " ,";


        }
        st = st.substring(0, st.length() - 2);
        System.out.print(st);
        System.out.print("]");

        System.out.println();
        System.out.println("Print with Array class");
        String arr = Arrays.toString(marks);
        System.out.println(arr.substring(1, arr.length() -1));
        System.out.println(Arrays.toString(marks));

        System.out.println(arr.length());
        System.out.println(marks.length);


    }
}
