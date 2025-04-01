package optionalNullChecking;

import java.util.Optional;

public class OptionalNullChecking {

    public static void main(String[] args) {


        String s1 = null;
        String s2 = "s2";

        //This code generates NullPointerException

//        boolean isEqual = s1.equals(s2);
//        System.out.println(isEqual);

        //This code works correct
        Optional<String> optS1 = Optional.ofNullable(s1); //if null returns empty Optional, otherwise - object

        boolean isEqual = optS1.equals(s2);
        System.out.println(isEqual);


    }





}
