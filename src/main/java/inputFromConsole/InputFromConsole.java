package inputFromConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromConsole {
    public static void main(String[] args) throws IOException {

        //BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        bufferedReader.close();

        //Scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();
    }
}
