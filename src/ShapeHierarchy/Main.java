package ShapeHierarchy;

public class Main {
    public static void main(String[] args) throws NegativeNumberNotSupported {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(22,5);
        Square square = new Square(-4);
        try {
            circle.calculateArea();
            rectangle.calculateArea();
            square.calculateArea();
            System.out.println(" The area of circle is " + circle.calculateArea());
            System.out.println(" The area of Rectangle is " + rectangle.calculateArea());
            System.out.println(" The area of Square is " +square.calculateArea());
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }


    }
}
