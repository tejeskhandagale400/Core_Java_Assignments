package VehiclePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestToGetHighestIdentificationNumberOfVehicleClass {

	@Test
	public void testOfGetingHighestIDNumberUsingNoArgumentConstructor() 
	{

		VehicleClass carOne = new VehicleClass();
		VehicleClass carTwo = new VehicleClass();
		System.out.println(carTwo.highestIdentificationNumber());

		assertEquals(6,carTwo.highestIdentificationNumber());
		
	}
	
	@Test
	public void testOfGetingHighestIDNumberUsingArgumentConstructor() 
	{

		VehicleClass carOne = new VehicleClass("Tejas");
		VehicleClass carTwo = new VehicleClass("Shubham");
		System.out.println(carTwo.highestIdentificationNumber());
		assertEquals(4,carTwo.highestIdentificationNumber());
		
	}
	
	@Test
	public void testOfGetingHighestIDNumberUsingBotthConstructor() 
	{

		VehicleClass carOne = new VehicleClass("Tejas");
		VehicleClass carTwo = new VehicleClass();
		System.out.println(carTwo.highestIdentificationNumber());
		assertEquals(2,carTwo.highestIdentificationNumber());
		
	}

}
