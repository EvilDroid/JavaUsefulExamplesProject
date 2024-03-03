package lambda;

public class Lambda {
    public static void main(String[] args) {
        //1) Simplest lambda
        Runnable runnable = () -> System.out.println("Hello");
        runnable.run();
    }
}
