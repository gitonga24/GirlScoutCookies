package GirlScoutCookies;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MasterOrderTest {

//	Declare your ArrayList and name it orders
//	Create an empty constructor and the following methods
//	public void addOrder(CookieOrder theOrder) add an order to the list showing variety and quantity
//	public int getTotalBoxes() keep track of total boxes ordered
//	public void removeVariety(String variety) give the ability to pick out a variety of cookie and remove it from the list. Hint: When you remove something the list will shrink, you need to consider this when traversing your collection (you don’t want to overlook any items)
//	public int getVarietyBoxes(String variety) returns the total boxes of a given variety.
//	public void showOrder() to traverse and print the ArrayList
	
	
	
//	public void addOrder(CookieOrder theOrder) add an order to the list showing variety and quantity
	
	@Test
	public void shouldBeAbleToAddOrderOneItem() {
		MasterOrder underTest = new MasterOrder();
		
		 underTest.addOrder(new CookieOrder ("", 1));
		 int quantity = underTest.getTotalBoxes();
		
		assertEquals(1, quantity);
		
		
	}
	
	
	@Test
	public void shouldReturnTotalBoxesAsOne() {
		MasterOrder underTest = new MasterOrder();
		//act
		underTest.addOrder(new CookieOrder ("", 1));
		underTest.addOrder(new CookieOrder ("", 1));
		 int quantity = underTest.getTotalBoxes();
		
		 assertEquals(quantity, 2);
		
	}
	
	@Test
	public void shouldReturnTotalBoxesAsTwo() {
		MasterOrder underTest = new MasterOrder();
		//act
		int check = underTest.getTotalBoxes();
		//assert
		assertEquals(check, 1);
	}
}
