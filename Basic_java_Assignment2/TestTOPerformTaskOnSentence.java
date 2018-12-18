import static org.junit.Assert.*;

import org.junit.Test;


public class TestTOPerformTaskOnSentence {

	@Test
	public void test() {

		PerformTasks sentence = new PerformTasks();
		String inputSentence = "Hello      Tejas.   Good Evening.";
		String wordToDelete = "Good";
		int positionOfWord = 3;
		String outputSentence = sentence.tasksOnSentence(inputSentence,wordToDelete,positionOfWord);
	}

}
