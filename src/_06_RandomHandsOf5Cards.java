import java.util.Scanner;


public class _06_RandomHandsOf5Cards {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		Deck deck = new Deck();
		for (int i = 0; i < n; i++) {
			Card[] hand = deck.getRandomHand(5);
			Deck.PrintHand(hand);
		}
		
	}

}
