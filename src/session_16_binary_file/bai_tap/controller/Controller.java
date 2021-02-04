package session_16_binary_file.bai_tap.controller;

import session_16_binary_file.bai_tap.server.ProductManager;

import java.util.Scanner;

public class Controller{
    static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Chọn chức năng\n" +
                    "1. Add\n" +
                    "2. Show list\n" +
                    "3. Edit\n" +
                    "4. Delete\n" +
                    "5. Search\n" +
                    "6. Exit");
            int chooseMain = Integer.parseInt(scanner.nextLine());
            switch (chooseMain) {
                case 1:
                    productManager.addNewProduct();
                    break;
                case 2:
                    productManager.showProductList();
                    break;
                case 3:
                    productManager.editProduct();
                    break;
                case 4:
                    productManager.deleteProduct();
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }

    }
}
