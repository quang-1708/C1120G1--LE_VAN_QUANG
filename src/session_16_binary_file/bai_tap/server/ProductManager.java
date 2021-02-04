package session_16_binary_file.bai_tap.server;

import session_16_binary_file.bai_tap.common.FunWriteAndRead;
import session_16_binary_file.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);

    public void addNewProduct() {
        List <Product> list = new ArrayList<>();
        System.out.println("Nhập id");
        String id = scanner.nextLine();

        System.out.println("Nhập tên sp");
        String name = scanner.nextLine();

        System.out.println("nhập tên hãng");
        String company = scanner.nextLine();

        System.out.println("Nhập giá");
        String price = scanner.nextLine();

        System.out.println("nhập mô tả");
        String description = scanner.nextLine();

        Product product = new Product(id ,name ,company,price, description);
        list.add(product);
        FunWriteAndRead.writeProduct(list,true);

    }

    public void showProductList() {
        List<Product> list = FunWriteAndRead.readProduct();
//        System.out.println(list.get(0));
        for (int i=0; i <list.size(); i++) {
            System.out.println((1+i)+ ". "+ list.get(i));
        }

    }

    public void editProduct() {
        List<Product> list = FunWriteAndRead.readProduct();
        showProductList();
        boolean flag=true;
        System.out.println("Chọn sản phẩm muốn sửa");
        int choose = Integer.parseInt(scanner.nextLine());
        while (flag) {
            System.out.println("chọn thông tin cần sửa\n" +
                    "1. Name\n" +
                    "2.Price\n"+
                    "3. Exit");
            int choose1 = Integer.parseInt(scanner.nextLine());
            switch (choose1) {
                case 1:
                    System.out.println("Nhập tên cần sửa");
                    String name = scanner.nextLine();
                    list.get(choose - 1).setNameSP(name);
                    break;
                case 2:
                    System.out.println("Nhập giá cần sửa");
                    String price = scanner.nextLine();
                    list.get(choose - 1).setPrice(price);
                    break;
                case 3:
                    flag =false;
                    break;
                default:
                    System.out.println("Bạn đã chọn sai. Chọn lại");
                    break;
            }

        }
        FunWriteAndRead.writeProduct(list,false);

    }

    public void deleteProduct() {

    }

    public void searchByName() {
    }
}
