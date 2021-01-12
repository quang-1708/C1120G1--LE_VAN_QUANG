package session_6_ke_thua.bai_tap;

import java.util.Scanner;

public class Cyline extends Circle_Cyline {
    private double height =1.0;
    public Cyline () {

    }

    public Cyline(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI*getRadius()*getRadius()*this.height;
    }

    @Override
    public String toString() {
        return "Cyline{" +
                "height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Cyline cyline = new Cyline();
        System.out.println(cyline.getColor() +" " + cyline.getVolume() +" " +cyline.getArea());

        Scanner input = new Scanner(System.in);
        System.out.println("nhap ban kinh moi");
        double newradius = input.nextDouble();
        System.out.println("nhap chieu cao moi");
        double newheight = input.nextDouble();
        cyline.setHeight(newheight);
        cyline.setRadius(newradius);
        cyline.setColor("green");
        System.out.println(cyline.getColor() +" " + cyline.getVolume() +" " +cyline.getArea());
    }

}
