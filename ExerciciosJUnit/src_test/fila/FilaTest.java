/**
 * 
 */
package fila;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Oziel Alves
 * 
 */

public class FilaTest {
	
	@Test
	public void testIsEstaVazia() {
		Fila f = new Fila();
		assertTrue(f.estaVazia());
	}
	
	@Test
	public void testInsereNaFila(){
		Fila f = new Fila();
		f.insereNaFila(2);
		assertFalse(f.estaVazia());
	}
	
	@Test
	public void testRemoveDaFila() {
		Fila f = new Fila();
		f.insereNaFila(2);
		f.insereNaFila(5);
		f.removeDaFila();
		assertEquals(5,f.getFim(),0.0);
	}
	
	@Test (expected=FilaCheiaException.class)
	public void testLimiteInsert() {
		Fila f = new Fila();
		f.insereNaFila(2);
		f.insereNaFila(3);
		f.insereNaFila(4);
		f.insereNaFila(5);
		f.insereNaFila(6);
		f.insereNaFila(7);
	}
	
	@Test
	public void testEstaCheia() {
		Fila f = new Fila();
		f.insereNaFila(2);
		f.insereNaFila(3);
		f.insereNaFila(4);
		f.insereNaFila(5);
		f.insereNaFila(6);
		assertTrue(f.estaCheia());
	}
	
	@Test 
	public void testGetTam() {
		Fila f = new Fila();
		f.insereNaFila(2);
		f.insereNaFila(3);
		f.insereNaFila(4);
		f.insereNaFila(5);
		assertEquals(4,f.getTam(),0.0);
	}
	
	@Test
	public void testLimpaFila() {
		Fila f = new Fila();
		f.insereNaFila(2);
		f.insereNaFila(3);
		f.insereNaFila(4);
		f.insereNaFila(5);
		f.insereNaFila(6);
		f.limpaFila();
		assertTrue(f.estaVazia());
	}
	
	@Test
	public void testSetFim() {
		Fila f = new Fila();
		f.insereNaFila(2);
		f.insereNaFila(3);
		f.setFim(2);
		assertEquals(2,f.getFim(),0.0);
	}
	
	@Test
	public void testGetCapacidade() {
		Fila f = new Fila();
		assertEquals(5, f.getCapacidade(), 0.0);
	}

}
