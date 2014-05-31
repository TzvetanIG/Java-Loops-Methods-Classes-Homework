import java.math.BigDecimal;


public class Order {
	
	private String name;
	private BigDecimal quantity;
	
	public Order(String fileRow) {
		String[] splitFileRow = fileRow.split(" ");
		this.name = splitFileRow[1];
		this.quantity = new BigDecimal(splitFileRow[0]);
	}

	public String getName() {
		return name;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

}
