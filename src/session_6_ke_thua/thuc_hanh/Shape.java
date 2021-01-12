package session_6_ke_thua.thuc_hanh;

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
