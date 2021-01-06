package sessions_2_vong_lap.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon_100 {
    public static void main(String[] args) {
        Scanner checkPrime = new Scanner(System.in);
        int num = 2;
        int count = 0;
        while (num <= 100) {
            count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num);
            }
            num++;
        }
    }
}
