package session_3_mang_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class GiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap so luong cua mang");
            size = scanner.nextInt();
            if(size >20){
                System.out.println("so luong qua lon");
            }

        }while (size >20);
        arr =new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("nhap phan tu thu: " +(i+1) );
            arr[i] = scanner.nextInt();
        }
        System.out.printf("Array: ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] +" ");
        }
        int max = arr[0];
        for(int z=0;z<arr.length;z++) {
            if(arr[z] > max){
                max = arr[z];
            }
        }
        System.out.println("GTLN: " +max);
    }
}
