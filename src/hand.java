import java.util.ArrayList;

public class hand {
    ArrayList<card> cards;

    public hand(ArrayList<card> cards) {
        this.cards = cards;
    }

    public String getCards(int i) {
        name.names cardName = this.cards.get(i).getCardName();
        String cardType = this.cards.get(i).getCardType();
        return cardName + " of " + cardType;
    }

    public ArrayList<Integer> getCardValue(int numberOfCards) {
        ArrayList<Integer> cardValues = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            cardValues.add(this.cards.get(i).getCardValue());
        }
        return cardValues;
    }
}
