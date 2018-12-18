import static org.junit.Assert.*;

import org.junit.Test;


public class TestOfDistinctIndinces {

	@Test
	public void testOfDistinctIndicesAreEqual() {
		int inputArray[]={1,2,4,5,4,2,3,4,5};
		int atmostDiff=4;
		int indexOne = 1;
		int indexTwo = 5;
		
		DistinctIndices firstExample=new DistinctIndices();
		boolean actual=firstExample.checkSimillerOrnot(inputArray,indexOne,indexTwo,atmostDiff);
		assertTrue(actual);
	}
	
	
	@Test
	public void testOfDistinctIndicesAreNotEqual() {
		int inputArray[]={1,2,4,5,4,2,3,4,5};
		int atmostDiff=4;
		int indexOne = 1;
		int indexTwo = 6;
		
		DistinctIndices firstExample=new DistinctIndices();
		boolean actual=firstExample.checkSimillerOrnot(inputArray,indexOne,indexTwo,atmostDiff);
		assertFalse(actual);
	}
}
