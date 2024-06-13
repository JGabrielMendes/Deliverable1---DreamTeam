import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card>deckCards;

    //constructor to loop and make with 52 cards
    public Deck(){
        deckCards=new ArrayList<>();

        for (Card.Suit suit : Card.Suit.values()) {
            // Iterate over all ranks
            for (Card.Rank rank : Card.Rank.values()) {
                // Add a new card to the deck for each combination of suit and rank
                deckCards.add(new Card(suit, rank));
                //shuffle
                Collections.shuffle(deckCards);
            }
        }
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckCards=" + deckCards +
                '}';
    }
}
