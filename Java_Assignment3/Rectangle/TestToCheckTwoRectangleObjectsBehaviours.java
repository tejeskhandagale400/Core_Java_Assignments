package Rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestToCheckTwoRectangleObjectsBehaviours {


	@Test
	public void testToCheckTwoObjectsOfSameArea() 
	{	
		Rectangle firstObject = new Rectangle(5,4);
		Rectangle secondObject = new Rectangle(4,5);
		 assertEquals(firstObject.getArea(),firstObject.getArea(),0.02);   //It Checks weather the area of Two objects are  sam
		
	}
	
	@Test
	public void testToCheckTwoObjectsOfDifferentArea() 
	{	
		Rectangle firstObject = new Rectangle(5,4);
		Rectangle secondObject = new Rectangle(4,6);
		double areaOfObjectOne=firstObject.getArea();
		double areaOfObjectTwo=secondObject.getArea();
		assertNotEquals(areaOfObjectOne,areaOfObjectTwo,0.02);  //It Checks weather the area of Two objects are not same
		
	}
	 

	@Test
	public void testToCheckTwoObjectsOfSameAreaBecauseOfNegativeLength() 
	{	
		Rectangle firstObject = new Rectangle(-5,4);
		Rectangle secondObject = new Rectangle(-4,6);
		double areaOfObjectOne=firstObject.getArea();
		double areaOfObjectTwo=secondObject.getArea();
		assertEquals(areaOfObjectOne,areaOfObjectTwo,0.02);  //It Checks weather the area of Two objects are not same
		
	}
	

	@Test
	public void testToCheckTwoObjectsOfSameAreaBecauseOfNegativeBreadthAndLength() //It willShow Same Area because it passing negative values which is an error so area return 0
	{	
		Rectangle firstObject = new Rectangle(-5,-4);
		Rectangle secondObject = new Rectangle(-4,-6);
		double areaOfObjectOne=firstObject.getArea();
		double areaOfObjectTwo=secondObject.getArea();
		assertEquals(areaOfObjectOne,areaOfObjectTwo,0.02);  //It Checks weather the area of Two objects are not same
		
	}

	@Test
	public void testToCheckTwoObjectsOfDifferentAreaBecauseOfPositiveBreadthAndLength() 
	{	
		Rectangle firstObject = new Rectangle(80,6);
		Rectangle secondObject = new Rectangle(4,6);
		double areaOfObjectOne=firstObject.getArea();
		double areaOfObjectTwo=secondObject.getArea();
		assertNotEquals(areaOfObjectOne,areaOfObjectTwo,0.02);  //It Checks weather the area of Two objects are not same
		
	}
}
