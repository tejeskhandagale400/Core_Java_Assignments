package Distance;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {

	@Test
	public void main() 
	{
		Distance distanceOne = new Distance();  //creates new object
		int feet = 5;
		float inches = 9;
		
		distanceOne.set(feet,inches);   //It sets the values in new object by calling set() function and passing parameters
		distanceOne.display();	
		
		Distance distanceTwo = new Distance(); //creates new object
		distanceTwo.set(5,8);
		distanceTwo.display();
		Distance distanceThree = new Distance();  //creates new object
		distanceThree = distanceThree.addition(distanceOne,distanceTwo);  //It calls the adda() function and get the new object
		distanceThree.display();
	}

}
