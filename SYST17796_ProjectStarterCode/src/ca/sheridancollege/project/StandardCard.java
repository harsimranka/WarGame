package ca.sheridancollege.project;

// StandardCard.java
public class StandardCard extends Card {
    private String suit;
    private String rank;
    private int value; // numeric value for comparison

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public StandardCard(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }
    public StandardCard(String rank2, String suit2) {
        //TODO Auto-generated constructor stub
    }

    public StandardCard(int rank2, String suit2) {
        //TODO Auto-generated constructor stub
    }
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }

    // Comparing cards based on their rank
    public int compareTo(StandardCard card) {
        return this.rank.compareTo(card.rank);

    }
}
