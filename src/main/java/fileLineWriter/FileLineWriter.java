package fileLineWriter;

import java.io.*;
import java.util.Scanner;

public class FileLineWriter {
    public static void main(String[] args) throws IOException {

        //no buffered
        try (FileWriter fileWriter = new FileWriter("src/main/resources/FileWriterTest.txt")) {
            fileWriter.write("Hello Folks!");
            fileWriter.close();
        }

        //buffered
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("src/main/resources/FileWriterTest.txt"))) {
            fileWriter.write("Hello Folks!");
            fileWriter.close();
        }
    }
}
