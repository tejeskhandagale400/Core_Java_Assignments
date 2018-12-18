package VehiclePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTGetCurrentSpeedOfVehicleClassTestTest {

	@Test
	public void testGetCurrentSpeedUsingNoArgumentConstructor() 
	{
		VehicleClass newCar = new VehicleClass();
		assertEquals(0,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testGetCurrentSpeedUsingArgumentConstructor() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		assertEquals(0,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testGetCurrentSpeedBySetSpeedAndIncreasing() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.setCurrentSpeed(20);
		assertEquals(20,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testGetCurrentSpeedBySetSpeedAndDecreasing() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.setCurrentSpeed(40);		//First INcreasing Speed
		System.out.println(newCar.getCurrentSpeed());
		newCar.setCurrentSpeed(-20);	//Decreasing Speed
		assertEquals(20,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testGetCurrentSpeedBySetSpeedAndDecreasingToZero() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.setCurrentSpeed(40);		//First INcreasing Speed
		newCar.setCurrentSpeed(-40);	//Decreasing Speed
		assertEquals(0,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testGetCurrentSpeedBySetSpeeIncreasingToHisghestSpeed() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.setCurrentSpeed(200);		//First INcreasing Speed
		assertEquals(200,newCar.getCurrentSpeed(),0);
		
	}
	
	@Test
	public void testGetCurrentSpeedBySetSpeeExcedingToHisghestSpeed() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.setCurrentSpeed(210);		//First INcreasing Speed
		assertEquals(0,newCar.getCurrentSpeed(),0);
		
	}
}
