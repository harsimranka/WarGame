package ca.sheridancollege.project;

// WarPlayer.java
import java.util.LinkedList;
import java.util.List;

public class WarPlayer extends Player {
    private LinkedList<StandardCard> hand;

    public WarPlayer(String name) {
        super(name);
        this.hand = new LinkedList<>();
    }
    public List<StandardCard> getHand() {
        return hand;
    }

    public void addCard(StandardCard card) {
        this.hand.add(card);
    }
    


    public void receiveCard(StandardCard card) {
        hand.add(card);
    }

    public StandardCard playCard() {
        return hand.removeFirst();
    }

    public void collectCards(List<StandardCard> cards) {
        hand.addAll(cards);
    }

    

    public int getHandSize() {
        return hand.size();
    }

    @Override
    public void play() {
        // WarPlayer's play logic will be handled by the WarGame class
    }

    public void receiveCard(Card card) {
        if (card instanceof StandardCard) {
            this.hand.add((StandardCard) card);
        } else {
            throw new IllegalArgumentException("Only StandardCard instances can be received");
        }
    }
    

    
}
