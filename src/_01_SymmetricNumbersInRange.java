import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int start = input.nextInt();

		int end = input.nextInt();

		for (int i = start; i <= end; i++) {

			String[] twoPartsOFNumber = splitToTwoParts(i);

			String leftPart = twoPartsOFNumber[0];

			String reflexRightPart = reflexString(twoPartsOFNumber[1]);

			if (leftPart.equals(reflexRightPart)) {

				System.out.print(i + " ");

			}

		}

	}

	public static String[] splitToTwoParts(int number) {

		String numberAsString = Integer.toString(number);

		int middle = numberAsString.length() / 2;

		String partLeft = "";

		String partRight = "";

		for (int i = 0; i < middle; i++) {

			partLeft += numberAsString.charAt(i);

			if (numberAsString.length() % 2 == 0) {

				partRight += numberAsString.charAt(middle + i);

			} else {

				partRight += numberAsString.charAt(middle + i + 1);

			}

		}

		return new String[] { partLeft, partRight };

	}

	public static String reflexString(String str) {

		if (str.length() < 2) {

			return str;

		}

		String reflexString = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reflexString += str.charAt(i);

		}

		return reflexString;
	}

}
