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
        types.add("spades");
        types.add("hearts");
        types.add("clubs");
        types.add("diamonds");
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

        System.out.println(player1.displayHand());
        System.out.println(player2.displayHand());

    }



}
