package session_6_ke_thua.thuc_hanh;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        double radius1;
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("dien tich hinh tron la: " + circle.getArea());
        System.out.println("chu vi hinh tron là: " + circle.getPerimeter());
        System.out.println("mau " +circle.getColor());
        System.out.println("nhap ban kinh moi");
        radius1 = input.nextDouble();
        circle.setRadius(radius1);
        System.out.println("dien tich moi của hinh tron là: " + circle.getArea());
        System.out.println("chu vi hinh tron moi là: " + circle.getPerimeter());
//        System.out.println("diên tích hình tròn là:" +Circle.getArea());
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap ban kinh moi");
//        radius1 = input.nextDouble();
//        Circle.setRadius(radius1);
//        System.out.println("dien tich moi của hinh tron là: " + Circle.getArea())
    }
}
