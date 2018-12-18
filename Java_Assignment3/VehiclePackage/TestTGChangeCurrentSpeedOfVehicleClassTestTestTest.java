package VehiclePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTGChangeCurrentSpeedOfVehicleClassTestTestTest {

	@Test
	public void testChangeCurrentSpeedUsingNoArgumentConstructor() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.changeSpeed(0);
		assertEquals(0,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testChangeCurrentSpeedUsingArgumentConstructor() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.changeSpeed(20);
		assertEquals(20,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testChangeCurrentSpeedToMaximumSpeed() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.changeSpeed(200);
		assertEquals(200,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testChangeCurrentSpeedDecreasingWhenInitialyPositive() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.setCurrentSpeed(30);
		newCar.changeSpeed(-20);
		assertEquals(10,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testChangeCurrentSpeedDecreasingWhenInitialyZero() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.setCurrentSpeed(0);
		newCar.changeSpeed(-20);
		assertEquals(0,newCar.getCurrentSpeed(),0);
		
	}

}
