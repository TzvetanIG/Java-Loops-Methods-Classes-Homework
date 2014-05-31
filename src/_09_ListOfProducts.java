import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;



public class _09_ListOfProducts {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Product> products = new ArrayList<>();
		ArrayList<String> fileRows = new ArrayList<>();

		fileRows = Product.readFile("products.txt");

		for (String row : fileRows) {

			products.add(new Product(row));
		}

		products.sort(Product.ProductPriceComparator);

		printToFile("output.txt", products);

	}



	public static void printToFile(String fileName, ArrayList<Product> products)
			throws FileNotFoundException {

		PrintStream fileWriter = new PrintStream(fileName);

		for (Product product : products) {

			fileWriter.println(product);

		}

		fileWriter.close();
	}
}
