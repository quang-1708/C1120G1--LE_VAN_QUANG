package sessions_1.thuc_hanh;

import java.util.Scanner;

public class phuongtrinhbac1 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner pt = new Scanner(System.in);
        System.out.println("nhap he so a");
        a = pt.nextDouble();
        System.out.println("nhap he so b");
        b = pt.nextDouble();
        if(a !=0){
            double x = -b/a;
            System.out.println("phuong trinh co 1 nghiem duy nhat: " + x);
        }else if(a==0){
            if(b !=0){
                System.out.println("phuong trinh vo nghiem");
            }else {
                System.out.println("phuong trinh co vo so nghiem");
            }
        }
    }
}
