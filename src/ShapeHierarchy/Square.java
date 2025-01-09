package ShapeHierarchy;

 class Square extends  Rectangle{
    private double side;

    public Square( double side) throws NegativeNumberNotSupported, LengthGreaterThanWidth {
        super(side,side);
        if (side < 0){
            throw new NegativeNumberNotSupported("Negative number not supported");
        }
        this.side = side;
    }



/*
   @Override
    public double calculateArea(double side) {
        return side * side;
    }*/


}







