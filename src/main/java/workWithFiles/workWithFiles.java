package workWithFiles;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class workWithFiles {
    public static void main(String[] args) throws IOException {

        //Read write text file
            FileReader reader = new FileReader("c:/data.txt");
            FileWriter writer = new FileWriter("c:/result.txt");

            while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
            {
                int data = reader.read(); //читаем один символ (char будет расширен до int)
                writer.write(data); //пишем один символ (int будет обрезан/сужен до char)
            }

            //закрываем потоки после использования
            reader.close();
            writer.close();
        }
}
