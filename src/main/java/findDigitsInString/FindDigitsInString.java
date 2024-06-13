package findDigitsInString;

import static checkThatCharIsInteger.CheckThatCharIsInteger.isCharInt;

public class FindDigitsInString {
    public static void main(String[] args) {
        String input = "it's 1 a 23 text 4 f5-6or7 tes8ting";
        String output = findDigitsInString(input);
        System.out.println(output);
    }

    public static String findDigitsInString (String input){
        StringBuffer strBuf = new StringBuffer();
        char [] arr =  input.toCharArray();
        for (char n : arr) {
            if(isCharInt(n)){
                strBuf.append(n);
            }
        }
        return strBuf.toString();
    }
}
