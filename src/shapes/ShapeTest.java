package shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Measurable myShape;
        Square box1 = new Square(5);
        Rectangle box2 = new Rectangle(4,5);
//        myShape = box1;
        myShape = box2;
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape);

//

    }
}
