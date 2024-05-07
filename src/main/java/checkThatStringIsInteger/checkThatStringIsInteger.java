package checkThatStringIsInteger;

public class checkThatStringIsInteger {
    public static void main(String[] args) {

        boolean y = isStringInt("45");
        boolean n = isStringInt("tyu");

    }

    public static boolean isStringInt(String s) {
        try
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
}
