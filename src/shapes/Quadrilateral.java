package shapes;

public abstract class Quadrilateral implements Measurable {

    protected int length;
    protected int width;

    Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
