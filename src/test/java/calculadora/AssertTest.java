package calculadora;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class AssertTest {
	
	@Test
	public void test() {
		String s1 = "Hola";
		String s2 = "Hola";
		Date date1 = new Date();
		Date date2 = new Date();
		Assert.assertEquals(date1, date2);
	}

}
