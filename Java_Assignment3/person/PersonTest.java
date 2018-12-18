package person;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

public class PersonTest {
	
	
	
	@Test
	public void testToCheckOlderOnePersonByyears()  
	{	
		Person personOne = new Person("Tejas" ,21 , 8 , 1996);
		Person personTwo = new Person("Shubham" , 2 , 3 , 1997);
		int [] expectedArray = {0,6,9};
		assertArrayEquals(expectedArray,personTwo.olderOne( personOne));

 
	}
	
	@Test
	public void testToCheckingWithDifferentDate()  
	{	
		Person personOne = new Person("Tejas" ,21 , 8 , 1996);
		Person personTwo = new Person("Akshay" ,19 , 12 , 1995);
		personTwo.olderOne( personOne);
		int [] expectedArray = {0,8,2};
		assertArrayEquals(expectedArray,personTwo.olderOne( personOne));

 
	}
}
