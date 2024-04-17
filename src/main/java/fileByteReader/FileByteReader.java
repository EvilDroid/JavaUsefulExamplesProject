package fileByteReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileByteReader {
    public static void main(String[] args) throws IOException {

        String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\fileLineReader\\";
        String fileName = "file.txt";

        ArrayList<Integer> list = new ArrayList<Integer>();
        FileReader fileReader = new FileReader(filePath + fileName);
        while (fileReader.ready()) {
            list.add(fileReader.read());
        }
        fileReader.close();
    }
}
