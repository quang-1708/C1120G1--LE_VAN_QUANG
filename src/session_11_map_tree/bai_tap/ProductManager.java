package session_11_map_tree.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    ArrayList<Product> arr;
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        arr = new ArrayList<>(DEFAULT_CAPACITY);
    }

    public ProductManager(int size) {
        this.size = size;
        arr = new ArrayList<>(size);
    }

    public void AddProduct() {
        System.out.println("how many Product ?");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            System.out.println("Enter Product: " + (i + 1) + " infomation");

            System.out.println("nhập tên sản phẩm:");
            String name = scanner.nextLine();

            System.out.println("nhập ID:");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("nhập giá sản phẩm:");
            double prince = Double.parseDouble(scanner.nextLine());

            Product pro = new Product(name, id, prince);
            arr.add(pro);
        }
    }

    public void EditProduct() {
        int id;
        String inputName;
        int inputPrince;
        System.out.println("nhập ID muốn sửa:");
        id = Integer.parseInt(scanner.nextLine());
        for(Product product: arr){
            if(id ==product.getId()){
                System.out.println("1.Sửa tên" +
                        "2.Sửa giá");
                int chooseNumber = Integer.parseInt(scanner.nextLine());
                switch (chooseNumber){
                    case 1:
                        System.out.println("Nhập tên mới: ");
                        inputName= scanner.nextLine();
                        product.setName(inputName);
                        break;
                    case 2:
                        System.out.println("Nhập giá mới");
                        inputPrince =Integer.parseInt(scanner.nextLine());
                        product.setPrice(inputPrince);
                        break;
                }
            }
        }
        DisplayProduct();
    }
    public void DeletProduct() {
        System.out.println("nhập ID muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for(Product product: arr){
            if(id ==product.getId()){
                arr.remove(id-1);
            }
        }
        DisplayProduct();
    }

    public void DisplayProduct() {
        for (Product product : arr) {
            System.out.println(product);
        }
    }

    public void SearchProduct() {
        System.out.println("nhập tên muốn tìm");
        String newName = scanner.nextLine();
        for (Product product:arr) {
            if(product.getName().equals(newName)) {
                System.out.println(newName +" có trong danh sách");
            }else {
                System.out.println(newName +" không có trong danh sách");
            }
        }
    }
}
