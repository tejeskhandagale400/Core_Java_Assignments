import static org.junit.Assert.*;

import org.junit.Test;


public class TestToCheckArgumentConstructor {
	
	@Test
	public void testForValidYearIsOfDate() 
	{

		Date dateOne = new Date(15,2,1997);	
		System.out.println(dateOne.toString());
		assertEquals("15/2/1997",dateOne.toString());
	}
	@Test
	public void testForDayNegativeValuesOfDate() 
	{

		Date dateOne = new Date(-1,1,2018);	
		
		assertEquals(null,dateOne.toString());
	}
	
	@Test
	public void testForDayIsZeroOfDate() 
	{

		Date dateOne = new Date(0,1,2018);	
		assertEquals(null,dateOne.toString());
	}
	
	@Test
	public void testForMonthIsNegativeOfDate() 
	{

		Date dateOne = new Date(10,-10,2018);	
		assertEquals(null,dateOne.toString());
	}
	
	@Test
	public void testForMonthIsZeroOfDate() 
	{

		Date dateOne = new Date(10,0,2018);	
		assertEquals(null,dateOne.toString());
	}
	

	@Test
	public void testForInvalidDayIsOfDate() 
	{

		Date dateOne = new Date(32,0,2018);	
		assertEquals(null,dateOne.toString());
	}
	

	@Test
	public void testForInvalidMonthIsOfDate() 
	{

		Date dateOne = new Date(2,13,2018);	
		assertEquals(null,dateOne.toString());
	}
	

	@Test
	public void testForInvalidLeapYearIsOfDate() 
	{

		Date dateOne = new Date(29,2,1997);	
		assertEquals(null,dateOne.toString());
	}

}
