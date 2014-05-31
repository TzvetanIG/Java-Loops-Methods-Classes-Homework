public class _03_FullHouse {

	public static void main(String[] args) {

		Deck deck = new Deck();
		int counter = 0;

		for (int i = 0; i < 51; i += 4) {

			Card[] triples = deck.getEqualCards(i);

			for (int j = 0; j < 51; j += 4) {

				if (i == j) {
					continue;
				}

				Card[] couples = deck.getEqualCards(j);

				for (int iTriple = 1; iTriple <= 15; iTriple++) {

					Card[] tripleCards = getTripleCards(triples, iTriple);

					if (tripleCards == null) {
						continue;
					}

					for (int iCouple = 1; iCouple <= 15; iCouple++) {

						Card[] CoupleCards = getCoupleCards(couples, iCouple);

						if (CoupleCards == null) {
							continue;
						}

						Card[] hand = getHand(tripleCards, CoupleCards);

						System.out.print(counter);
						Deck.PrintHandInBricks(hand);

						counter++;
					}
				}
			}
		}

		System.out.println("\n" + counter);
	}

	public static Card[] getTripleCards(Card[] equalCards, int index) {

		if (Integer.bitCount(index) != 3) {
			return null;
		}

		Card[] triple = new Card[3];
		int counter = 0;

		for (int i = 0; i < 4; i++) {

			if ((index >> i & 1) == 1) {
				triple[counter] = equalCards[i];
				counter++;
			}
		}

		return triple;
	}

	public static Card[] getCoupleCards(Card[] equalCards, int index) {

		if (Integer.bitCount(index) != 2) {
			return null;
		}

		Card[] couple = new Card[2];
		int counter = 0;

		for (int i = 0; i < 4; i++) {

			if ((index >> i & 1) == 1) {
				couple[counter] = equalCards[i];
				counter++;
			}
		}

		return couple;
	}

	public static Card[] getHand(Card[] triple, Card[] couple) {

		Card[] hand = new Card[5];

		for (int i = 0; i < 3; i++) {
			hand[i] = triple[i];
		}

		for (int i = 0; i < 2; i++) {
			hand[3 + i] = couple[i];
		}

		return hand;
	}

}
