
public class CheckNameOccureOrNot {

	public int checkName(String[] inputArray, String inputToCheck)
	{
		int counter=0;
		for(int outerCounter=0 ; outerCounter<(inputArray.length-1) ; outerCounter++)
		{
			if(inputToCheck.compareTo( inputArray[outerCounter]) == 0)
			{
				counter++;
			}
		}
		System.out.println("Count Of occurance Of name is = " +counter);
		return counter;
	}

}
