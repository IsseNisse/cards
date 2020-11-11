import java.util.ArrayList;
import java.util.Scanner;

public class game {
    private static final int numberOfCards = 5;
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
        return deck.drawManyCards(numberOfCards, deck);
    }

    public static void main(String[] args) {
        ArrayList<hand> playerHands = new ArrayList<>();

        game game = new game();
        deck deck = new deck(game.cards);
        playerHands.add(new hand(makeHand(deck)));
        playerHands.add(new hand(makeHand(deck)));
        player player1 = new player(playerHands.get(0));
        player player2 = new player(playerHands.get(1));


        for (int i = 0; i < playerHands.size(); i++) {
            if (i == 0) {
                System.out.println("PLayer 1 switch a card");
                System.out.println(player1.displayHand(numberOfCards));
            } else if (i == 1) {
                System.out.println("Player 2 switch a card");
                System.out.println(player2.displayHand(numberOfCards));
            }
                Scanner input = new Scanner(System.in);
                int playerInput = input.nextInt();
                int secondPlayerInput = input.nextInt();

            discardCard(playerHands, deck, i, playerInput, secondPlayerInput);
        }

        System.out.println(player1.displayHand(numberOfCards));
        System.out.println(player2.displayHand(numberOfCards));

        if (player1.getHandValue(numberOfCards) < player2.getHandValue(numberOfCards)) {
            System.out.println("player 2 wins!");
        } else if (player2.getHandValue(numberOfCards) < player1.getHandValue(numberOfCards)) {
            System.out.println("player 1 wins!");
        } else {
            System.out.println("Its a tie! draw 5 new cards.");
        }

    }

    private static void discardCard(ArrayList<hand> playerHands, deck deck, int i, int playerInput, int secondPlayerInput) {
        playerHands.get(i).cards.remove(playerInput);
        playerHands.get(i).cards.add(playerInput, deck.drawCard());
        playerHands.get(i).cards.remove(secondPlayerInput);
        playerHands.get(i).cards.add(secondPlayerInput, deck.drawCard());
    }
}
