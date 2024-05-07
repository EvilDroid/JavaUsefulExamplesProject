package findNumbersInString;

import java.util.ArrayList;

import static checkThatStringIsInteger.checkThatStringIsInteger.isStringInt;

public class findNumbersInString {
    public static void main(String[] args) {
        String str = "34 767 44 fgh";
        ArrayList<Integer> arr = findNumbersInString(str);
    }

    public static ArrayList<Integer> findNumbersInString(String text) {
        ArrayList <Integer> numbersArray = new ArrayList<>();
        String[] arrayFromString = text.split(" ");
        for (String s : arrayFromString){
            if (isStringInt(s)){
                numbersArray.add(Integer.parseInt(s));
            }
        }
        return numbersArray;
    }

}
