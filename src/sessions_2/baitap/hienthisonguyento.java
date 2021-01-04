package sessions_2.baitap;

import java.util.Scanner;

public class hienthisonguyento {
    public static void main(String[] args) {
        Scanner checkprime = new Scanner(System.in);
        int num = 2;
        int dem=1;
        int count = 0;
        while (dem <= 20) {
            count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num);
                dem++;
            }
            num++;
        }
    }
}
