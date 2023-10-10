package shapes;

public class Square extends Quadrilateral {

Square(int length, int width) {
    super(length, width);
    }

public void setLength (int length, int width) {
    this.length = length;
    this.length = width;
}

public void setWidth (int length, int width) {
    this.width = length;
    this.width = width;
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
