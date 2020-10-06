/**
 * 
 */
package param;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Oziel Alves
 * @description CalculoImpostoRenda test
 */
@RunWith(Parameterized.class)
public class CalculoImpostoRendaTest {

	@Parameter(0)
	public int entrada;
	@Parameter(1)
	public int esperado;
	
	@Parameters
	public static Iterable<Object[]> data(){
		return Array.asList( new Object[][] {
			{0,0},{},{},{},{}
		});
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
