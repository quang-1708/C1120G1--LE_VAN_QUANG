package sessions_1.thuc_hanh;

import java.util.Scanner;

public class calculator_Area {
    public static void main(String[] args) {
        float width;
        float length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat();
        System.out.println("Enter length");
        length = scanner.nextFloat();
        float Area = width*length;
        System.out.println("dien tich chu nhat: " +Area);
    }
}
