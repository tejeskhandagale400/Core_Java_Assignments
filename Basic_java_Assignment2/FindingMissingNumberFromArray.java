import java.util.Arrays;


public class FindingMissingNumberFromArray {

	public int findMissingNumber(int[] inputArray) {

		for(int counterOut=0 ; counterOut<(inputArray.length-1) ; counterOut++)
		{
			for(int counterInner=1 ; counterInner<(inputArray.length-counterOut) ; counterInner++)
			{
				if(inputArray[counterInner-1]>inputArray[counterInner])
				{
					int temp=inputArray[ counterInner-1 ];
					inputArray[counterInner-1] = inputArray[counterInner];
					inputArray[counterInner] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(inputArray));
		int element = inputArray[0];
		for(int counterSecond=0;counterSecond<inputArray.length-1;counterSecond++)
		{
			if(inputArray[counterSecond]!=element)
			{
				return element;
			}
			element++;
		}
		
		return 0;
	}

}
