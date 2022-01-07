package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        Rectangle box2 = new Square(5);
        Square box4 = new Square();
        box4.setSides(9);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
        System.out.println(box4.getPerimeter());
        System.out.println(box4.getArea());

    }
}
