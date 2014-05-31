public class Card {

	private String face;
	private char suit;
	

	public Card(String face, char suit) {
		this.face = face;
		this.suit = suit;
	}

	public String toString() {
		return this.face + this.suit;
	}

	public String getFace() {
		return face;
	}

}
