package fileLineReader;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class fileLineReader {
    public static void main(String[] args) {


        try {
            String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\fileLineReader\\";
            String fileName = "file.txt";
            File file = new File(filePath + fileName);

            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
