package session_11_map_tree.bai_tap;

import java.util.Scanner;

public class ProductManagerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager list = new ProductManager();
        int choice = -1;
        while (choice != 0) {
            System.out.println("1.AddProduct");
            System.out.println("2.EditProduct");
            System.out.println("3.DisplayProduct");
            System.out.println("4.SearchProduct");
            System.out.println("5.DeletProduct");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    list.AddProduct();
                    break;
                case 2:
                    list.EditProduct();
                    break;
                case 3:
                    list.DisplayProduct();
                    break;
                case 4:
                    list.SearchProduct();
                    break;
                case 5:
                    list.DeletProduct();
            }
        }
    }
}
