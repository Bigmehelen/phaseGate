import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOccurrence{

	@Test
	public void testThatOccurrenceExist(){
		String word = "Hello world";
		char ch = 'o';
		Occurrence.character(word,ch);
	}

	@Test
	public void testThatOccurrenceCanCountNumberOfCharacter(){
		String word = "Hello world";
		char ch = 'o';
		int expected = 2;
		int returned = Occurrence.character(word,ch);
		assertEquals(expected, returned);
	}

}