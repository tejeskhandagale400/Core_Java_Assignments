import static org.junit.Assert.*;

import org.junit.Test;


public class TestForFindingMissingNumber {

	@Test
	public void testForFindingMissingNumber() {
		int inputArray[]={5,2,4,6,10,7,3,9,1};
		FindingMissingNumberFromArray number = new FindingMissingNumberFromArray();
		int occuredNumber = number.findMissingNumber(inputArray);
		int expected = 8;
		assertEquals(expected,occuredNumber);
	}
	
		
	@Test
	public void testofThereIsNoMissingNumber() {
		int inputArray[]={5,2,4,6,10,8,7,3,9,1};
		FindingMissingNumberFromArray number = new FindingMissingNumberFromArray();
		int occuredNumber = number.findMissingNumber(inputArray);
		int expected = 0;
		assertEquals(expected,occuredNumber);
	}
}
