public class Circle {
    private double radius = 1.0;
    private String color = "red";
    protected final double PI = 3.14;
    public Circle(){};

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return PI * this.radius * this.radius;
    }

    public String toString(){
        return "Circle[radius=" + this.radius + "color=" + this.color +"]";
    }

    public static void main(String[] args){
        Circle c = new Circle(19, "blue");
        double x = c.getArea();
        System.out.println(x);
        String s = c.toString();
        System.out.println(s);
    }
}
