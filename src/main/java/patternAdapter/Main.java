package patternAdapter;

public class Main {

    //https://javarush.com/groups/posts/2139-pattern-proektirovanija-adapter

    public static void main(String[] args) {

        USB cardReader = new CardReader_Adapter(new MemoryCard());
        cardReader.connectWithUsbCable();

    }
}
