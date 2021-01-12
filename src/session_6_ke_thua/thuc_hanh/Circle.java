package session_6_ke_thua.thuc_hanh;

public class Circle extends Shape {
    private static double radius =1.0;

    public Circle (){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public  void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Circle.radius*Circle.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}'+ super.toString();
    }

}
