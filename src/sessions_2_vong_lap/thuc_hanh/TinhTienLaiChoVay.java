package sessions_2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money;
        double num;
        int month;
        double interest_rate;
        Scanner laisuatnganhang = new Scanner(System.in);
        System.out.println("hay nhap so tien can gui");
        num = laisuatnganhang.nextDouble();
        System.out.println("nhap so thang muon gui");
        month = laisuatnganhang.nextInt();
        System.out.println(" nhap lai suat ngan hang");
        interest_rate = laisuatnganhang.nextDouble();
        money =num*interest_rate/12*month;
        System.out.println(" so tien lai cua ban la: " +money);
    }
}
