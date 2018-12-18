import static org.junit.Assert.*;

import org.junit.Test;


public class TestReverse {

	@Test
	public void testOfReverseOfTwoWords() 
	{
		ReverseOrderOfCharacter input= new ReverseOrderOfCharacter();
		String output=input.reverseOrder("Hi Tejas");
	 	String expected="iH sajeT";
		assertEquals(expected,output);
	}
	
	@Test
	public void testOfReverseOfMoreThanTwoWords() 
	{
		ReverseOrderOfCharacter input= new ReverseOrderOfCharacter();
		String output=input.reverseOrder("Good Morning Have A nice Day");
		
		String expected="dooG gninroM evaH A ecin yaD";
		assertEquals(expected,output);
	}
	
	@Test
	public void testOfReverseOfMixtureOfNumbersAndWords() 
	{
		ReverseOrderOfCharacter input= new ReverseOrderOfCharacter();
		String output=input.reverseOrder("Addition Of 2 And 4 is 6");
		
		String expected="noitiddA fO 2 dnA 4 si 6";
		assertEquals(expected,output);
	}
}
