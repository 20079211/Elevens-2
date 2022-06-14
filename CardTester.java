/**
 * This is a class that tests the Card class.
 */

// CardTester.java

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */

  // Card (rank, suit, pV)
  
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Spades", 1);
    Card card2 = new Card("Two", "Hearts", 2);
    Card card3 = new Card("Ace", "Spades", 1);
    
    System.out.println("Card 1: " + card1);
    System.out.println("Card 2: " + card2);
    System.out.println("Card 3: " + card3);
    
    System.out.println("\nCard 1 accessor testing: " + card1.rank() + " " + card1.suit() + " " + card1.pointValue());
    System.out.println("\nCard 2 accessor testing: " + card2.rank() + " " + card2.suit() + " " + card2.pointValue());
    System.out.println("\nCard 3 accessor testing: " + card3.rank() + " " + card3.suit() + " " + card3.pointValue());
    
    System.out.println("\nDoes \'Card 1\' equal \'Card 2\'? " + card1.matches(card2));
    System.out.println("Does \'Card 1\' equal \'Card 3\'? " + card1.matches(card3));
    System.out.println("Does \'Card 2\' equal \'Card 3\'? " + card2.matches(card3));
	}
}