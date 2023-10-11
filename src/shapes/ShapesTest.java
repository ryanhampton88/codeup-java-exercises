package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Rectangle (5, 10);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        Measurable myShape1 = new Square (5,5);
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getArea());


    }




}
