package WAR;

import java.util.*;

public class Deck {
	
	private List<Card> cards;
	private String[] faces = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	public Deck() {
		cards = new ArrayList<Card>();
		for  (String suit : suits) {
			for (int i = 0; i < faces.length; i++) {
				cards.add(new Card(i, faces[i] + " of " + suit));
			}
		}
	}

	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
}
