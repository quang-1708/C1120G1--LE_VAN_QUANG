package session_15_io.bai_tap.bai_tap_1;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile1 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("list.csv");
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line.split(",")[5]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
