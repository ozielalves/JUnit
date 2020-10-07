package param.temperature;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Oziel Alves
 * 
 */

@RunWith(Parameterized.class)
public class ConversorTempTest {
	
	private Temperatura tc;
	private Temperatura tf;
	private double entradaC;
	private double esperadoF;
	
	public ConversorTempTest (double inC, double espF){
		entradaC = inC;
		esperadoF = espF;
	}
	
	@Parameters(name = "{index}: Celcius[{0}] = Farenheit [{1}]")
	public static Object[][] data() {
		return new Object [][] {
			{ 0, 32},
			{ 10, 50},
			{ 25, 77},
			{ 30, 86},
			{ 38, 100.4},
			{ 40, 104},
			{ 51, 123.8},
			{ -10, 14},
			{ -15, 5},
		};
	}
	
	@Before
	public void inicialize() {
		tf = new Fahrenheit();
		tc = new Celsius();
	}
	
	@Test
	public void ConverteCelsius() throws TempException {
		tc.setValue(entradaC);
		Temperatura f = ConversorTemperatura.converte(tc);
		assertTrue(f.getValue() == esperadoF);
	}
	
	@Test
	public void ConverteFarenheit() throws TempException {
		tf.setValue(esperadoF);
		Temperatura c = ConversorTemperatura.converte(tf);
		assertTrue(c.getValue() == entradaC);
	}
	
}

