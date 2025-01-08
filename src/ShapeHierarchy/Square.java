package ShapeHierarchy;

public class Square extends  Rectangle{

    public Square(int side) {
        super(side, side);

    }


    public void setSide(double side) {
        this.height = side;
        this.width = side;

    }

}
