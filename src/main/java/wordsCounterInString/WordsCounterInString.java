package wordsCounterInString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordsCounterInString {
    public static void main(String[] args) throws IOException {

            //filename reading from console
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String filename1 = bufferedReader.readLine(); //читаем строку с клавиатуры
            //       src/main/resources/WordsCounterTest.txt
            bufferedReader.close();

            //file reading
            StringBuffer fileContent = new StringBuffer("");
            FileReader fileReader = new FileReader(filename1);
            char currentChar;
            while (fileReader.ready()) {
                currentChar = (char)fileReader.read();
                fileContent.append(currentChar);
            }
            fileReader.close();

            //counting
            System.out.println(targetWordCounterInString(fileContent.toString(), "world"));
        }



        public static int targetWordCounterInString (String str, String target){
            int count = 0;
            char[] charsFromStr = str.toCharArray();
            char[] charsFromTarget = target.toCharArray();

            for (int i = 0; i < charsFromStr.length; i++){
                if(charsFromStr[i] == charsFromTarget[0]){
                    boolean wordMatch = false;
                    for (int j = 0; j < charsFromTarget.length; j++){
                        //check that there are some chars to compare with target after first
                        if(i+j >= charsFromStr.length){
                            wordMatch = false;
                            break;
                        }
                        //comparing char by char
                        if(charsFromStr[i+j] == charsFromTarget[j]){
                            wordMatch = true;
                            continue;
                        } else {
                            wordMatch = false;
                            break;}
                    }
                    if (wordMatch == true){
                        count++;
                    }
                }
            }
            return count;
        }

}
