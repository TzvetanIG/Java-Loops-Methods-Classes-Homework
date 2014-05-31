import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {
	private Card[] cards = new Card[52];
	private ArrayList<Card> cardsList = new ArrayList<>();
	private Random randomGenerator = new Random();

	public Deck() {
		String[] cardFaces = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A" };
		char[] suits = { '♣', '♦', '♥', '♠' };
		int counter = 0;

		for (int i = 0; i < cardFaces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				this.cards[counter] = new Card(cardFaces[i], suits[j]);
				this.cardsList.add(cards[counter]);
				counter++;
			}
		}

	}

	public Card getCard(int i) {
		return this.cards[i];
	}

	public Card[] getHand(int i1, int i2, int i3, int i4, int i5) {

		Card[] hand = new Card[5];
		hand[0] = getCard(i1);
		hand[1] = getCard(i2);
		hand[2] = getCard(i3);
		hand[3] = getCard(i4);
		hand[4] = getCard(i5);

		return hand;
	}

	public static void PrintHandInBricks(Card[] hand) {
		System.out.printf("(%s %s %s %s %s)", hand[0].toString(),
				hand[1].toString(), hand[2].toString(), hand[3].toString(),
				hand[4].toString());
	}

	public static boolean isFullHouse(Card[] hand) {

		boolean isFullHouse = false;

		String[] faces = new String[5];

		for (int i = 0; i < 5; i++) {
			faces[i] = hand[i].getFace();
		}

		Arrays.sort(faces);

		if (faces[0].equals(faces[1]) && faces[3].equals(faces[4])
				&& (faces[2].equals(faces[1]) || faces[2].equals(faces[4]))) {

			if (!faces[0].equals(faces[4])) {
				isFullHouse = true;
			}
		}

		return isFullHouse;
	}

	public Card[] getRandomHand(int number) {

		Card[] hand = new Card[number];

		if (number > this.cardsList.size()) {
			number = this.cardsList.size();
		}

		for (int i = 0; i < number; i++) {
			hand[i] = getRandomCard();
		}

		return hand;
	}

	private Card getRandomCard() {

		int randomIndex = this.randomGenerator.nextInt(this.cardsList.size());
		Card card = this.cardsList.get(randomIndex);
		this.cardsList.remove(randomIndex);
		return card;
	}

	public static void PrintHand(Card[] hand) {

		for (Card card : hand) {
			System.out.print(card.toString() + " ");
		}

		System.out.println();
	}

	public Card[] getEqualCards(int index) {
		Card[] equalCards = new Card[4];
		
		
		for (int i = index, j = 0; j < 4; i++, j++) {
			equalCards[j] = this.cards[i];
		}
		
		return equalCards;
	}

}
