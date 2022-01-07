package shapes;

public class Square extends Rectangle {
    protected int sides;

    public Square(){}

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public Square(int side) {
        super(side, side);
    }

    public int getArea() {

        return (int) Math.pow(sides, 2);
    }

    public int getPerimeter() {
        return 4 * sides;
    }
}
