package interseptingSystemOut;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemOutInterceptor {
    public static void main(String[] args) {

        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);

        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем какой-либо вывод (System.out), который ничего не знает о наших манипуляциях
        System.out.println("text to intercept");

        //Преобразовываем записанные в наш ByteArray перехваченные данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);

        //работаем с перехваченными данными
        System.out.println(result.toUpperCase());

    }


}
