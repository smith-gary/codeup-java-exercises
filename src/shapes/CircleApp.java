package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input sc = new Input();
        System.out.println("What is the radius of the circle? ");
        double userInput = sc.getScanner().nextDouble();
        Circle rad = new Circle(userInput);
        System.out.println(rad.getArea());
        System.out.println(rad.getCircumference());

    }
}
