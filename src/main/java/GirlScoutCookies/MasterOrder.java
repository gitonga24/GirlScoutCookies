package GirlScoutCookies;

import java.util.ArrayList;

public class MasterOrder {

	
	
	ArrayList <CookieOrder> orders = new ArrayList ();
	int numBoxes;
	
	String orderVariety;
	int orderQuantity;
	
	
	CookieOrder newOrder = new CookieOrder (orderVariety, orderQuantity);
	

	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}
	
public int getTotalBoxes() {		//int totalBoxes = theOrder.quantity;
	int counter = 0;	
	for(CookieOrder o: orders)
		counter += o.getQuantity();
	return counter;		
	}

}
