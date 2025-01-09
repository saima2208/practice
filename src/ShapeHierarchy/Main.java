package ShapeHierarchy;

import java.util.Scanner;



public class Main {
    public static void main(String[] args)  {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter radius of circle");
            double radius = input.nextDouble();
            System.out.println("Enter width of rectangle");
             double width = input.nextDouble();
            System.out.println("Enter length of rectangle");
             double length = input.nextDouble();
            System.out.println("Enter the side of a square");
             double side = input.nextDouble();


            Circle circle = new Circle(radius);
            Rectangle rectangle = new Rectangle(width,length);
            Square square = new Square(side);

            System.out.println( "The area of circle is  " + circle.calculateArea());
            System.out.println("The area of rectangle is " + rectangle.calculateArea());
            System.out.println("The area of square is " + square.calculateArea());


        } catch (NegativeNumberNotSupported e) {

            System.out.println(e.getMessage());
        } catch (LengthGreaterThanWidth e) {
            System.out.println(e.getMessage());
        }


    }
}
