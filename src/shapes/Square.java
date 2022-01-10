package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side,side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double setLength(double length) {
        return 0;
    }

    @Override
    public double setWidth(double width) {
        return 0;
    }
}
