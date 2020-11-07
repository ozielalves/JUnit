package param;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Oziel Alves
 * 
 * Classe de testes desenvolvida após partição em classes de equivalência
 * 
 */

public class calculaImpostoTest {
	
	// Teste para a Classe válida baseada em Interface
	@Test
	public void testCVI() {
		assertEquals(20*0.0, CalculoImpostoRenda.calculaImposto(20), 0.00001);
	}
	
	// Teste para a Classe inválida baseada em Interface
	@Test
	public void testCII() {
		assertEquals(-20*0.0, CalculoImpostoRenda.calculaImposto(-20), 0.00001);
	}
	
	// Testes para a Classe válida baseada em Funcionalidade
	@Test
	public void testCVF1() {
		assertEquals(1300*0.1, CalculoImpostoRenda.calculaImposto(1300), 0.00001);
	}
	
	@Test
	public void testCVF2() {
		assertEquals(6000*0.15, CalculoImpostoRenda.calculaImposto(6000), 0.00001);
	}
	
	@Test
	public void testCVF3() {
		assertEquals(10001*0.2, CalculoImpostoRenda.calculaImposto(10001), 0.00001);
	}
	
	@Test
	public void testCVF4() {
		assertEquals(1200*0.0, CalculoImpostoRenda.calculaImposto(1200), 0.00001);
	}
	
	
	// Teste para a Classe inválida baseada em Funcionalidade
	@Test
	public void testCIF() {
		assertEquals(0.0, CalculoImpostoRenda.calculaImposto(0), 0.00001);
	}
}
