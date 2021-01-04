package sessions_2.thuchanh;

import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap so can kiem tra");
        num = scanner.nextInt();
        int count = 0;
        for(int i=1; i<=num;i++){
            if(num % i==0){
                count++;
            }
        }
        if(count ==2){
            System.out.println(num +" la so nguyen to");
        }else {
            System.out.println(num +" khong phai la so nguyen to");
        }
    }
}
