package VehiclePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestToCheckSetOwenerNameMethodOfVehicleClassTest {
 
	@Test
	public void testToCheckArgumentConstructorToCheckNameIsSet() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		assertEquals("Tejas",newCar.getOwenerName());
		
	}
	
	@Test
	public void testToCheckNoArgumentConstructorToCheckNameEmpty() 
	{
		VehicleClass newCar = new VehicleClass();
		assertEquals(null,newCar.getOwenerName());
		
	}

}
