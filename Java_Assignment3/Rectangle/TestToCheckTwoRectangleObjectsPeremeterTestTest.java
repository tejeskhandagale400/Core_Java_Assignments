package Rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestToCheckTwoRectangleObjectsPeremeterTestTest {


	@Test
	public void testToCheckTwoObjectsOfSamePerimeter() 
	{	
		Rectangle firstObject = new Rectangle(5,4);
		Rectangle secondObject = new Rectangle(4,5);
		double peremeterOfObjectOne=firstObject.getPerimeter();
		double peremeterOfObjectTwo=secondObject.getPerimeter();
		assertEquals(peremeterOfObjectOne,peremeterOfObjectTwo,0.02);  //It Checks weather the Perimeter of Two objects are not same
		
	}
	
	

	@Test
	public void testToCheckTwoObjectsOfDifferentPerimeter() 
	{	
		Rectangle firstObject = new Rectangle(5,4);
		Rectangle secondObject = new Rectangle(4,6);
		double peremeterOfObjectOne=firstObject.getPerimeter();
		double peremeterOfObjectTwo=secondObject.getPerimeter();
		assertNotEquals(peremeterOfObjectOne,peremeterOfObjectTwo,0.02);  //It Checks weather the Perimeter of Two objects are not same
		
	}
	
}
