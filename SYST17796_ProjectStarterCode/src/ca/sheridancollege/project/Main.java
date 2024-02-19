package ca.sheridancollege.project;

// Main class to run the War card game
public class Main {

    public static void main(String[] args) {
        // Create players
        WarPlayer player1 = new WarPlayer("Player 1");
        WarPlayer player2 = new WarPlayer("Player 2");

        // Initialize the deck
        StandardDeck deck = new StandardDeck();
        // deck.populateStandardDeck(); // No need to call this as it's already done in the constructor
        deck.shuffle(); // Ensure this method exists in your GroupOfCards class

        // Deal the cards to the players
        deck.dealCards(player1, player2); // This method is defined in StandardDeck to deal cards

        // Play the game until one player runs out of cards
       // Main game loop
while (!player1.getHand().isEmpty() && !player2.getHand().isEmpty()) {
    // Each player plays a card
    StandardCard card1 = player1.playCard();
    StandardCard card2 = player2.playCard();

    // Show what cards were played
    System.out.println(player1.getName() + " plays " + card1);
    System.out.println(player2.getName() + " plays " + card2);

    // Determine the winner of the round
    int compareResult = card1.compareTo(card2);
    if (compareResult > 0) {
        // Player 1 wins the round
        player1.receiveCard(card1);
        player1.receiveCard(card2);
        System.out.println(player1.getName() + " wins the round");
    } else if (compareResult < 0) {
        // Player 2 wins the round
        player2.receiveCard(card1);
        player2.receiveCard(card2);
        System.out.println(player2.getName() + " wins the round");
    } else {
        // It's a tie - implement the war logic here
        System.out.println("War!");
    }

    // Optionally, display the number of cards each player has after each round
    System.out.println(player1.getName() + " has " + player1.getHandSize() + " cards left.");
    System.out.println(player2.getName() + " has " + player2.getHandSize() + " cards left.");
}

// After the loop, determine who won the game
if (player1.getHand().isEmpty()) {
    System.out.println(player2.getName() + " wins the game!");
} else if (player2.getHand().isEmpty()) {
    System.out.println(player1.getName() + " wins the game!");
}


        // Declare the winner
        if (player1.getHand().isEmpty()) {
            System.out.println(player2.getName() + " wins the game!");
        } else if (player2.getHand().isEmpty()) {
            System.out.println(player1.getName() + " wins the game!");
        }   else {
            System.out.println("It's a draw!");
        }
    }
}
