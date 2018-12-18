import java.util.*;
class LinearSearch
{

	public static void main(String [] args)
	{
		int array[]  =new int[15];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter numbers for array");
		for(int count=0;count<15;count++)
		{
			array[count]=input.nextInt();
	
		}
		
		System.out.println("Value to be search ");
		int search=input.nextInt();
		
		for(int count=0;count<15;count++)
		{
			if(search==array[count])
			{
				System.out.println("Number Exists in array");		
			}
	
		}
		
	

	}
}