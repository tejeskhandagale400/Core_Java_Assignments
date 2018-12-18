import static org.junit.Assert.*;

import org.junit.Test;


public class TestToCheckisSmallerMethod {



		@Test
		public void testForComparisionTwoDatesWithGreaterDateFirst() 
		{
			Date dateOne = new Date(21,8,1996);	
			Date dateTwo = new Date(15,2,2018);	
			assertFalse(dateOne.isSmaller(dateOne, dateTwo));	 
		}
		

		@Test
		public void testForComparisionTwoDatesWithSmallerDateFirst() 
		{
			Date dateOne = new Date(21,8,2020);	
			Date dateTwo = new Date(15,2,2018);	
			assertTrue(dateOne.isSmaller(dateOne, dateTwo));	 
		}
		
		@Test
		public void testForComparisionTwoDatesWithSmallerDateBecauseOfMonth() 
		{
			Date dateOne = new Date(21,8,2018);	
			Date dateTwo = new Date(15,2,2018);	
			assertTrue(dateOne.isSmaller(dateOne, dateTwo));	 
		}

		@Test
		public void testForComparisionTwoDatesWithSmallerDateBecauseOfDays() 
		{
			Date dateOne = new Date(21,8,2018);	
			Date dateTwo = new Date(15,8,2018);	
			assertTrue(dateOne.isSmaller(dateOne, dateTwo));	 
		}
		
		@Test
		public void testForComparisionTwoDatesWithSameDate() 
		{
			Date dateOne = new Date(21,8,2018);	
			Date dateTwo = new Date(21,8,2018);	
			assertFalse(dateOne.isSmaller(dateOne, dateTwo));	   	//i.e. For same date it will return false
		}

}
