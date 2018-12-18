package Distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForDistanceAddition {
	
	private Distance distanceOne = new Distance();  //creates new object
	private Distance distanceTwo = new Distance(); //creates new object
	private Distance distanceThree = new Distance();  //creates new object


	@Test
	public void testForAdditionOfTwoDistancesOfHavingInchesAdditionGreaterThan12() 
	{
		
		int feet = 5;
		float inches = 9;
		
		distanceOne.set(feet,inches);   //It sets the values in new object by calling set() function and passing parameters
		distanceOne.display();			
		distanceTwo.set(5,8);
		
		distanceThree = distanceThree.addition(distanceOne,distanceTwo);  //It calls the adda() function and get the new object
		assertEquals(11,distanceThree.getFeet(),0.02);

	}
	
	@Test
	public void testForAdditionOfTwoDistancesOfHavingInchesAdditionLessThan12() 
	{
		
		int feet = 5;
		float inches = 3;
		
		distanceOne.set(feet,inches);   //It sets the values in new object by calling set() function and passing parameters
		distanceOne.display();			
		distanceTwo.set(5,8);
		
		distanceThree = distanceThree.addition(distanceOne,distanceTwo);  //It calls the adda() function and get the new object
		assertEquals(10,distanceThree.getFeet(),0.02);

	}
	



}
