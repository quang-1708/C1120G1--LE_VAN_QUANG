package sessions_1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CalculatorArea {
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
