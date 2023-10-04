package shapes;
import util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Input radius = new Input();
        circle1.radius = radius.getDouble();
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
    }
}
