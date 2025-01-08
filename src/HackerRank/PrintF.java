package HackerRank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintF {
    public static void main(String [] args){
        /*Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int i = sc.nextInt();
        String st1 = sc.next();
        int i1 = sc.nextInt();
        String st2 = sc.next();
        int i2 = sc.nextInt();


        //double dbl = 222;
        //char ch = '@';
        //boolean myBoolean = true;
        System.out.println("================================");
        System.out.printf("%-14s\t%03d\n%-14s\t%03d\n%-14s\t%03d\n",st,i,st1,i1,st2,i2);
        System.out.println("================================");
        //System.out.printf("%-15s\t%03d",st2,i2);


        LocalDateTime dateTime =  LocalDateTime.now();
        System.out.println(dateTime);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alfi");
        arrayList.add("Alfi");
        arrayList.add("Ashfi");
        arrayList.add("Ayaat");
        arrayList.add("Ayan");
        arrayList.add(1,"Anas");
        arrayList.set(2,"Aziza");
        Collections.sort(arrayList,Collections.reverseOrder());
       // System.out.println(arrayList.get(2));
        System.out.println(arrayList);
        for (String i : arrayList){
            System.out.println(i);
        }

        //System.out.println(arrayList.size());

         */
        int[] num= {2,4,5,6,7,22,77,88,11,99,22};
        int sum = 0;
        //long multiplication = 1;
        for (int i = 0;i < num.length;i++){
            if (num[i] < 5)
            sum += num[i];
           // multiplication *= num[i];
        }
        System.out.println("The sum is " + sum);
        //System.out.println("Multiplication " + multiplication);
    }
}
