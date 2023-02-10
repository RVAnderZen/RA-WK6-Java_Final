public class App {
	
//Instantiate a Deck and two Players, call the shuffle method on the deck.	
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle(); {
      
		    Player player1 = new Player("1");
		    Player player2 = new Player("2");

/* Using a traditional for loop, iterate 52 times (26 times for each player) calling the
 * Draw method  on the other player each iteration using the Deck you instantiated.
 */		    
		    for (int i = 0; i < 26; i++) {
		        player1.draw(deck);
		        player2.draw(deck);
		    }

		    for (int i = 0; i < 26; i++) {
		        Card card1 = player1.flip();
		        Card card2 = player2.flip();
		        System.out.println("Player 1 flips " + card1.getName());
		        System.out.println("Player 2 flips " + card2.getName());
		        
/* Compare the value of each card returned by the two player’s flip methods. Call 
 * the incrementScore method on the player whose card has the higher value.		        
 */
		        
		        if (card1.getValue() > card2.getValue()) {
		            player1.incrementScore();
		            System.out.println("Player 1 wins this round");
		        } else if (card2.getValue() > card1.getValue()) {
		            player2.incrementScore();
		            System.out.println("Player 2 wins this round");
		        } else {
		            System.out.println("This round is a draw");
		        }
		        
// After the loop, compare the final score from each player.
		        
		        System.out.println("Player 1 score: " + player1.getScore());
		        System.out.println("Player 2 score: " + player2.getScore());
		    }

/* Print the final score of each player and either “Player 1”, 
 * “Player 2”, or “Draw” depending on which score is higher 
 * or if they are both the same. 		    
 */
		    
		    
		    if (player1.getScore() > player2.getScore()) {
		        System.out.println("Player 1 wins with a score of " + player1.getScore());
		    } else if (player2.getScore() > player1.getScore()) {
		        System.out.println("Player 2 wins with a score of " + player2.getScore());
		    } else {
		        System.out.println("The game is a draw with a score of " + player1.getScore());
		    }
		}
		
	}
	
}