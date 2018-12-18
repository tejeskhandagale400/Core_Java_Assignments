import static org.junit.Assert.*;

import org.junit.Test;


public class TestStringArray {

	@Test
	public void testOfPelindromeIsExists()
	{
		StringArrayPelindrom inputArray=   new StringArrayPelindrom();
		String inputString[] = {"tejas","nayan","ketan","shubham","nitin","tushar","reddy","aniket","ganesh","laal"};
		inputArray.checkPelindrom(inputString);
		String expected[]={"nitin","nayan","laal"};
		String [] actual=inputArray.checkPelindrom(inputString);
		assertArrayEquals(expected,actual);
		

	}
	@Test
	public void testOfPelindromeDoesNotExists()
	{
		StringArrayPelindrom inputArray=   new StringArrayPelindrom();
		String inputString[] = {"tejas","sunil","ketan","shubham","sunday","tushar","reddy","aniket","ganesh","speed"};
		inputArray.checkPelindrom(inputString);
		String expected[]={""};
		String [] actual=inputArray.checkPelindrom(inputString);
		assertArrayEquals(expected,actual);
		

	}

}
