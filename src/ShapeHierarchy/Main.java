package ShapeHierarchy;

public class Main {
    public static void main(String[] args) throws NegativeNumberNotSupported {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(22,5);
        Square square = new Square(5);
        try {
            circle.calculateArea();
            rectangle.calculateArea();
            square.calculateArea();
           // System.out.println(" The area of circle is " + circle.calculateArea(5));
           // System.out.println(" The area of Rectangle is " + rectangle.calculateArea(););
            System.out.println(" The area of Square is " +square);
        } catch (Exception e) {
            throw new NegativeNumberNotSupported();
        }


    }
}
