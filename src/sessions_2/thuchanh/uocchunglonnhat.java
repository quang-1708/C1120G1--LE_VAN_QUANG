package sessions_2.thuchanh;

import java.util.Scanner;

public class uocchunglonnhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner uoc_chung = new Scanner(System.in);
        System.out.println("nhap so dau tien");
        a = uoc_chung.nextInt();
        a= Math.abs(a);
        System.out.println("nhap so thu hai");
        b= uoc_chung.nextInt();
        b=Math.abs(b);
        int ucln=0;
        int i;
        if(a<b){
            for(i=1; i<=a;i++){
                if(a%i==0 && b%i==0){
                    ucln =i;
                }
            }
            System.out.println("uoc chung lon nhat là: " + ucln);
        }else {
            for (i=1;i<=b;i++){
                if(a%i==0 && b%i==0){
                    ucln =i;
                }
            }
            System.out.println("uoc chung lon nhat là: " + ucln);
        }
    }
}
