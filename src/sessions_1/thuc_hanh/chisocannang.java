package sessions_1.thuc_hanh;

import java.util.Scanner;

public class chisocannang {
    public static void main(String[] args) {
        float width;
        float heigth;
        Scanner chisocanang = new Scanner(System.in);
        System.out.println("Nhap can nang");
        width = chisocanang.nextFloat();
        System.out.println("Nhap chieu cao");
        heigth = chisocanang.nextFloat();
        float bmi = width/(heigth*heigth);
        if(bmi >=30){
            System.out.println("ban qua nang");
        }else if(bmi >=25) {
            System.out.println("Ban thua can");
        }else if (bmi >=18){
            System.out.println("Ban binh thuong");
        }else {
            System.out.println("Ban qua gay");
        }
    }
}
