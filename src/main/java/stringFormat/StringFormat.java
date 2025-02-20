package stringFormat;

public class StringFormat {
    public static void main(String[] args) {
        String dog = "dog";
        int i = 5;
        float f = 0.5f;
        boolean b = true;
        String out = String.format("A %s have %d puppies. There is %b, that its high is %f meters", dog, i, b, f);
        System.out.println(out);
    }
}
