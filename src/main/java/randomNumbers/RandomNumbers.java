package randomNumbers;

public class RandomNumbers {
    public static void main(String[] args) {

        // random double from 0 to 1
        double numb1 = Math.random();
        System.out.println(numb1);

        // random double from 0 to 10
        int numb2 = (int)(Math.random() * 10);
        System.out.println(numb2);

        // random double from 0 to 1000
        int numb3 = (int)(Math.random() * 1000);
        System.out.println(numb3);

        // random double from 0 to 5
        int numb4 = (int)(Math.random() * 6);
        System.out.println(numb4);

        // random double from 1 to 6
        int numb5 = (int)(Math.random() * 6 + 1);
        System.out.println(numb5);

        // random double from 1 to n
        int n = 365;
        int numb6 = (int)(Math.random() * n + 1);
        System.out.println(numb6);
    }
}
