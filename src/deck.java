import java.util.ArrayList;
import java.util.Collections;

public class deck {
    private card card;

    private ArrayList<card> cards = new ArrayList<>();

    public deck(ArrayList<card> cards) {
        this.cards = cards;
        Collections.shuffle(cards);
    }

    public card getCards(int randNum) {
        return this.cards.get(randNum);
    }

    public ArrayList<card> getDeck() {
        return cards;
    }
}