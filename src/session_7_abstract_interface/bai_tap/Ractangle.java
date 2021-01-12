package session_7_abstract_interface.bai_tap;

public class Ractangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Ractangle() {
    }

    public Ractangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Ractangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}'+ super.toString();
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + getWidth()*percent/100);
        setLength(getLength() + getLength()*percent/100);
    }
}
