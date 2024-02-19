package ca.sheridancollege.project;

// WarGame.java


public class WarGame extends Game {
    private WarPlayer player1;
    private WarPlayer player2;
    private StandardDeck deck;

    public WarGame(String name) {
        super(name);
        this.deck = new StandardDeck();
        this.player1 = new WarPlayer("Player 1");
        this.player2 = new WarPlayer("Player 2");
        deck.dealCards(player1, player2);
    }

    @Override
    public void play() {
        while (player1.getHandSize() > 0 && player2.getHandSize() > 0) {
            @SuppressWarnings("unused")
            StandardCard card1 = player1.playCard();
            @SuppressWarnings("unused")
            StandardCard card2 = player2.playCard();

            System.out.println(player1.getName() + " plays ");}}


    @Override
    public void declareWinner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'declareWinner'");
    }}