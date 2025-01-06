package Class_2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your SCHOOL name: ");
        String school = scanner.nextLine();
        System.out.println(UserInput.printHi(name , age , school));






        System.out.println("The sum of the value is " + UserInput.sum());
        System.out.println("The sum of the value is " + UserInput.sum(786656 ,76554));
    }
    public static String printHi(String name, int age,String school){
        return "Hi " + name + " you are "+ " " + age + " years old and your school name is " + school;
    }

   public static int sum() {
        int a = 3;
        int b = 6;
        return a + b;
   }
    public static int sum(int a , int b) {

        return a + b;
    }
}
