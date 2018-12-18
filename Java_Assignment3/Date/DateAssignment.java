import static org.junit.Assert.*;

import org.junit.Test;


public class DateAssignment {

	@Test
	public void main()
	{
		int day = 21, month = 8, year = 2020;
		Date dateOne = new Date(30,2,1997);	
		Date dateTwo = new Date(31,2,2018);	
		String returnedDateOne = dateOne.toString();
		String retrunDateTwo = dateTwo.toString();

		System.out.println(returnedDateOne);
	 	System.out.println(retrunDateTwo);
		boolean output = dateOne.isSmaller(dateOne,dateTwo);  
																		/* in isSmaller Method dateOne >dateTwo ==true
																		 dateOne<dateTwo ==false
																		 dateOne=dateTwo ==false*/
		System.out.println(output);
		
		int difference[] =dateOne.differenceBetweenTwoDates(dateOne,dateTwo);
	 
		
	}

}
