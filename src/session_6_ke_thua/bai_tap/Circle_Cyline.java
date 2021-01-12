package session_6_ke_thua.bai_tap;

public class Circle_Cyline {
    private double radius =1.0;
    private String color ="red";
    public Circle_Cyline() {

    }

    public Circle_Cyline(double radius, String color) {
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
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle_Cyline{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
