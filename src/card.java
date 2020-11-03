public class card {
    private int cardValue;
    private String cardName;
    private String cardType;

    public card(int cardValue, String cardName, String cardType) {
        this.cardName = cardName;
        this.cardType = cardType;
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardType() {
        return cardType;
    }
}
