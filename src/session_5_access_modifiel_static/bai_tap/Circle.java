package session_5_access_modifiel_static.bai_tap;

import java.util.Scanner;

public class Circle {
    private double radius;
    // đang dùng private nếu không có static muốn dùng radius phải gọi đối tượng
    private String color =" red";

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
    public Circle() {

    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color= color;
    }
    public double getArea() {
        return this.radius*this.radius*3.14;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        // gọi đối tượng để dùng radius
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bán kính");
        circle.radius = scanner.nextDouble();
        System.out.println("dien tich hinh tron: " + circle.getArea() );
        System.out.println("nhap ban kinh moi");
        double newradius = scanner.nextDouble();
        circle.setRadius(newradius);
        System.out.println("dien tich hinh tron moi: " + circle.getArea());
    }
}
