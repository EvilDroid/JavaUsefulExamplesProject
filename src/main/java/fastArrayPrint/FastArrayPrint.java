package fastArrayPrint;

import java.util.ArrayList;
import java.util.Arrays;

public class FastArrayPrint {
    public static void main(String[] args) {
        Object [] result = new Object [2];
        System.out.println(Arrays.toString(result));


        ArrayList <String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        System.out.println(Arrays.toString(arr.toArray()));

    }
}
