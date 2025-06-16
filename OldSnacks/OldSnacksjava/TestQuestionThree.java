import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQuestionThree{

	@Test
	public void testThatQuestionThreeExist(){
		int[] number = {1};
		QuestionThree.uniqueNumbers(number);

	}
	
	@Test
	public void testThatQuestionThreeCanReturnUniqueNumber(){
		int[] number = {1,2,3,2,5};
		int expected = 9;
		int returned = QuestionThree.uniqueNumbers(number);
		assertEquals(expected, returned);

		
	}


}
