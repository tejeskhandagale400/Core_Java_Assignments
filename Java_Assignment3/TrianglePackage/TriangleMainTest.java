package TrianglePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleMainTest {

	@Test
	public void test() 
	{
		float sideOne=6 , sideTwo= 6 ,sideThree = 6;
		TriangleClass triangle = new TriangleClass(sideOne ,sideTwo , sideThree);
		/*boolean isRight = triangle.isRight();
		System.out.println(isRight);
		boolean isScalene = triangle.isScalene();
		System.out.println(isScalene);*/
		boolean isIsosceles = triangle.isIsosceles();
		System.out.println(isIsosceles);
		boolean isEquilateral  = triangle.isEquilateral ();
		System.out.println(isEquilateral );


	}

}
