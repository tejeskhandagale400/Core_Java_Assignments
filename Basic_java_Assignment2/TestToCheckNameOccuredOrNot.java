import static org.junit.Assert.*;

import org.junit.Test;


public class TestToCheckNameOccuredOrNot {

	@Test
	public void testToCheckNameOccured() 
	{
		CheckNameOccureOrNot name = new CheckNameOccureOrNot();
		String [] inputArray = {"Dave", "Ann", "George", "Sa", "Ted", "Gag", "Saj",
				"Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", 
				"Williams", "Jones", "Brown", "Thomas", "Taylor","Thomas",
				"Davis", "Miller", "Wilson","Moore", "Taylor","Anderson", "Thomas", "Jackson"};
		String inputToCheck = "Thomas";		
	  int actual= name.checkName(inputArray,inputToCheck);
	  assertEquals(3,actual);
	  
	}
	
	@Test
	public void testToCheckNameNotOccured() 
	{
		CheckNameOccureOrNot name = new CheckNameOccureOrNot();
		String [] inputArray = {"Dave", "Ann", "George", "Sa", "Ted", "Gag", "Saj",
				"Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", 
				"Williams", "Jones", "Brown", "Thomas", "Taylor","Thomas",
				"Davis", "Miller", "Wilson","Moore", "Taylor","Anderson", "Thomas", "Jackson"};
		String inputToCheck = "Tejas";
		
	  int actual= name.checkName(inputArray,inputToCheck);
	  assertEquals(0,actual);

	}
	
	@Test
	public void testToCheckInvalidInput() 
	{
		CheckNameOccureOrNot name = new CheckNameOccureOrNot();
		String [] inputArray = {"Dave", "Ann", "George", "Sa", "Ted", "Gag", "Saj",
				"Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", 
				"Williams", "Jones", "Brown", "Thomas", "Taylor","Thomas",
				"Davis", "Miller", "Wilson","Moore", "Taylor","Anderson", "Thomas", "Jackson"};
		String inputToCheck = "123";
		
	  int actual= name.checkName(inputArray,inputToCheck);
	  assertEquals(0,actual);

	}

}
