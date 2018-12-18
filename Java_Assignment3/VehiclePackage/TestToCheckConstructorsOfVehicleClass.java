package VehiclePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestToCheckConstructorsOfVehicleClass {

	@Test
	public void testToCheckNoArgumentConstructorToCheckIDIsGenerated() 
	{
		VehicleClass newCar = new VehicleClass();
		assertEquals(2,+newCar.getVehicleIdentificationNumber());
			
	}
	
	@Test
	public void testToCheckArgumentConstructorToCheckIDIsGenerated() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		assertEquals(1,newCar.getVehicleIdentificationNumber());
		
	}
	
	@Test
	public void testToCheckArgumentConstructorToCheckNameIsPassedOrNot() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		assertEquals("Tejas",newCar.getOwenerName());
		
	}

}
