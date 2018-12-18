import java.util.Arrays;


public class StringArrayPelindrom {

	public String[] checkPelindrom(String[] inputString) 
	{
		String temporaryString[]=new String[inputString.length];
		String pelindromString="";
		int countPelindrom=0;
		char [] converted =new char[100];


		for(int outerCounter=0,outerCounterForTemp=0;outerCounter<inputString.length;outerCounter++)
		{
			System.out.println("Entered Input: "+inputString[outerCounter]);
			System.out.print(" Swappeed Input: ");
			//System.out.println(inputString[outerCounter]);
			 converted= inputString[outerCounter].toCharArray();
			 char newInput[] = new char [converted.length];
			 for(int counterOne=0,counterTwo=(converted.length-1);(counterOne<converted.length) && (counterTwo>=0);counterOne++,counterTwo--)
				{
					newInput[counterOne]=converted[counterTwo];
					System.out.print(newInput[counterOne]);
					
				}
			 if(Arrays.equals(newInput, converted))
			 {
				 System.out.println();
				 System.out.println("true");
				 for(int counterStore=0;counterStore<converted.length;counterStore++)
				 temporaryString[outerCounterForTemp]=inputString[outerCounter];
				 
				 pelindromString+=temporaryString[outerCounterForTemp]+" ";
				 countPelindrom++;
				 System.out.println("length OF ' " +temporaryString[outerCounterForTemp]+ "' is " +temporaryString[outerCounterForTemp].length());
				 System.out.println( );
				 outerCounterForTemp++;
			 }
			 System.out.println( );
			
		}
		
		String pelindromArray[] = pelindromString.split(" ");
		
		
		System.out.println("Pelindroms");
		System.out.println(Arrays.toString(pelindromArray));
		stringArraySort(pelindromArray); //To sort The pelindrom Array
		return pelindromArray;

	}
	
	public String[] stringArraySort(String [] stringArray)
	{
		
		int lengthOfString = stringArray.length;

		for(int counterOne=0; counterOne<=(lengthOfString-1); counterOne++)
		{
			for(int counterTwo=counterOne+1;counterTwo<=stringArray.length-1;counterTwo++)
			{
				if(stringArray[counterOne].compareTo(stringArray[counterTwo])<0)
				{
					String temp = stringArray[counterOne];
					stringArray[counterOne]=stringArray[counterTwo];
					stringArray[counterTwo]=temp;

				}
				
			}
			
			
		}
		System.out.println("Sorted Pelindroms");
		System.out.println(Arrays.toString(stringArray));
		
		return stringArray;
	}
}
