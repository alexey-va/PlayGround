import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square {

    Point leftUpperCorner;
    double side;

    public Square(double x, double y, double side){
        this(new Point(x,y), side);
    }

    public BrokenLine toLine(){
        return new BrokenLine(
                new Point(leftUpperCorner.x, leftUpperCorner.y),
                new Point(leftUpperCorner.x+side, leftUpperCorner.y),
                new Point(leftUpperCorner.x+side, leftUpperCorner.y-side),
                new Point(leftUpperCorner.x, leftUpperCorner.y-side),
                new Point(leftUpperCorner.x, leftUpperCorner.y)
        );
    }

    @Override
    public String toString() {
        return "Square{" +
                "leftUpperCorner=" + leftUpperCorner +
                ", side=" + side +
                '}';
    }
}
