package shapes;

public class Rectangle {

    protected double length, width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

public void setLength(){
    this.length = length;
}

public double getLength(){
    return length;
}

public void setWidth(){
    this.width = width;
}

public double getWidth(){
    return width;
}

public double getArea (){
    return length * width;
}

public double getPerimeter(){
    return 2 * (length + width);
}


}
