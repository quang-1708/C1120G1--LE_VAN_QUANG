package session_4_lop_va_doi_tuong.bai_tap;

import java.util.Scanner;

public class LopPhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public LopPhuongTrinhBac2() {

    }

    public LopPhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập hệ số a");
        a = scanner.nextDouble();
        System.out.println("nhập hệ số b");
        b = scanner.nextDouble();
        System.out.println("nhập hệ số c");
        c = scanner.nextDouble();
        LopPhuongTrinhBac2 lopphuongtrinhbac2 = new LopPhuongTrinhBac2(a, b, c);
        if (lopphuongtrinhbac2.getDiscriminant() < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (lopphuongtrinhbac2.getDiscriminant() == 0) {
            System.out.println("phuong trinh có 1 nghiem duy nhat: " + (-lopphuongtrinhbac2.getB() / 2 * lopphuongtrinhbac2.getA()));
        } else {
            System.out.println("phuong trinh co hai nghiem phan biet: " + lopphuongtrinhbac2.getRoot1() + " và " + lopphuongtrinhbac2.getRoot2());
        }
    }
}
