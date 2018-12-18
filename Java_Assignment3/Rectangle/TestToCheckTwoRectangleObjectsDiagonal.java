package Rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestToCheckTwoRectangleObjectsDiagonal {



	@Test
	public void testToCheckTwoObjectsOfSameDiagonal() 
	{	
		Rectangle firstObject = new Rectangle(5,4);
		Rectangle secondObject = new Rectangle(4,5);
		double diagonalOfObjectOne = firstObject.getDiagonal();
		double diagonalOfObjectTwo = secondObject.getDiagonal();
		assertEquals( diagonalOfObjectOne , diagonalOfObjectTwo , 0.02 );  //It Checks weather the Perimeter of Two objects are not same
		
	}
	
	

	@Test
	public void testToCheckTwoObjectsOfDifferentDiagonal() 
	{	
		Rectangle firstObject = new Rectangle(5,4);
		Rectangle secondObject = new Rectangle(4,6);
		double diagonalOfObjectOne = firstObject.getPerimeter();
		double diagonalOfObjectTwo = secondObject.getPerimeter();
		assertNotEquals( diagonalOfObjectOne , diagonalOfObjectTwo , 0.02 );  //It Checks weather the Perimeter of Two objects are not same
		
	}
	
}
