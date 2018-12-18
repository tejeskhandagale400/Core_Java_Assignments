package Rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForAreaOfRectangle {
	

	@Test
	public void testToCheckAreaCorrectOrNot() 
	{
		Rectangle firstObject = new Rectangle(5,4);
		assertEquals(20,firstObject.getArea(),0.02);
		
	}
	
	@Test
	public void testToCheckAreaOfNegativeLength() 
	{
		 Rectangle firstObject = new Rectangle(-5,4);
		assertEquals(0,firstObject.getArea(),0.02);
		
	}
	

	@Test
	public void testToCheckAreaOfNegativeBreadth() 
	{
		 Rectangle firstObject = new Rectangle(5,-4);
		assertEquals(0,firstObject.getArea(),0.02);
		
	}
	
	@Test
	public void testToCheckAreaOfBothNegative() 
	{
		 Rectangle firstObject = new Rectangle(-5,-10);
		assertEquals(0,firstObject.getArea(),0.02);
		
	}
	
	@Test
	public void testToCheckAreaOflengthZero() 
	{
		 Rectangle firstObject = new Rectangle(0,4);
		assertEquals(0,firstObject.getArea(),0.02);
		
	}
	
	@Test
	public void testToCheckAreaOfBreadthZero() 
	{
		 Rectangle firstObject = new Rectangle(5,0);
		assertEquals(0,firstObject.getArea(),0.02);
		
	}
	
	
}
