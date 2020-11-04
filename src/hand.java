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
}
