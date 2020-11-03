import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class game {
    private int cardValue;
    private String cardName;
    private String cardType;
    ArrayList<card> cards = new ArrayList<>();

    public game() {
        read();
    }

    private void read() {
        Scanner file = null;
        try {
            file = new Scanner(new File("cards.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 52; i++) {
            cardValue = file.nextInt();
            if (file.hasNext()) {
                cardName = file.nextLine();
                if (i < 14) {
                    cardType = "spades";
                } else if (i > 13 && i < 27) {
                    cardType = "hearts";
                } else if (i > 26 && i < 40) {
                    cardType = "clubs";
                } else if (i > 39 && i < 53) {
                    cardType = "diamonds";
                }
            }
            cards.add(new card(cardValue, cardName, cardType));
        }
    }

    private card drawnCard(deck deck) {
        card cardSave = deck.getCards(1);
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

        System.out.println(card1.getCardValue() + card1.getCardName() + " of " + card1.getCardType());
        System.out.println(card2.getCardValue() + card2.getCardName() + " of " + card2.getCardType());

        if (card1.getCardValue() > card2.getCardValue()) {
            System.out.println("Card 1 wins!");
        } else if (card2.getCardValue() > card1.getCardValue()){
            System.out.println("Card 2 wins!");
        } else {
            System.out.println("Its a tie! Draw again.");
        }

    }

}
