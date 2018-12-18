import static org.junit.Assert.*;

import org.junit.Test;


public class TestToCheckisDifferenceBetweenTwoDates {

	 
		@Test
		public void testTestToCheckDifferenceBetweenTwoDates() 
		{
			Date dateOne = new Date(21,8,2020);	
			Date dateTwo = new Date(15,2,2018);	
			int difference[] =dateOne.differenceBetweenTwoDates(dateOne,dateTwo);
			int [] expected = {6,6,2};
			assertArrayEquals(expected,difference);	 
	 
		}

		@Test
		public void testTestToChecksDifferenceBetweenYears() 
		{
			Date dateOne = new Date(1,8,2017);	
			Date dateTwo = new Date(1,8,2018);	
			int difference[] =dateOne.differenceBetweenTwoDates(dateOne,dateTwo);
			int [] expected = {0,0,1};
			assertArrayEquals(expected,difference);	 
	 
		}
		
		@Test
		public void testTestToChecksDifferenceBetweenMonths() 
		{
			Date dateOne = new Date(1,2,2018);	
			Date dateTwo = new Date(1,8,2018);	
			int difference[] =dateOne.differenceBetweenTwoDates(dateOne,dateTwo);
			int [] expected = {0,6,0};
			assertArrayEquals(expected,difference);	 
	 
		}
		
		@Test
		public void testTestToChecksDifferenceBetweenDays() 
		{
			Date dateOne = new Date(15,8,2018);	
			Date dateTwo = new Date(12,8,2018);	
			int difference[] =dateOne.differenceBetweenTwoDates(dateOne,dateTwo);
			int [] expected = {3,0,0};
			assertArrayEquals(expected,difference);	 
	 
		}

}
