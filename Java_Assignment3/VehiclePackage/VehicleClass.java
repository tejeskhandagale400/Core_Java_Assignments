

/*This problem has several parts:

1. Write a simple Vehicle class that has fields for (at least) current speed, current direction in degrees, and owner name.
2. Add a static field to your Vehicle class for the highest Vehicle Identification Number issued, and a non-static field that holds each vehicle's ID number.
3. Write a main method for your Vehicle class that creates a few vehicles and prints out their field values. Note that you can also write a separate tester program as well.
4. Add two constructors to Vehicle. A no-arg constructor and one that takes an initial owner's name. Modify the tester program from the previous step and test your design.
5. Make the fields in your Vehicle class private, and add accessor methods for the fields. Which fields should have methods to change them and which should not?
6. Add a changeSpeed method that changes the current speed of the vehicle to a passed-in value, and a stop method that sets the speed to zero.
7. Add two turn methods to Vehicle. One that takes a number of degrees to turn, and one that takes simply either a Vehicle.TURN_LEFT or a Vehicle.TURN_RIGHT constant. Define the two constants accordingly.
8. Add a static method to Vehicle that returns the highest identification number used so far.
9. Add a toString method to Vehicle.
10. Now Test all of the above in a main method that will be in saperate class.*/








package VehiclePackage;


public class VehicleClass 
{
	private String owenerName;
	private float currentSpeed;
	private float currentDirection;
	private String []directionArray = {"North","NorthWest", "West" , "SouthWest" , "South" , "SouthEast" , "East" ,"NorthEast"};
	private static int highestVehicleIdentificationNumber;
	private static String direction = "";
	private int VehicleIdentificationNumber;
	private final boolean TURN_LEFT = false;
	private final boolean TURN_RIGHT = true;
	
			public VehicleClass() 					//No argument constructor
			{
				VehicleIdentificationNumber = highestVehicleIdentificationNumber +1;  //Here The ID is generated
				highestVehicleIdentificationNumber = highestVehicleIdentificationNumber > VehicleIdentificationNumber ? highestVehicleIdentificationNumber : VehicleIdentificationNumber;

			}
			
			public VehicleClass(String owenerName) 		// argument constructor with argument owner name
			{
				this.owenerName = owenerName;
				VehicleIdentificationNumber = highestVehicleIdentificationNumber + 1 ;
				highestVehicleIdentificationNumber = highestVehicleIdentificationNumber > VehicleIdentificationNumber ? highestVehicleIdentificationNumber : VehicleIdentificationNumber;

			}
		
			public String getOwenerName()
			{
				return owenerName;
			}
		
			public void setOwenerName(String owenerName) 
			{
				this.owenerName = owenerName;
			}
		
			public float getCurrentSpeed() 
			{
				return currentSpeed;
			}
		
			public void setCurrentSpeed(float currentSpeed)					//here we have set the initial speed of car when it starts
			{
				
				this.currentSpeed =( (this.currentSpeed+currentSpeed)<=201  && (this.currentSpeed + currentSpeed)>=0) ? this.currentSpeed+currentSpeed : 0;
				
			}
		
			public String getCurrentDirection() {
				return direction;
			}
		
	
			public int getVehicleIdentificationNumber() 
			{
				return VehicleIdentificationNumber;
			}
		
	
		
			public void changeSpeed(float newSpeed)					//here the speed is set by passing values positive or negative i.e. it increses or decreases
			{
				if( (currentSpeed + newSpeed)<201  && (currentSpeed + newSpeed) > 0)  		//speed will not increase more than 200  it is max speed and never gets below 0
				currentSpeed +=newSpeed;
				else
					System.out.println(currentSpeed);
				
		
				
			}
		
			public void stop() 				//Stops the vehicle
			{
		
				currentSpeed = 0;
				
			}
		


		
			public void turnByLeftOrRight(boolean rightOrLeft , float valueInDegree)   		////changes the direction if positive then towards right sideif negative the towards left side
			{
			
				if(rightOrLeft)
				{
					if((currentDirection + valueInDegree) <= 360)
					{
					currentDirection = currentDirection + valueInDegree;
					
						if(currentDirection==0 || currentDirection == 360)
							direction =  directionArray[0];
						
						if(currentDirection>0 && currentDirection <90)
							direction =  directionArray[7];
						
						if(currentDirection == 90)
							direction =  directionArray[6];
						
						if(currentDirection > 90  && currentDirection <180)
							direction =  directionArray[5];
						
						if(currentDirection ==180)
							direction =  directionArray[4];

						if(currentDirection > 180  && currentDirection <270)
							direction =  directionArray[3];
						
						if(currentDirection == 270)
							direction =  directionArray[2];


						if(currentDirection > 270  && currentDirection <360)
							direction =  directionArray[1];
						
					
					}
					
				}
				else
				{
					if((currentDirection - valueInDegree) >= -360)
					{
						currentDirection = currentDirection - valueInDegree;
						
						if(currentDirection==0 || currentDirection==-360)
							direction =  directionArray[0];
						
						if(currentDirection<0 && currentDirection >(-90))
							direction =  directionArray[1];
						
						if(currentDirection == (-90))
							direction =  directionArray[2];
						
						if(currentDirection < (-90)  && currentDirection >(-180))
							direction =  directionArray[3];
						
						if(currentDirection ==(-180))
							direction =  directionArray[4];
	
						if(currentDirection < (-180)  && currentDirection >(-270))
							direction =  directionArray[5];
						
						if(currentDirection == (-270))
							direction =  directionArray[6];
	
	
						if(currentDirection < (-270)  && currentDirection >(-360))
							direction =  directionArray[7];
					
					
					}
					
				}
				System.out.println("direction is = " +direction);
				
			}
		
			public int highestIdentificationNumber()					//It will return the highest used vehical id 
			{
				
				return highestVehicleIdentificationNumber;
				
			}
		
			
			public String toString()								//To Get all details Of car in string format
			{
				return " owenerName=" + owenerName + ", currentSpeed=" + currentSpeed + ", currentDirection="
						+ currentDirection + ", VehicleIdentificationNumber=" + VehicleIdentificationNumber;
			}
			
			
			public static void main(String [] args)
			{
				VehicleClass car = new VehicleClass();  		//Unique ID is generated to unique object 
				VehicleClass newCar = new VehicleClass("Tejas");
				newCar.setCurrentSpeed(60);
				newCar.changeSpeed(40);
				System.out.println("now speed " +newCar.getCurrentSpeed());
				System.out.println("id 1  " +car.getVehicleIdentificationNumber());
				System.out.println("id 2  " +newCar.getVehicleIdentificationNumber());
				VehicleClass carNaaaa = new VehicleClass();
				System.out.println("id 3  " +carNaaaa.getVehicleIdentificationNumber());
 				System.out.println("now direction " +newCar.getCurrentDirection());
 				System.out.println("now direction " +newCar.getCurrentDirection());
 				newCar.turnByLeftOrRight(true,90);
 				newCar.turnByLeftOrRight(false,90);					//vehicle direction is change right side and taking value in degrees 
 				newCar.turnByLeftOrRight(false,30);					//vehicle direction is change left side and taking value in degrees 

				System.out.println(newCar.toString());
				System.out.println(car.toString());
				System.out.println(newCar.highestIdentificationNumber());

			}

}
