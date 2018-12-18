/*Write the definition for a class called Complex that has floating point properties for storing real and imaginary parts. The class has the following behaviours/services/methods:
void set(float, float) to set the specified value in object
void disp() to display complex number object */




package Complex;

public class Complex
{
	  private float real,imaginary;
	
	public void setValues(float real, float imaginary)  //it sets values of real and imaginary in number
	{
		this.real = real;
		this.imaginary = imaginary;
		
		
	}
	public void display()
	{
		System.out.println("Complex Number  = " +real+ " + (" +imaginary+ "i"); //It displays the Given Complex number
	

	}
	public Complex sumation(Complex numberOne,Complex  numberTwo) 
	{

		Complex complex = new Complex();
		complex.real = numberOne.real + numberTwo.real;
		complex.imaginary = numberOne.imaginary + numberTwo.imaginary;    //It adds two complex numbers		
		return complex;
	}
	
	public float getReal()
	{
		return real;
	}
	
	public void setReal(float real) 
	{
		this.real = real;
	}
	
	public float getImaginary() 
	{
		return imaginary;
	}
	
	public void setImaginary(float imaginary)
	{
		this.imaginary = imaginary;
	}

}
