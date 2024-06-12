
package cardgame;

import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.Random;
import java.util.Scanner;

/**
 * Code in progress for teaching cohesion and coupling
 * @author dancye- this code has been refactored for teaching purposes.
 * 
 */
public class CardGame {

	public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            Card[] hand = new Card[7];
            Random random = new Random();
            for (int i=0; i<hand.length; i++)
            {
               Value value = Card.Value.values()[random.nextInt(13)];
               
                Suit suit = Card.Suit.values()[random.nextInt(4)];
                
                Card card = new Card(value, suit);
                hand[i] = card;
            }
                //print each card so we can see what was generated
                for(Card card: hand)
                {
                    System.out.println(card.getValue() + " of " + card.getSuit());
                }
                
                //ask user for Card
                System.out.println("Please choose a suit for your lucky card:");
                for(int i=0; i<Card.Suit.values().length; i++)
                {
                    System.out.println((i+1) + ": " + Card.Suit.values()[i]);
                }
                
                int suit = input.nextInt()-1;
                System.out.println("Enter a value (1 to 13)");
                int value = input.nextInt()-1;
                //create new Card with the two values chosen
                Card userGuess = new Card(Card.Value.values()[value], Card.Suit.values()[suit]);
                
                //check if it matches
                boolean match=false;
                for(Card card: hand)
                {
                    if(card.getValue()==userGuess.getValue() && 
                            (card.getSuit().equals(userGuess.getSuit())))
                    {
                        match=true;
                        break;
                    }
                }
                System.out.println("Did you guess it? " + match);
            
        }


}
