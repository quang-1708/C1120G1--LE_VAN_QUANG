package session_16_binary_file.bai_tap.common;

import session_16_binary_file.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FunWriteAndRead {
    static public final String PATH_FILE = "src/session_16_binary_file/bai_tap/data/Product.csv";
    static File file = new File(PATH_FILE);
    public static void writeProduct(List<Product> list, boolean selection) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,selection);
            // lưu ý chổ này
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product : list) {
                bufferedWriter.write(product.getInfor());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Product> readProduct() {
        List<Product> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line=" ";
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {

                    arr = line.split(",");
                    Product product = new Product(arr[0], arr[1], arr[2], arr[3],arr[4]);
                    list.add(product);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return list;
    }
}
