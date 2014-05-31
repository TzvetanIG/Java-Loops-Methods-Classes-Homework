import java.math.BigDecimal;
import java.util.ArrayList;



public class _10_OrderOfProducts {

	public static void main(String[] args) {
		
		ArrayList<String> productFileRows = new ArrayList<>();
		ArrayList<String> orderFileRows = new ArrayList<>();

		productFileRows = Product.readFile("products.txt");
		orderFileRows = Product.readFile("order.txt");

		ArrayList<Product> products = new ArrayList<>();
		ArrayList<Order> order = new ArrayList<>();
		
		for (String row : productFileRows) {
			products.add(new Product(row));
		}
		
		for (String row : orderFileRows) {
			order.add(new Order(row));
		}

		BigDecimal totalPrice = BigDecimal.ZERO;
		
		for(Order row: order){
			for(Product product: products){
				
				if (row.getName().equals(product.getName())) {
					
					BigDecimal multiply = row.getQuantity().multiply(product.getPrice());
					totalPrice = totalPrice.add(multiply);
				}
			}
		}
		
		System.out.println(totalPrice);
		
	}
	
	

}
