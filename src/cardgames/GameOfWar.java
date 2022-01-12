package cardgames;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameOfWar {

    public static void hand(Card[] cards) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = cards.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card a = cards[index];
            cards[index] = cards[i];
            cards[i] = a;
        }

    }

    public static void deal() {

    }

    public static void main(String[] args) {
        Player player1 = new Player("Player");
        Player computer = new Player("Computer");
        // Shuffle
        Card[] shuffledCards;
        CardsArray deck = new CardsArray();
        shuffledCards = deck.getAllCards();
        hand(shuffledCards);
        for (Card cards : shuffledCards) {
            System.out.println(cards.getValue() + "-" + cards.getSuit());
        }

        // Each player gets 26 cards

        Arrays.copyOf(shuffledCards, 26);
        // Flip one card at a time, higher card wins

        // Pair goes at the bottom of the deck

        // Tie: 3 cards face down, 4th face up, high card wins, if another tie, flip next until one is higher

        // Winner: has entire deck or wins three wars
    }
}
