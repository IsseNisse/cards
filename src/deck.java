import java.util.ArrayList;
import java.util.Collections;

public class deck {
    private card card;

    private final ArrayList<card> cards;

    public deck(ArrayList<card> cards) {
        this.cards = cards;
        shuffle(cards);
    }

    private void shuffle(ArrayList<card> cards) {
        Collections.shuffle(cards);
    }

    public card getCards(int randNum) {
        return this.cards.get(randNum);
    }

    public ArrayList<card> getDeck() {
        return cards;
    }

    public card drawCard(deck deck) {
        card cardSave = deck.getCards(0);
        int cardPos = deck.getDeck().indexOf(cardSave);
        cards.remove(cardPos);
        return cardSave;
    }

    public ArrayList<card> drawManyCards(int numberOfCards, deck deck) {
        ArrayList<card> drawnCards = new ArrayList<>();

        for (int i = 0; i < numberOfCards; i++) {
            card cardDrawn = drawCard(deck);
            drawnCards.add(cardDrawn);
        }
        return drawnCards;
    }
}