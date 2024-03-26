package phoneNumberFormat;

public class phoneNumberFormat {
    public static void main(String[] args) {
        int code = 38;
        int phoneNumber = 71112233;
        String phoneNumber10 = String.format("%010d", phoneNumber);
        String phoneNumberString = String.valueOf(phoneNumber10);
        String part_1 = String.valueOf(phoneNumberString.toCharArray(), 0, phoneNumberString.length() - 7);
        String part_2 = String.valueOf(phoneNumberString.toCharArray(), phoneNumberString.length() - 7, 7);
        String phoneNumberFormatted = String.format("+%s(%s)%s-%s-%s", code, part_1, part_2.substring(0, 3), part_2.substring(3, 5), part_2.substring(5));
        System.out.println(phoneNumberFormatted);
    }
}
