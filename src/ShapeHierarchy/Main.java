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
        } catch (Exception e) {
            throw new NegativeNumberNotSupported();
        }


    }
}
