import static org.junit.Assert.*;

import org.junit.Test;


public class TestToSearchElementInMultiDArray {

	@Test
	public void test() {

     SearchElementMulDimensionalArray input = new SearchElementMulDimensionalArray();
     int [][]inputArray={{1,2,3},{4,5,6}};
     int elementToSearch = 5;
     boolean output = input.elementSearch(inputArray,elementToSearch);
     assertTrue(output);
	}

}
