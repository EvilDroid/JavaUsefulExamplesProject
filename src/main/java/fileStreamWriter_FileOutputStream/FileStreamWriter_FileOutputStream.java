package fileStreamWriter_FileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamWriter_FileOutputStream {
    public static void main(String[] args) throws IOException {
        String input = "some interesting text";
        byte [] biteArray = input.getBytes();
        writeStreamToFile("FileWriterTest", biteArray);

    }

    public static void writeStreamToFile (String fileName, byte [] biteArray) throws IOException {
        String fileFullAdress = "src/main/resources/" + fileName + ".txt";
        new File(fileFullAdress);
        try (FileOutputStream fos = new FileOutputStream(fileFullAdress)) {
            fos.write(biteArray);
        }
    }
}
