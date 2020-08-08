public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){
        super();
    }

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + this.height + "]";
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + 2 * PI * this.getRadius() * this.height;
    }
    public static void main(String[] args){
        Cylinder d = new Cylinder(5, 7, "green");
        double x = d.getArea();
        double y = d.getVolume();
        String s = d.toString();
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}
