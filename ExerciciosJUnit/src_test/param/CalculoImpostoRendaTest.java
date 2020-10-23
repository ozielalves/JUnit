/**
 * 
 */
package param;

import static org.junit.Assert.*;

//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Oziel Alves
 * 
 * Classe de testes desenvolvida após partição em classes de equivalência e
 * análise do valor limite.
 * 
 */

@RunWith(Parameterized.class)
public class CalculoImpostoRendaTest {
	
	private double entrada;
	private double esperado;
	
	public CalculoImpostoRendaTest (double in, double esp) {
		entrada = in;
		esperado = esp;
	}
	
	@Parameters(name = "{index}: CalcImposto[{0}]={1}")
	public static Object[][] data() {
		return new Object [][] {
			{ 1, 0. },
			{ 2, 0. },
			{ 0, 0. }, 
			{ -1, 0. },
			{ 1199, 0. }, 
			{ 1200, 0. },
			{ 1201, 1201*0.1 },
			{ 1202, 1202*0.1 },
			{ 4999, 4999*0.1 },
			{ 5000, 5000*0.1 },
			{ 5001, 5001*0.15 },
			{ 5002, 5000*0.15 },
			{ 9999, 9999*0.15 },
			{ 10000, 10000*0.15 },
			{ 10001, 10001*0.2 }
		};
	}
	
	@Test
	public void test() {
		assertEquals(esperado, CalculoImpostoRenda.calculaImposto(entrada), 0.00001);
	}

}
