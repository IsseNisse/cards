import java.util.ArrayList;

public class game {
    ArrayList<card> cards = new ArrayList<>();

    public game() {
        read();
    }

    private void read() {
        ArrayList<String> types = new ArrayList<>();
        types.add("Spades");
        types.add("Hearts");
        types.add("Clubs");
        types.add("Diamonds");

        for (int j = 0; j < 4; j++) {
            String cardType = types.get(j);
            for (int k = 0; k < 13; k++) {
                int cardValue = k + 1;
                name.names cardName = name.getName(k);
                cards.add(new card(cardValue, cardName, cardType));
            }
        }
    }

    private card drawnCard(deck deck) {
        card cardSave = deck.getCards(0);
        int cardPos = deck.getDeck().indexOf(cardSave);
        cards.remove(cardPos);
        cards.add(cardSave);
        return cardSave;
    }

    public static void main(String[] args) {
        game game = new game();
        deck deck = new deck(game.cards);

        card card1 = game.drawnCard(deck);
        card card2 = game.drawnCard(deck);

        System.out.println(card1.getCardName() + " of " + card1.getCardType());
        System.out.println(card2.getCardName() + " of " + card2.getCardType());

        if (card1.getCardValue() > card2.getCardValue()) {
            System.out.println("Card 1 wins!");
        } else if (card2.getCardValue() > card1.getCardValue()){
            System.out.println("Card 2 wins!");
        } else {
            System.out.println("Its a tie! Draw again.");
        }

    }

}
