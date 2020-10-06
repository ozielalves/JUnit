package basico;


import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Exercicio - Introducao ao JUnit
 * 
 * Descomentar o teste, ver o teste falar e fazer 
 * a mudança necessaria para o teste passar.
 * 
 */

public class JUnitBasicoTest {

	@Test
	public void testAssertTrue() {
		assertTrue(true);
	}
	
	
	@Test
	public void testAssertFalse() {
	assertFalse(false);
	}

	/*
	 * O JUnit informa o resultado esperado e o obtido.
	 */
	
	@Test
	public void testAssertEqualInts() {
		assertEquals(1, 1);
	}	
	
	
	@Test
	public void testCheckingIntCalculation() {
		int value = 4;
		int doubled = value * 3;
		assertEquals(12, doubled);
	}	
	
	
	@Test
	public void testAssertExactlyEqualDoubles() {
		double value = 12.0;
		double result = value / 2;
		double delta = 0.0;
		assertEquals(6.0, result, delta);
	}
	
	
	/*
	 * Quando numeros flutuantes sao comparados previsamos 
	 * definit o delta de diferenca nas casas decimais
	 * que podem acontecer.
	 * 
	 */
	
	@Test
	public void testAssertAlmostEqualDoubles() {
		double numerator = 10.0;
		double denominator = 3.0;
		double delta = 0.001;
		double expected = 3.333;
		double quotient = numerator/denominator;
		
		assertEquals(expected, quotient, delta);
	}
	
	/*
	 * Strings can be compared too. Make this test pass by fixing
	 * whatToSay.  Before you fix it, note how JUnit indicates where the
	 * expected and actual strings differ
	 */
	
	@Test
	public void testCompareStrings() {
		String greeting = "Hello";
		String greetee = " World";
		
		String whatToSay = greeting + greetee;
		
		assertEquals("Hello World", whatToSay);
	}
	
	@Test
	public void testCompareStrings2() {
		int[] array1 = {1,2,3,4};
		int[] array2 = {1,2,3,4};
		assertArrayEquals(array1, array2);
	}
	
		
}
