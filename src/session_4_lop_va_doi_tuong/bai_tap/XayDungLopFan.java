package session_4_lop_va_doi_tuong.bai_tap;

public class XayDungLopFan {
    public final double SLOW = 1;
    public final double MEDIUM = 2;
    public final double FAST =3;
    private int SPEED;
    private boolean ON;
    private double radius =5;
    private String color = "blue";

    public double getSLOW() {
        return SLOW;
    }

    public double getMEDIUM() {
        return MEDIUM;
    }

    public double getFAST() {
        return FAST;
    }

    public int getSPEED() {
        return SPEED;
    }

    public void setSPEED(int SPEED) {
        this.SPEED = SPEED;
    }

    public boolean isON() {
        return ON;
    }

    public void setON(boolean ON) {
        this.ON = ON;
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
    public XayDungLopFan(){

    }

    public XayDungLopFan(int SPEED, boolean ON, double radius, String color) {
        this.SPEED = SPEED;
        this.ON = ON;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (isON()) {
            return "XayDungLopFan{" +
                    "Fan is ON" +
                    "SPEED=" + SPEED +
                    ", ON=" + ON +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "XayDungLopFan{" +
                    "Fan is OFF" +
                    "SPEED=" + SPEED +
                    ", ON=" + ON +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        XayDungLopFan FAN1 = new XayDungLopFan(1,true,10,"yellow" );
        XayDungLopFan FAN2 = new XayDungLopFan(1,false,5,"blue");
        System.out.println(FAN1);
        System.out.println(FAN2);
    }
}
