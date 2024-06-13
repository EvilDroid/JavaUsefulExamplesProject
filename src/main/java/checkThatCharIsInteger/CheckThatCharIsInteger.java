package checkThatCharIsInteger;

public class CheckThatCharIsInteger {
    public static void main(String[] args) {

        boolean y = isCharInt('5');
        System.out.println(y);
        boolean n = isCharInt('t');
        System.out.println(n);

    }

    public static boolean isCharInt(char s) {
        try
        {
            Integer.parseInt(String.valueOf(s));
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
}
