import java.util.Arrays;


public class CheckPalindrom {

	public boolean checkPalindrom(String input) 
	{
		char [] convertedInput = input.toCharArray();
		//char [] newInput = input.toCharArray();
		int length=convertedInput.length;
		char newInput[] = new char [length];

		System.out.println(convertedInput);  
		for(int counterOne=0,counterTwo=(length-1);(counterOne<length) && (counterTwo>=0);counterOne++,counterTwo--)
		{
			newInput[counterOne]=convertedInput[counterTwo];

		}
		System.out.println(newInput);  
		boolean output=Arrays.equals(convertedInput, newInput);  
		System.out.println(output);  
		return output;
	}

	
}