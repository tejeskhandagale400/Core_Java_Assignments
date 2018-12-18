import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateCharacter 
{

	public String removeDuplicateCharacters(String word)
	{
			
		

		

		char[] wordArray = word.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char character : wordArray) {
		    charSet.add(character);
		}

		StringBuilder stringBuilderObject = new StringBuilder();
		for (Character character : charSet) {
			stringBuilderObject.append(character);
		}
		System.out.println(stringBuilderObject.toString());
		
		
		
		
		return stringBuilderObject.toString();
	}
	
	
	
	
	
	
	
	
	

}
