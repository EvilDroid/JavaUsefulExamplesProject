package patternAdapter;

public class CardReader_Adapter implements USB {

    private MemoryCard memoryCard;

    public CardReader_Adapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
