package session_3_mang_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatMang {
    public static void main(String[] args) {
        int number;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập số lượng của mảng:");
            number = scanner.nextInt();
            if (number < 1)
                System.out.println("số lượng của mảng phải lớn hơn 0");
        } while (number < 1);
        array = new int[number];
        for (int i = 0; i < array.length;i++) {
            System.out.print("nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array: " + Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.printf("\n");
        System.out.println("GTNN của mảng : " + min);
    }
}
