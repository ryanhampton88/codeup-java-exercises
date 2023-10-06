package shapes;

public class Square extends Rectangle {

    public int side;

    public Square(int side){
        super(side, side);
    }

    public double getPerimeter() {
        double perimeter = 4 * width;
        return perimeter;
    }

    public double getArea() {
        double area = Math.pow(width, 2);
        return area;
    }





}
