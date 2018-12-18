package TrianglePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForisRightTriangle {

	@Test
	public void testForNotRightAngleTriangle()
	{
		
		TriangleClass triangle = new TriangleClass(5 ,2 , 3);
		assertFalse(triangle.isRight());

	}
	
	@Test
	public void testForRightAngleTriangle()
	{
		
		TriangleClass triangle = new TriangleClass(3 ,4 , 5);
		assertTrue(triangle.isRight());

	}

}
