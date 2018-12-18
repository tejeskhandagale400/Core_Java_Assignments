package Complex;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForComplex
{
	private Complex complexNumberOne = new Complex();
	private Complex complexNumberTwo = new Complex();
	private Complex complexNumberThree = new Complex();


	
	@Test
	public  void main() 
	{
		float realOne=10,imaginaryOne=20;
		complexNumberOne.setValues(realOne,imaginaryOne);
		complexNumberOne.display();
		complexNumberTwo.setValues(-2,-2);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();
	}

}
