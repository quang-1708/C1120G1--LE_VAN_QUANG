package session_15_io.bai_tap.bai_tap_1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    static final String list = "src/session_14_io/bai_tap_1/list.txt";

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(list);
            fileWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
