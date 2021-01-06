package sessions_2_vong_lap.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int menu = -1;
        int width;
        int height;
        while (menu != 0) {
            Scanner input_menu = new Scanner(System.in);
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println(" Enter input_menu: ");
            menu = input_menu.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("1.Print the rectangle");
                    System.out.println(" hay nhap chieu dai");
                    width = input_menu.nextInt();
                    System.out.println(" hay nhap chieu rong");
                    height = input_menu.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                    System.out.println(" hay nhap chieu dai");
                    width = input_menu.nextInt();
                    System.out.println(" hay nhap chieu rong");
                    height = input_menu.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("3.Print isosceles triangle");
                    System.out.println(" hay nhap chieu dai");
                    width = input_menu.nextInt();
                    System.out.println(" hay nhap chieu rong");
                    height = input_menu.nextInt();
                    for(int i=0;i<width;i++){
                        for(int j=height; j>=i;j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for(int i=0;i<width;i++){
                        for(int j=height; j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k=0;k<=i;k++){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
