class Hello
{
		public static void main(String[] args)
		{	
			display();
			System.out.println("Hello World");
			display();
			int summation = addition(20,10);
			System.out.println("Addition is "+summation );
			int subtraction = subtraction(20,10);
			System.out.println("Subtraction is "+subtraction);
			int multification = multiply(20,10);
			System.out.println("Multification is "+multification);
			double division = division(22,10);
			System.out.println("Division is "+division);
			
		}

		static void display()
		{
			System.out.println("I am in display");
		} 

		static int addition(int numberOne,int numberTwo)
		{
			
			int summation = numberOne + numberTwo;
			return summation;
		
		}
		
		static int subtraction(int numberOne,int numberTwo)
		{	
			
			int subtraction = numberOne-numberTwo;
			return subtraction;
		
		}

		static int multiply(int numberOne,int numberTwo)
		{	
			
			int multification = numberOne*numberTwo;
			return multification;
		
		}

		static double division(double numberOne,double numberTwo)
		{	
			
			double division =numberOne/numberTwo;
			return division;
		
		}
			

}