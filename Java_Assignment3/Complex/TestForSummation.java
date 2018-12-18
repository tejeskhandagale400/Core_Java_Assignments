package Complex;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForSummation 
{
	
	private Complex complexNumberOne = new Complex();
	private Complex complexNumberTwo = new Complex();
	private Complex complexNumberThree = new Complex();
	
	@Test
	public void testForSummationOfPositiveInputCheckingRealPart()
	{
		complexNumberOne.setValues(10,20);
		complexNumberOne.display();
		complexNumberTwo.setValues(25,25);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();
			
		assertEquals(35.0,complexNumberThree.getReal(),0.02);
	}
	
	@Test
	public void testForSummationOfPositiveInputCheckingImaginaryPart()
	{
		complexNumberOne.setValues(10,20);
		complexNumberOne.display();
		complexNumberTwo.setValues(25,25);			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		assertEquals(45.0,complexNumberThree.getImaginary(),0.02);
		
	}
	
	@Test
	public void testForSummationOfNegativetiveRealValueCheckingRealPart()
	{
		complexNumberOne.setValues(-10,20);
		complexNumberOne.display();
		complexNumberTwo.setValues(-25,25);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();			
		assertEquals(-35.0,complexNumberThree.getReal(),0.02);
	}
	
	@Test
	public void testForSummationOfNegativetiveImaginaryValueCheckingImaginaryPart()
	{
		complexNumberOne.setValues(10,-20);
		complexNumberOne.display();
		complexNumberTwo.setValues(25,-25);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();			
		assertEquals(-45.0,complexNumberThree.getImaginary(),0.02);
	}
	
	
	
	@Test
	public void testForSummationOfNegativetiveBothRealValuesAreZerosValueCheckingImaginaryPart()
	{
		complexNumberOne.setValues(0,10);
		complexNumberOne.display();
		complexNumberTwo.setValues(0,11);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();			
		assertEquals(21.0,complexNumberThree.getImaginary(),0.02);
	}
	
	@Test
	public void testForSummationOfNegativetiveBothRealValuesAreZerosValueCheckingRealPart()
	{
		complexNumberOne.setValues(0,10);
		complexNumberOne.display();
		complexNumberTwo.setValues(0,11);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();			
		assertEquals(0.0,complexNumberThree.getReal(),0.02);
	}
		
	@Test
	public void testForSummationOfNegativetiveBothImaginaryValuesAreZerosValueCheckingRealPart()
	{
		complexNumberOne.setValues(10,0);
		complexNumberOne.display();
		complexNumberTwo.setValues(10,0);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();			
		assertEquals(20.0,complexNumberThree.getReal(),0.02);
	}
	
	@Test
	public void testForSummationOfNegativetiveBothImaginaryValuesAreZerosValueCheckingImaginaryPart()
	{
		complexNumberOne.setValues(10,0);
		complexNumberOne.display();
		complexNumberTwo.setValues(10,0);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();			
		assertEquals(0.0,complexNumberThree.getImaginary(),0.02);
	}
	
	@Test
	public void testForSummationOfNegativetiveBothValuesAreZerosValueCheckingImaginaryPart()
	{
		complexNumberOne.setValues(0,0);
		complexNumberOne.display();
		complexNumberTwo.setValues(0,0);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();			
		assertEquals(0.0,complexNumberThree.getImaginary(),0.02);
	}
	
	@Test
	public void testForSummationOfNegativetiveBothValuesAreZerosValueCheckingRealPart()
	{
		complexNumberOne.setValues(0,0);
		complexNumberOne.display();
		complexNumberTwo.setValues(0,0);
		complexNumberTwo.display();
			
		complexNumberThree = complexNumberThree.sumation(complexNumberOne ,complexNumberTwo);
		complexNumberThree.display();			
		assertEquals(0.0,complexNumberThree.getReal(),0.02);
	}
}
