package calculadora;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class calculadoraTest {
	
	static calculator cal;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		cal = new calculator();
	}
	
	@Before
	public void before() {
		System.out.println("before()");
		cal.clear();
	}
	
	@After
	public void After() {
		System.out.println("after()");
		cal.clear();
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("afterClass()");
	}
	
	@Test
	public void testSuma() {
		System.out.println("sum()");
		int resul = cal.add(3,2);
		int esperado = 5;
		Assert.assertEquals(esperado, resul);
	}
	
	@Test
	public void testAnsSuma() {
		System.out.println("ansSum()");
		cal.add(3,2);
		int resultado = cal.ans();
		int esperado = 5;
		Assert.assertEquals(esperado, resultado);
	}
	
	@Test
	public void testDividir() {
		System.out.println("div()");
		cal.dividir(5, 2);
	}
	
	@Test(expected = ArithmeticException.class)
	
	public void testDividirCero() {
		System.out.println("divCero()");
		cal.dividir(5, 0);
	}
	
	
}
