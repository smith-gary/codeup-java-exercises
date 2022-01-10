package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(4,5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(myShape);

//

    }
}
