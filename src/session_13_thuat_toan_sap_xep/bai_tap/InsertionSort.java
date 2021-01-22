package session_13_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử thứ: " +(i+1));
            array[i] = scanner.nextInt();
        }
        System.out.println("mảng ban đầu: " + Arrays.toString(array));
        insertionsort(array);
        System.out.println("mảng sau khi sắp xếp" + Arrays.toString(array));
    }

    private static void insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
//            int tempIndex =i;
            int j;
            for (j = i + 1; j >= 0 && array[j] > temp; j--) {
                if (temp < array[j]) {
                    array[j + 1] = array[j];
//                    tempIndex =j;
                }
            }
            array[j + 1] = temp;
        }

    }
}
