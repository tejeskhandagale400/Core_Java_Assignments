package Rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForPerimeterOfRectangle 
{
	@Test
	public void testToCheckPeremeterCorrectOrNot() 
	{
		Rectangle firstObject = new Rectangle(5,4);
		assertEquals(18,firstObject.getPerimeter(),0.02);
		
	}
	
	@Test
	public void testToCheckPeremeterOfNegativeLength() 
	{
		 Rectangle firstObject = new Rectangle(-5,4);
		assertEquals(0,firstObject.getPerimeter(),0.02);
		
	}
	

	@Test
	public void testToCheckPeremeterOfNegativeBreadth() 
	{
		 Rectangle firstObject = new Rectangle(5,-4);
		assertEquals(0,firstObject.getPerimeter(),0.02);
		
	}
	
	@Test
	public void testToCheckPeremeterOfBothNegative() 
	{
		 Rectangle firstObject = new Rectangle(-5,-10);
		assertEquals(0,firstObject.getPerimeter(),0.02);
		
	}
	
	@Test
	public void testToCheckPeremeterOflengthZero() 
	{
		 Rectangle firstObject = new Rectangle(0,4);
		assertEquals(8,firstObject.getPerimeter(),0.02);
		
	}
	
	@Test
	public void testToCheckPeremeterOfBreadthZero() 
	{
		 Rectangle firstObject = new Rectangle(5,0);
		assertEquals(10,firstObject.getPerimeter(),0.02);
		
	}
	
}
