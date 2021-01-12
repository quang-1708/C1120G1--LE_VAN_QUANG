package session_4_lop_va_doi_tuong.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    private double width;
    private double height;

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public LopHinhChuNhat() {

    }

    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + this.width + ", height=" + this.height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        LopHinhChuNhat hinhchunhat = new LopHinhChuNhat(width, height);
        System.out.println("Your Rectangle \n" + hinhchunhat.display());
        System.out.println("Perimeter of the Rectangle: " + hinhchunhat.getPerimeter());
        System.out.println("Area of the Rectangle: " + hinhchunhat.getArea());
    }
}
