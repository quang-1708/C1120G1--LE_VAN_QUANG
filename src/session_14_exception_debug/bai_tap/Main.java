package session_14_exception_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh thứ nhất: ");
        a = scanner.nextInt();

        System.out.println("nhập cạnh thứ 2: ");
        b = scanner.nextInt();

        System.out.println("nhập cạnh thứ 3: ");
        c = scanner.nextInt();

        try {
            TestIllegalTriangleException testIllegalTriangleException = new TestIllegalTriangleException(a, b,c);
        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }
    }
}
