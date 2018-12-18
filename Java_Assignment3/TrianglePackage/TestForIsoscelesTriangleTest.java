package TrianglePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForIsoscelesTriangleTest {

	@Test
	public void testForNotAIsoscelesTriangleForTwoSidesAreDiff()
	{
		
		TriangleClass triangle = new TriangleClass(2 ,5 , 3);		//because two sides are not same it is not isosceles
		assertFalse(triangle.isIsosceles());

	}
	
	@Test
	public void testForAIsoscelesTriangleForTwoSidesAreEqual()
	{
		
		TriangleClass triangle = new TriangleClass(3 ,4 , 4);		//because two sides are  same it is  isosceles
		assertTrue(triangle.isIsosceles());

	}
	

	@Test
	public void testForAScaleneTriangleForThreeSidesAreEqual()
	{
		
		TriangleClass triangle = new TriangleClass(4 ,4 , 4);		//because three sides are  same it is  a Isosceles becoz every equilateral triangle is isosceles
		assertTrue(triangle.isIsosceles());

	}

}
