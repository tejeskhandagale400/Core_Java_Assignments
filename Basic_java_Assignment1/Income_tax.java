import java.util.*;

class IncomeTax
{	
	public static void main(String[] args)
	{	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Annual Income:");
		int income=input.nextInt();
		double tax=tax(income);
		System.out.println("Income tax="+tax);
	
	}
	static double tax(int annualIncome)
	{
		if(0<=annualIncome && annualIncome<=180000)
		{
			return 0;
		}
	
		if(181001<=annualIncome && annualIncome<=300000)
		{
			double tax=annualIncome*0.1;
			return tax;
		}

		if(300001<=annualIncome && annualIncome<=500000)
		{
			double tax=annualIncome*0.2;
			return tax;
		}

		if(500001<=annualIncome && annualIncome<=1000000)
		{
			double tax=annualIncome*0.3;
			return tax;
		}
		return 0;

	
	}



}