import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create a class named "Deck"

public class Deck {
	
//Create a field named "Cards"
	
	private List<Card> cards;

//When a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.	

	public Deck() {
	    cards = new ArrayList<Card>();
	    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	    for (int i = 2; i <= 14; i++) {
	        for (String suit : suits) {
	            Card card = new Card();
	            card.setValue(i);
	            if (i == 11) {
	                card.setName("Jack of " + suit);
	            } else if (i == 12) {
	                card.setName("Queen of " + suit);
	            } else if (i == 13) {
	                card.setName("King of " + suit);
	            } else if (i == 14) {
	                card.setName("Ace of " + suit);
	            } else {
	                card.setName(i + " of " + suit);
	            }
	            cards.add(card);
	        }
	    }
	}

//Create a "Shuffle" method
	
	public void shuffle() {
	    Collections.shuffle(cards);
	}

//Create a "Draw" method	
	
	public Card draw() {
	    if (cards.size() > 0) {
	        Card topCard = cards.get(0);
	        cards.remove(0);
	        return topCard;
	    } else {
	        return null;
	    }
	}
}