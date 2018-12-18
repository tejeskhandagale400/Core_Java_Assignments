package TrianglePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForIsEquilateralTriangleTest {

	@Test
	public void testForNotEquilateralTriangleForAllSidesAreDiff()
	{
		
		TriangleClass triangle = new TriangleClass(2 ,5 , 3);		//because two sides are not same it is not Equilateral
		assertFalse(triangle.isEquilateral());

	}
	
	@Test
	public void testForAIsNotEquilateralTriangleForTwoSidesAreEqual()
	{
		
		TriangleClass triangle = new TriangleClass(3 ,4 , 4);		//because two sides are  same it is not Equilateral
		assertFalse(triangle.isEquilateral());

	}
	

	@Test
	public void testForEquilateralTriangleForThreeSidesAreEqual()
	{
		
		TriangleClass triangle = new TriangleClass(4 ,4 , 4);		//because three sides are  same it is  a Equilateral
		assertTrue(triangle.isEquilateral());

	}

}
