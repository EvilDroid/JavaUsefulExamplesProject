package fileLineWriter;

import java.io.*;
import java.util.Scanner;

public class FileLineWriter {
    public static void main(String[] args) throws IOException {

        try (FileWriter fileWriter = new FileWriter("src/main/resources/FileWriterTest.txt")) {
            fileWriter.write("Hello Folks!");
            fileWriter.close();
        }

    }
}
