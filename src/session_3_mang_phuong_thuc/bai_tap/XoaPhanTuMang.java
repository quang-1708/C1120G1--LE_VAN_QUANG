package session_3_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap so luong cua mang");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("so luong qua lon");
            }

        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu: " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.printf("Array: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        int num;
        System.out.println("nhap so can kiem tra");
        num = scanner.nextInt();
        int index_del=0;
        boolean check = false;
        for (int z = 0; z < arr.length; z++) {
            if (arr[z] == num) {
                index_del = z;
                System.out.println(num + " co trong mang");
                check = true;
                break;
            }

        }
        if (check == false) {
            System.out.println(num + " ko co trong mang");
        }
        for (int k = index_del; k < arr.length-1; k++) {
                arr[k]= arr[k+1];
        }
        arr[arr.length-1]= 0;
        index_del--;
        System.out.printf("Array new: ");
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
    }
}
