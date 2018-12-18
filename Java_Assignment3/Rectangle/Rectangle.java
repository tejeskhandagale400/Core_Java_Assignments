/*Identifies its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly

*/


package Rectangle;

public class Rectangle 
{
	private double length,breadth;
	
	public Rectangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;

	}

	

	public double getArea()    //it finds the area of rectangle using given length and breadth
	{
		if(length <0 || breadth <0)
		{
			return 0;
		}
		else
		{
		double area=length * breadth;
		System.out.println(area);
		return area;
		}
	}



	public double getPerimeter()       //it finds the perimeter of rectangle using given length and breadth
	{
		if(length <0 || breadth <0)
		{
			return 0;
		}
		else
		{
		double perimeter = 2*(length + breadth);
		System.out.println(perimeter);
		return perimeter;
		}
	}



	public double getDiagonal()			 //it finds the diagonal of rectangle using given length and breadth
	{
		if(length <0 || breadth <0)
		{
			return 0;
		}
		else
		{
		double diagonal = Math.sqrt((length * length) + (breadth * breadth));
		System.out.println(diagonal);
		return diagonal;
		}
	}

}
