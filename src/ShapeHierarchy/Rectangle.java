package ShapeHierarchy;

 class Rectangle  extends Shape {
    double width;
    double length;

    public Rectangle(double width, double length) throws NegativeNumberNotSupported, LengthGreaterThanWidth {
        super();
        if (width < 0 || length < 0) {
            throw new NegativeNumberNotSupported("Negative number not supported");
        }
        if (length < width){
            throw new LengthGreaterThanWidth("Length must be greater than width");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return (width * length);
    }




}


