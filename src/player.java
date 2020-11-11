import java.util.ArrayList;

public class player {
    private hand hand;

    public player(hand hand) {
        this.hand = hand;
    }

    public hand getHand() {
        return hand;
    }

    public ArrayList<String> displayHand(int numberOfCards) {
        ArrayList<String> playerCards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            playerCards.add(getHand().getCards(i));
        }
        return playerCards;
    }

    public int getHandValue(int numberOfCards) {
        ArrayList<Integer> cardValues = this.hand.getCardValue(numberOfCards);
        int total = 0;

        for (int i = 0; i < numberOfCards; i++) {
            total += cardValues.get(i);
        }
        return total;
    }
}
