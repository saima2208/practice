package ShapeHierarchy;

public class Square extends  Rectangle{

    public Square(int side) throws NegativeNumberNotSupported {
        super(side, side);
        if (side < 0){
            throw new NegativeNumberNotSupported("Negative Number Not Supported");
        }

    }




}


