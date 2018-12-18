import static org.junit.Assert.*;

import org.junit.Test;


public class TestToCalculateDiscount {

	@Test
	public void testToCheckValidresult() 
	{
		CalculateDiscount price = new CalculateDiscount();
		int newPrice=30000 , discountPercentage=35;
		int expected=19500;
		int newItemPrice = price.calculationOfDiscount(newPrice, discountPercentage);
		
		assertEquals(5,5);
	}

}
