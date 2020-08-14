public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length =length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea(){
        return this.length * this.width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
    @Override
    public String toString(){
        return "Rectangle[width=" + this.width + ",length=" + this.length
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
    public static void main(String[] args){

    }
}
