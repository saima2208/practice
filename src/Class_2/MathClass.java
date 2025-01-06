package Class_2;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){
        int abs = Math.abs(-98);
        System.out.println(abs);

        double pow = Math.pow(2, 3);
        System.out.println(pow);
        double ceil = Math.ceil(123.1233);
        System.out.println(ceil);
        double floor = Math.floor(123.1234);
        System.out.println(floor);
        long round = Math.round(1223.72345);
        System.out.println(round);
        double random = Math.random();
        System.out.println(random);

        int castedInd = (int) (random * 100);
        System.out.println(castedInd);
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        double celsius = temp.nextDouble();
        double fahrenheit = ((celsius * 9 )/ 5 )+ 32;
        System.out.println(" Celsius " + celsius + " is " + fahrenheit + " in fahrenheit");
    }
}
