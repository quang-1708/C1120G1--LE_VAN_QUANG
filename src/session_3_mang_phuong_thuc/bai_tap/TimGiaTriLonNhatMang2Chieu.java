package session_3_mang_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatMang2Chieu {
    public static void main(String[] args) {
        int arr[][];
        int row;
        int column;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập só cột : ");
            row = scanner.nextInt();
            System.out.print("nhập số hàng : ");
            column = scanner.nextInt();
            if (column < 1){
                System.out.println("Column phải lớn hơn 0");
            }
            if (row < 1) {
                System.out.println("Row phải lớn hơn 0");
            }
        } while (row < 1 || column < 1);
        arr = new int[row][column];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print("nhập phần tử thứ: " +i +j +" : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng hai chiều :");
        for (int i = 0; i <arr.length; i++) {
            System.out.println( Arrays.toString(arr[i]));
        }
        System.out.println("GTLN của mảng là: " + max(arr));
    }
    public static int max(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
