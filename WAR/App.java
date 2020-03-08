package WAR;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("John");
		Player player2 = new Player("Michelle");
		
		
		// 52 cards/2 = 26 cards per player
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
			
		}
		
		
		//game play
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			System.out.println(player1.getName() + ": " + player1Card.getName() + " Vs. " + player2.getName() + ": " + player2Card.getName());
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " wins this round!");
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " wins this round!");
			} else {
				System.out.println("Draw");
			 }
		}
			
		System.out.println(player1.getName() + ": " + player1.getScore() + " Vs. " + player2.getName() + ": " + player2.getScore());
			if (player1.getScore() > player2.getScore()) {
				System.out.println("Final Score: " + player1.getName() + ": " + player1.getScore() + " Vs. " + player2.getName() + ": " + player2.getScore() + " -- Player 1 wins!");
			} else if (player2.getScore() > player1.getScore()) {
				System.out.println("Final Score: " + player1.getName() + ": " + player1.getScore() + " Vs. " + player2.getName() + ": " + player2.getScore() + " -- Player 2 wins!");
			} else {
				System.out.println("Final Score: " + player1.getName() + ": " + player1.getScore() + " Vs. " + player2.getName() + ": " + player2.getScore() + " -- Draw");
		}
	}

}
