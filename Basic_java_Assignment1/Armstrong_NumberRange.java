class ArmstrongNumberRange
 {
	

	 public static void main(String[] args)
	{
		armstrong();
				
	}
	
	
	static void armstrong()
	{	
		int number=100;
		for(int count=100;count<=999;count++)
		{
			int digit1=number%10;
			int digit2= number/10;
			digit2=digit2%10;
			int digit3=number/100;
	

			int operation=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
	
			if(operation==number)
			{
				System.out.println(number);
			}
			
				number++;
		}

	}

	
	
}