package shapes;

public class Circle {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){

    }

    public double getArea() {
        //area = pi (r)^2
        double area = Math.PI * (this.radius * this.radius);
        return area;
    }
    public double getCircumference(){
        // 2 * PI * r
        double C = 2 * Math.PI * this.radius;
        return C;
    }

        public static void main(String[] args) {

        Circle smallCircle = new Circle(5);
            System.out.println(smallCircle.getArea());
            System.out.println(smallCircle.getCircumference());

        }
}

