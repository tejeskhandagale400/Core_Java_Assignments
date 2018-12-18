import java.util.*;
class SequentialSort
{

	public static void main(String [] args)
	{
		int array[]  =new int[15];
		int temp=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter numbers for array");
		for(int count=0;count<15;count++)
		{
			array[count]=input.nextInt();
	
		}
		
		System.out.println("Array Before Sort ");
		for(int count=0;count<15;count++)
		{
			
			System.out.println(array[count]);		
			
	
		}
				
		
		
		System.out.println("Array Before Sort ");
		for(int count=0;count<15;count++)
		{
			
			System.out.println(array[count]);		
			
	
		}
		
		for(int i=0;i<15;i++)
		{	
			for(int j=1;j<(15-i);j++)
			{
				if(array[j-1]>array[j])
				{
				temp=array[j-1];
				array[j-1]=array[j];
				array[j]=temp;	
				}	
	
			}	
			
					
	
		}

		System.out.println("Array After Sort ");
		for(int count=0;count<15;count++)
		{
			
			System.out.println(array[count]);		
			
	
		}
		
		
		
		
	

	}
}