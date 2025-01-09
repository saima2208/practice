package ShapeHierarchy;

import static java.lang.Math.PI;

 class Circle extends Shape{

    double radius;

    public Circle(double radius) throws NegativeNumberNotSupported {
        if (radius < 0){
            throw new NegativeNumberNotSupported("Negative number not supported");
        }
        this.radius = radius;

    }


    @Override
    public double calculateArea() {
        return PI * radius * radius;

    }
}
