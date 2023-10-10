package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
