package GirlScoutCookies;

public class CookieOrder {
	
	private String variety;
	private int quantity;
	
	public CookieOrder (String variety, int quantity) {
		this.variety = variety;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public String getVariety() {
		return variety;
	}
}
