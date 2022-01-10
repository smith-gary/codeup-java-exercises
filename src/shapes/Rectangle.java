package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    public Rectangle(double length, double width) {
        super(length, width);
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
