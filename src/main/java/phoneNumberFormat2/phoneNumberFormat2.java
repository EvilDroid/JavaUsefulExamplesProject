package phoneNumberFormat2;

public class phoneNumberFormat2 {

    public static void main(String[] args) {

        String pn = createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}); // => returns "(123) 456-7890"
        System.out.println(pn);

    }


    public static String createPhoneNumber(int[] numbers) {

        String result = "";

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                result = result + "(";
            }
            if (i == 3) {
                result = result + ")" + " ";
            }
            if (i == 6) {
                result = result + "-";
            }


            if (i < 3) {
                result = result + numbers[i];
            }
            if (i >= 3 && i < 6) {
                result = result + numbers[i];
            }
            if (i >= 6 && i < 10) {
                result = result + numbers[i];
            }

            System.out.println(result);
        }



        return result;
        // OR
        // return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }


}
