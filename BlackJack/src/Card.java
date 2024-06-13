public class Card {

    private final Suit suit;
    private final Rank rank;

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    public enum Rank {
        ACE(1, 11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

        private final int value1;
        private final int value2;

        // Constructor for ranks with a single value
        Rank(int value) {
            this.value1 = value;
            this.value2 = value;
        }

        // Constructor for ranks with two values (for Ace)
        Rank(int value1, int value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        // Getter to retrieve the primary value
        public int getPrimaryValue() {
            return value1;
        }

        // Getter to retrieve the secondary value (only relevant for Ace)
        public int getSecondaryValue() {
            return value2;
        }

        // Method to check if the rank has a secondary value
        public boolean hasSecondaryValue() {
            return value1 != value2;
        }
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getPrimaryValue() {
        return rank.getPrimaryValue();
    }

    public int getSecondaryValue() {
        return rank.getSecondaryValue();
    }

    @Override
    public String toString() {
        if (rank.hasSecondaryValue()) {
            return rank + " of " + suit + " (Values: " + getPrimaryValue() + " or " + getSecondaryValue() + ")";
        } else {
            return rank + " of " + suit + " (Value: " + getPrimaryValue() + ")";
        }
    }
}
