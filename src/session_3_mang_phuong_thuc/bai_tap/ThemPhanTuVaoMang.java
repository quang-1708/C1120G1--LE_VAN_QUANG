package session_3_mang_phuong_thuc.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int numbers;
        int index;
        int number;
        int arr[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập số lượng của mảng: ");
            numbers = scanner.nextInt();
            if (numbers < 1) {
                System.out.println("số lượng của mảng không được nhỏ hơn 0");
            }
        } while (numbers < 1);
        arr = new int[numbers];
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("nhaaph phần tử " + (i +1) +": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Old Array : " + Arrays.toString(arr));
        System.out.print("nhập số cần thêm: ");
        number = scanner.nextInt();
        do {
            System.out.println("nhập vị trí cần thêm: ");
            index = scanner.nextInt();
            if (index < 0 || index > (arr.length -1)){
                System.out.print("vị trí khong duoc nho hon 0 va lon hon chieu dai");
            }
        }while (index < 0 || index > (arr.length -1));
        System.out.println("New Array : " + them_phan_tu(arr,number,index));
    }
    public static String them_phan_tu (int arr[],int number,int index){
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < newArray.length ; i++) {
            if(i < index){
                newArray[i] = arr[i];
            } else if (i == index){
                newArray[i] = number;
            } else {
                newArray[i] = arr[i - 1];
            }
        }
        return Arrays.toString(newArray);
    }
}
