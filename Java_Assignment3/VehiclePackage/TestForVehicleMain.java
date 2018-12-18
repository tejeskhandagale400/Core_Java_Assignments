package VehiclePackage;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForVehicleMain {

	@Test
	public void mainTestToTestTheMethods() 
	{
		VehicleClass car = new VehicleClass();
		VehicleClass newCar = new VehicleClass("Tejas");
		newCar.setCurrentSpeed(60);
		newCar.changeSpeed(40);
		System.out.println("now speed " +newCar.getCurrentSpeed());
		
		
		newCar.turnByLeftOrRight(true, 60);
		System.out.println("now direction " +newCar.getCurrentDirection());
		newCar.turnByLeftOrRight(false,80);
		System.out.println("now direction " +newCar.getCurrentDirection());
		System.out.println(newCar.toString());
		System.out.println(car.toString());
		System.out.println(newCar.highestIdentificationNumber());


	}

}
