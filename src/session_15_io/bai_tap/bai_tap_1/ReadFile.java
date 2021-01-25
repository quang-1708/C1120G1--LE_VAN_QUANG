package session_15_io.bai_tap.bai_tap_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fileReader;
        BufferedReader bufferReader;
        try {
            fileReader = new FileReader("list.txt");
            bufferReader = new BufferedReader(fileReader);
            String line;
            while ((line =bufferReader.readLine()) != null) {
                System.out.println(line.split(" , "));
            }
            bufferReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
