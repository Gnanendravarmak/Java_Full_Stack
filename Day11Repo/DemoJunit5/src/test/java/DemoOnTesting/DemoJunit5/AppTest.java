package DemoOnTesting.DemoJunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	Assertions.assertTrue(true);
    }
	
	
	@Test
	public void getName() {
		Assertions.assertEquals("varma", new App().printName());
	}
}
