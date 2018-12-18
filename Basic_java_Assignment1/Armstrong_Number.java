import java.util.*;
class ArmstrongNumber {
	

	 public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number=input.nextInt();
		String output=armstrong(number);
		System.out.println(output);
		
		
	}
	
	
	static String armstrong(int number)
	{
	
		int digit1=number%10;
		int digit2= number/10;
		digit2=digit2%10;
		int digit3=number/100;
	

		int operation=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
	
		if(operation==number)
		{
			return "It is a Armstrong number";
		}
		else
		{
			return "It is not Armstrong number";
		}

	}

	
	
}