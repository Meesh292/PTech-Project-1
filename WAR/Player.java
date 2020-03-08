package WAR;

import java.util.*;

public class Player {
	
	private String name;
	private int score;
	private List<Card> hand = new ArrayList<Card>();
	
	public Player(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name + "'s score: " + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}

}
