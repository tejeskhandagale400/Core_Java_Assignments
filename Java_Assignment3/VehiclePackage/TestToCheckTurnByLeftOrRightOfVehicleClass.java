package VehiclePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestToCheckTurnByLeftOrRightOfVehicleClass {


	@Test
	public void testSetCurrentDirectionTurnRightUsingArgumentConstructor() 
	{
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.turnByLeftOrRight(true,90);
		assertEquals("East",newCar.getCurrentDirection() );
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLeftUsingNOArgumentConstructor() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,90);
		assertEquals("West",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLefWhenInitialy0Degree() 
	{

		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(true,0);
		assertEquals("North",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnRightBy90Degree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(true,90);
		assertEquals("East",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnRightBy180Degree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(true,180);
		assertEquals("South",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnRightBy270Degree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(true,270);
		assertEquals("West",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnRightBy360Degree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(true,0);
		assertEquals("North",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLeftBy90Degree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,90);
		assertEquals("West",newCar.getCurrentDirection());
		
	}
	

	@Test
	public void testSetCurrentDirectionTurnLeftBy180Degree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,180);
		assertEquals("South",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLeftBy270Degree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,270);
		assertEquals("East",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLeftBy360Degree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,360);
		assertEquals("North",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLeftBy30ToGetNorthWestDegree() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,30 );
		assertEquals("NorthWest",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLeftToGetNorthWest() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,110 );
		assertEquals("SouthWest",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLeftToGetSouthEast() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,220 );
		assertEquals("SouthEast",newCar.getCurrentDirection());
		
	}
	
	@Test
	public void testSetCurrentDirectionTurnLeftToGetNorthEast() 
	{
		VehicleClass newCar = new VehicleClass();
		newCar.turnByLeftOrRight(false,310 );
		assertEquals("NorthEast",newCar.getCurrentDirection());
		
	}


}
