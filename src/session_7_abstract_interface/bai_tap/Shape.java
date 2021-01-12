package session_7_abstract_interface.bai_tap;

public class Shape {
    private static String color ="red";
    protected boolean filled=true;
    public Shape () {

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +"A Shape with color of "+
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
