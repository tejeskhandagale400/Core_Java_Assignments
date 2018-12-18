package TrianglePackage;

public class TriangleClass
{
	private float sideOne,sideTwo,sideThree;
	
	public TriangleClass(float sideOne, float sideTwo, float sideThree) 
	{
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public boolean isRight() 
	{	
		if(sideOne > sideTwo && sideOne > sideThree)					//It check which side is greater 
		{
			double sidesSqrt = Math.sqrt((sideTwo * sideTwo) + (sideThree * sideThree));    //Here the pythagoros theorem is applies  i.e. hypoteneous = squareroot(sidetwo sqr +sideThree sqr)) 
			if(sidesSqrt == sideOne)
				return true;
			
		}
		
		if(sideTwo > sideOne && sideTwo > sideThree)
		{
			double sidesSqrt = Math.sqrt((sideOne * sideOne) + (sideThree * sideThree));
			if(sidesSqrt == sideTwo)
				return true;
			
		}
		
		if(sideThree > sideOne && sideThree > sideTwo)
		{
			double sidesSqrt = Math.sqrt((sideOne * sideOne) + (sideTwo * sideTwo));
			if(sidesSqrt == sideThree)
				return true;
			
		}
		
		return false;
	}

	public boolean isScalene()
	{
		if(sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree)				//it checks the 2 sides are equal or not
		{
			return true;
		}
		return false;
	}

	public boolean isIsosceles() 											//it checks the 2 sides are equal or not if equal then it is isosceles
	{	
		if((sideOne == sideTwo) || ( sideTwo == sideThree) || (sideThree == sideOne) || (sideOne == sideTwo && sideOne == sideThree && sideThree == sideOne))
		{
			return true;
		}
			return false;
	
		
	}
		
	public boolean isEquilateral()								//it checks the 3 sides are equal or not if equal then it is equilateral
	{
		if((sideOne == sideTwo && sideOne == sideThree && sideThree == sideOne))
		{
			return true;
		}
		return false;

	}
	
}

