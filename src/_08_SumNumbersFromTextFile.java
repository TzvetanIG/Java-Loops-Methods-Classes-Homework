import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input.txt");
		Scanner fileReader = null;
		try {

			fileReader = new Scanner(file, "UTF-8");

			int sum = 0;

			while (fileReader.hasNextLine()) {

				sum += Integer.parseInt(fileReader.nextLine());
			}

			System.out.println(sum);
		} catch (FileNotFoundException e) {

			System.out.println("Error");

		} finally {

			if (fileReader != null) {
				fileReader.close();
			}
			
		}

	}
}
