/**
 * 
 */
package param;

import static org.junit.Assert.*;

//import java.lang.reflect.Array;

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
	
	//Construtor
	public CalculoImpostoRendaTest (double in, double esp) {
		entrada = in;
		esperado = esp;
	}
	
	@Parameters(name = "{index}: CalcImposto[{0}]={1}")
	public static Object[][] data() {
		return new Object [][] {
			{ 200, 40 },
			{ 900, 180 },
			{ 1200, 240 }, //1
			{ 1201, 120,1 },
			{ 3040, 304 },
			{ 4999, 499,9 }, 
			{ 5000, 500 }, //2
			{ 5001, 750,15 },
			{ 9074, 1481,1 },
			{ 10001, 1500,15 }, //3
			};
	}
	
//	@Parameter(0)
	//	public int entrada;
//	@Parameter(1)
//	public int esperado;
//	
//	@Parameters
//	public static Iterable<Object[]> data(){
//		return Array.asList( new Object[][] {
//			{0,0},{1,2},{3,4},{5,6},{7,8}
//		});
//	}
	@Test
	public void test() {
		assertEquals(esperado, CalculoImpostoRenda.calculaImposto(entrada));
	}

}
