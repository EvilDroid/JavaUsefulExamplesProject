package inputFromConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputFromConsole {
    public static void main(String[] args) throws IOException {

        //BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.

        //Scanner
        //Использовать Scanner довольно удобно, но от этого не очень много пользы. Дело в том, что в будущем (и в учебе, и на работе) ты будешь часто использовать объекты BufferedReader и InputStreamReader и очень-очень редко объект типа Scanner. В данной ситуации он удобен, но в будущем толку от него мало. Так что мы пользоваться им не будем.
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();
    }
}
