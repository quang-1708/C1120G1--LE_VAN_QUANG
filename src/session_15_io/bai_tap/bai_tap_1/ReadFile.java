package session_15_io.bai_tap.bai_tap_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fileReader;
        BufferedReader bufferReader;
        try {
            fileReader = new FileReader("source_file.txt");
            bufferReader = new BufferedReader(fileReader);
            StringBuffer result = new StringBuffer();
            String line;
            while ((line= bufferReader.readLine()) !=null){
                result.append(line);
            }
            System.out.println(result);
            bufferReader.close();
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
