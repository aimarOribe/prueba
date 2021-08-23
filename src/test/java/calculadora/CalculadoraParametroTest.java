package calculadora;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;
import org.junit.BeforeClass;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;

@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {
	
	
	private int a, b, esperado;
	
	public CalculadoraParametroTest(int a, int b, int esperado) {
		this.a = a;
		this.b = b;
		this.esperado = esperado;
	}
	
	@Test
	public void testAdd() {
		calculator cal = new calculator();
		int resultado = cal.add( a, b);
		Assert.assertEquals(esperado, resultado);
		
	}

}
