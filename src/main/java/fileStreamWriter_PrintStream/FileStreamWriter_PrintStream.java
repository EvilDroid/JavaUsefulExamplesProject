package fileStreamWriter_PrintStream;

import java.io.IOException;
import java.io.PrintStream;

public class FileStreamWriter_PrintStream {
    public static void main(String[] args) {

        try (PrintStream printStream = new PrintStream("notes.txt")) {

            //write print
            printStream.print("Hello World!");
            //write println
            printStream.println("Welcome to Java!");
            //write printf
            printStream.printf("Name: %s Age: %d \n", "Tom", 34);
            //write bytes
            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
