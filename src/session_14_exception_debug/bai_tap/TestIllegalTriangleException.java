package session_14_exception_debug.bai_tap;

import java.util.Scanner;

public class TestIllegalTriangleException {
    private int size1;
    private int size2;
    private int size3;
    TestIllegalTriangleException(int size1, int size2, int size3) throws IllegalTriangleException {
        if (size1 < 0 || size2 < 0 || size3 < 0 || size1 + size2 < size3 || size1 + size3 < size2 || size2 + size3 < size1) {
            throw new IllegalTriangleException("ba cạnh không phù hợp: ");
        } else {
            this.size1 = size1;
            this.size2 = size2;
            this.size3 = size3;
            System.out.println("ba cạnh của tam giác là: " +" cạnh 1: " + size1+"; cạnh 2: " + size2 +"; cạnh 3: " + size3);
        }
    }
}
