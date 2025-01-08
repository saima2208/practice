package ShapeHierarchy;

import static java.lang.Math.PI;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double circleArea = PI * radius * radius;
    }
}
