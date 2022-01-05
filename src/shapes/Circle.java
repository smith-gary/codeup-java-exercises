package shapes;

import static java.lang.Math.PI;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * (Math.pow(radius, 2));
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

}
