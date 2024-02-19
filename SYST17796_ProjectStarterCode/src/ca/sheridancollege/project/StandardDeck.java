package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

// StandardDeck.java
public class StandardDeck extends GroupOfCards {
    public StandardDeck() {
        super(52); // A standard deck has 52 cards
        this.cards = new ArrayList<Card>(52); // Initialize the card list
        populateStandardDeck(); // Populate the deck with cards
    }

    private void populateStandardDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; // Ace high

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new StandardCard(ranks[i], suit, values[i]));
            }
        }
    }

    // Add methods to deal half the deck to each player
    public void dealCards(WarPlayer player1, WarPlayer player2) {
        Collections.shuffle(this.cards);
        int halfDeck = this.getSize() / 2;
            for (int i = 0; i < halfDeck; i++) {
             player1.receiveCard(this.cards.remove(0));
                         player2.receiveCard(this.cards.remove(0));
        }
    }

    public StandardCard drawCard() {
        if (!cards.isEmpty()) {
            return (StandardCard) cards.remove(cards.size() - 1);
        } else {
            throw new IllegalStateException("Cannot draw from an empty deck.");
        }
    }
}
