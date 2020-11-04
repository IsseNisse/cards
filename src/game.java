import java.util.ArrayList;

public class game {
    ArrayList<card> cards = new ArrayList<>();

    public game() {
        read();
    }

    private void read() {
        ArrayList<String> types = types();
        buildDeck(types);
    }

    private ArrayList<String> types() {
        ArrayList<String> types = new ArrayList<>();
        types.add("Spades");
        types.add("Hearts");
        types.add("Clubs");
        types.add("Diamonds");
        return types;
    }

    private void buildDeck(ArrayList<String> types) {
        for (int j = 0; j < 4; j++) {
            String cardType = types.get(j);
            for (int k = 0; k < 13; k++) {
                int cardValue = k + 1;
                name.names cardName = name.getName(k);
                cards.add(new card(cardValue, cardName, cardType));
            }
        }
    }

    private static ArrayList<card> makeHand(deck deck) {
        return deck.drawManyCards(5, deck);
    }

    public static void main(String[] args) {
        game game = new game();
        deck deck = new deck(game.cards);
        hand p1Hand = new hand(makeHand(deck));
        hand p2Hand = new hand(makeHand(deck));
        player player1 = new player(p1Hand);
        player player2 = new player(p2Hand);

        for (int i = 0; i < 5; i++) {
            System.out.println(player1.getHand().getCards(i));
            System.out.println(player2.getHand().getCards(i));
        }


/*        System.out.println(card1.getCardName() + " of " + card1.getCardType());
        System.out.println(card2.getCardName() + " of " + card2.getCardType());

        if (card1.getCardValue() > card2.getCardValue()) {
            System.out.println("Card 1 wins!");
        } else if (card2.getCardValue() > card1.getCardValue()){
            System.out.println("Card 2 wins!");
        } else {
            System.out.println("Its a tie! Draw again.");
        }*/

    }



}
