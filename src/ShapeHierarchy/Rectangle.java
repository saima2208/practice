package ShapeHierarchy;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) throws NegativeNumberNotSupported {
        if (width < 0 || height < 0) {
            throw new NegativeNumberNotSupported("Negative number not Supported");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }


}




/*
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double recArea = width * height;
    }


}*/
