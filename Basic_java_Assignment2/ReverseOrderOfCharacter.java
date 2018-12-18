import java.util.Arrays;


public class ReverseOrderOfCharacter {

	public String reverseOrder(String inputString)
	{			
		String reverseString="";
		String stringArray[] = inputString.split(" ");
		
		for(int counterOut=0;counterOut<stringArray.length;counterOut++)
		{
			char word[]= stringArray[counterOut].toCharArray();
			
			for(int counterin = (word.length)-1;counterin>=0;counterin--)
			{
				
				reverseString = reverseString +word[counterin];
			}
			
			if(counterOut != stringArray.length-1 )
			{
				reverseString +=" ";
			}
				
		}
		System.out.println(reverseString);
		return reverseString;
	}

}
