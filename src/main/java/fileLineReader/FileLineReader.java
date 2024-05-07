package fileLineReader;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileLineReader {
    public static void main(String[] args) throws IOException {


        //FileReader
        StringBuffer fileContent = new StringBuffer("");
        FileReader fileReader = new FileReader("file.txt");
        char currentChar;
        while (fileReader.ready()) {
            currentChar = (char)fileReader.read();
            fileContent.append(currentChar);
        }
        fileReader.close();

        //buffered FileReader
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        //Scanner
        Scanner scanner = new Scanner(new File("file.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        //or
        try {
            String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\fileLineReader\\";
            String fileName = "file.txt";
            File file = new File(filePath + fileName);

            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line2 = input.nextLine();
                System.out.println(line2);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //or
//        StringBuilder stringBuilderString = new StringBuilder();
//        BufferedReader reader = new BufferedReader(new FileReader(filename1));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            stringBuilderString.append(line);
//        }
//        reader.close();

    }
}
