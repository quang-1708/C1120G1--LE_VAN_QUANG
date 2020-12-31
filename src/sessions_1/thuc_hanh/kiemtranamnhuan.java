package sessions_1.thuc_hanh;

import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        int year;
        Scanner inputyear = new Scanner(System.in);
        System.out.println("hay nhap nam kiem tra");
        year = inputyear.nextInt();
        if(year %4==0){
            if(year %100 !=0){
                System.out.println(year+ " la nam nhuan");
            }else if(year%400==0) {
                System.out.println(year+ " la nam nhuan");
            }else {
                System.out.println(year+ "khong phai la nam nhuan");
            }
        }else {
            System.out.println(year+ " khong phai la nam nhuan");
        }
    }
}
