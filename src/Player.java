import java.util.ArrayList;
import java.util.List;

public class Player {

//Create a field named "Hand"
	
	private List<Card> hand;

//Create a field named "Score"	
	
	private int score;

//Create a field named "Name"	
	
	private String name;

	public Player(String name) {
	    hand = new ArrayList<Card>();
	    score = 0;
	    this.name = name;
	}

//Create a "Describe" method	
	
	public void describe() {
	    System.out.println("Player " + name + " has a score of " + score + " and the following cards in their hand:");
	    for (Card card : hand) {
	        card.describe();
	    }
	}

//Create a "Flip" method	
	
	public Card flip() {
	    if (hand.size() > 0) {
	        Card topCard = hand.get(0);
	        hand.remove(0);
	        return topCard;
	    } else {
	        return null;
	    }
	}

//Create a "Draw" method
	
	public void draw(Deck deck) {
	    Card drawnCard = deck.draw();
	    if (drawnCard != null) {
	        hand.add(drawnCard);
	    }
	}

//Create a "Increment Score" method
	
	public void incrementScore() {
	    score++;
	}

	public int getScore() {
	    return score;
	}
}