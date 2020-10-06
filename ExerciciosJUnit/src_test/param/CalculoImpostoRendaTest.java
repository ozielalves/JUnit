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
			{ 200, 0 },
			{ 900, 0 },
			{ 1200, 0 }, 
			{ 1201, 120.1 },
			{ 3040, 304 },
			{ 4999, 499.9 }, 
			{ 5000, 500 }, 
			{ 5001, 750.15 },
			{ 9074, 1481.1 },
			{ 10001, 2000.2 },
		};
	}
	
//	@Parameter(0)
//	public double entrada;
//	@Parameter(1)
//	public double esperado;
//	
//	@Parameters
//	public static Collection<Double[]> data(){
//		return Arrays.asList( new Double[][] {
//			{0,0},{1,2},{3,4},{5,6},{7,8}
//		});
//	}
	
	@Test
	public void test() {
		assertEquals(esperado, CalculoImpostoRenda.calculaImposto(entrada), 0.00001);
	}

}
