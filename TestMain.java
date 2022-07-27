import org.junit.jupiter.api.Test;
import example.docker.demo;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain 
{
	@Test
	public void testInputIsEven()
	{
		assertTrue(demo.checkIfInputIsAnEvenNumber(23)); 
		//Assertion
	}
}
