/*Write the definition for a class called Distance that has properties feet as integer  and inches as float. The class has the following behaviours/services/methods:
void set(int, float) to give value to object
void disp() to display distance in feet and inches
Distance add(Distance) to sum two distances & return distance */




package Distance;

public class Distance 
{
	private int feet;
	private float inches;

	public void set(int feet, float inches) 
	{
		this.feet= feet;
		this.inches = inches;

		
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public float getInches() {
		return inches;
	}

	public void setInches(float inches) {
		this.inches = inches;
	}

	public void display()
	{
		System.out.println("Distance is " +feet+ "' " +inches+ "'' " );  //It displays the distance in standard Format
		
	}

	public Distance addition(Distance distanceOne, Distance distanceTwo) 
	{
		Distance distance = new Distance();
		distance.feet= distanceOne.feet + distanceTwo.feet;
		distance.inches = distanceOne.inches + distanceTwo.inches;
		
		if(distance.inches>=12)      //---------It checks weather the the addition of inches is greater tha 12 or not it it is greater than 12 the it increases the feet by 1
		{
			distance.feet=distance.feet + 1;
			distance.inches = distance.inches -12;
			return distance;
		}
		return distance;              //Returns the distance after addition
	}

}
