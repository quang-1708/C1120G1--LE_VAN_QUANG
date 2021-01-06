package session_3_mang_phuong_thuc.thuc_hanh;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        int i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap so luong cua mang");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("ban nhap so qua lon");
            }
        } while (size > 20);
        array = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("nhap phan tu thứ: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.printf("Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.printf("Array1: ");
        for (int z = 0; z < array.length/2; z++) {
            int temp = array[z];
            array[z] = array[array.length - 1 - z];
            array[array.length - 1 - z] = temp;
        }
        System.out.printf("Array1: ");
        for (int z = 0; z < array.length; z++){
            System.out.print(array[z] +" ");
        }
    }
}
