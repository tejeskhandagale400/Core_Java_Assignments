import static org.junit.Assert.*;

import org.junit.Test;


public class Palindrom {

	@Test
	public void testTrueConditionOfPalindrom() {
		CheckPalindrom number=new CheckPalindrom();
		String input="121";
		boolean result=number.checkPalindrom(input);
		assertTrue(result);
		

	}

}
