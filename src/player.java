import java.util.ArrayList;

public class player {
    private hand hand;

    public player(hand hand) {
        this.hand = hand;
    }

    public hand getHand() {
        return hand;
    }

    public ArrayList<String> displayHand() {
        ArrayList<String> playerCards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            playerCards.add(getHand().getCards(i));
        }
        return playerCards;
    }
}
