import static org.junit.Assert.*;

import org.junit.Test;


public class TestToRemoveDuplicateCharacter 
{

	@Test
	public void testToRemoveDuplicateCharacter()
	{
		RemoveDuplicateCharacter inputWord = new RemoveDuplicateCharacter();
		String word="Tejes";
		String actual = inputWord.removeDuplicateCharacters(word);
		assertEquals("Tejs",actual);
	}
	
	@Test
	public void testToNoDuplicateCharacter()
	{
		RemoveDuplicateCharacter inputWord = new RemoveDuplicateCharacter();
		String word="Last";
		String actual = inputWord.removeDuplicateCharacters(word);
		assertEquals("Last",actual);
	}

}
