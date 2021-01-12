package session_7_abstract_interface.bai_tap;

public class Squares extends Ractangle implements Colorable {
    public Squares() {
    }

    public Squares(double width, double length) {
        super(width, length);
    }

    public Squares(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public Squares(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        

    }
}
