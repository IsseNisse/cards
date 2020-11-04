public class card {
    private final int cardValue;
    private final name.names cardName;
    private final String cardType;

    public card(int cardValue, name.names cardName, String cardType) {
        this.cardName = cardName;
        this.cardType = cardType;
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }

    public name.names getCardName() {
        return cardName;
    }

    public String getCardType() {
        return cardType;
    }
}
