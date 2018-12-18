
class SquareTable {
	
	public static void table(int number)
	{
		int count,temperory,square;

		for(count=1;count<=10;count++)
		{
			temperory=number*count;
			square=temperory*temperory;
			System.out.println(+number+ "*" +count+ " = " +temperory+ "---------" +square );
			
		}
			
		
	}
	
	public static void main(String[] args)
	{
	
	
	table(5);
	
		
	}
	
}


