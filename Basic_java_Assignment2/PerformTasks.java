import java.util.Arrays;


public class PerformTasks {

	public String tasksOnSentence(String inputSentence, String wordToDelete, int positionOfWord) 
	{
  
		 inputSentence = inputSentence.replaceAll("( )+"," ");
		System.out.println(inputSentence);
		String s="Good";
		
		inputSentence = inputSentence.replaceAll(s,"");
		
		System.out.println(inputSentence);

		String [] inputArray =inputSentence.split(" ");
		String [] temporaryArray = new String[inputArray.length];
		
		temporaryArray=inputArray;
		
		System.out.println(temporaryArray[positionOfWord+1]);
		String temp  =	inputArray[(positionOfWord+1)];
		
		
		temp= temp.replaceAll(wordToDelete,"");
				
		inputArray[(positionOfWord+1)]=temp;
		System.out.println(Arrays.toString(inputArray));
		System.out.println(Arrays.toString(temporaryArray));
		return null;
	}

}
