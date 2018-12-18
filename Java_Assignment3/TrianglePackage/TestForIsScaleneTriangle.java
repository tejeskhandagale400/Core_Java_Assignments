package TrianglePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForIsScaleneTriangle {

	@Test
	public void testForNotAScaleneTriangleForTwoSidesAreequal()
	{
		
		TriangleClass triangle = new TriangleClass(2 ,2 , 3);		//because two sides are same it is not a scalene
		assertFalse(triangle.isScalene());

	}
	
	@Test
	public void testForNotAScaleneTriangleForThreeSidesAreequal()
	{
		
		TriangleClass triangle = new TriangleClass(4 ,4 , 4);		//because three sides are same it is not a scalene
		assertFalse(triangle.isScalene());

	}
	

	@Test
	public void testForAScaleneTriangleForThreeSidesAreDifferent()
	{
		
		TriangleClass triangle = new TriangleClass(3 ,12 , 4);		//because three sides are not same it is  a scalene
		assertTrue(triangle.isScalene());

	}
}
