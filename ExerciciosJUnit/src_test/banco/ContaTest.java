package banco;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Oziel Alves
 * 
 */

public class ContaTest {

	// Teste de sucesso para o método debitar
	@Test
	public void testDebitarSucesso() throws OperacaoIlegalException{
		Conta c = new Conta("123", 20);
		c.debitar(10);
		assertEquals(10,c.getSaldo(),0.0);
	}
	
	// Teste de insucesso para o método debitar
	@Test
	public void testDebitarNegativo() throws OperacaoIlegalException{
		Conta c = new Conta("1234", 20);

		try {
			c.debitar(-10);
			fail ("ERRO - O valor negativo foi debitado!");

		} catch( OperacaoIlegalException ex ) {
			assertEquals(20,c.getSaldo(),0.0);
			System.out.println("PASS - O valor negativo não foi debitado!");
		  }	
	}
	
	// Teste de insucesso para o método debitar
	@Test
	public void testDebitarAlem() throws OperacaoIlegalException{
		Conta c = new Conta("12345", 20);
		
		try {
			c.debitar(30);
			fail ("ERRO - Não deve ser possível debitar além do saldo!");
		} catch( OperacaoIlegalException ex ) {
			assertEquals(20,c.getSaldo(),0.0);
			System.out.println("PASS - Valor acima do Saldo não foi debitado!");
		  }	
	}

	// Teste para o método creditar - Valor válido
	@Test
	public void testCreditarSucesso() throws OperacaoIlegalException{
		Conta c = new Conta("12346", 0);
		c.creditar(100);
		assertEquals(100,c.getSaldo(),0.0);
	}
	
	// Teste para o método creditar - Valor inválido
	@Test
	public void testCreditarNegativo() throws OperacaoIlegalException{
		Conta c = new Conta("123567", 20);

		try {
			c.creditar(-10);
			fail ("ERRO - O valor negativo foi creditado!");

		} catch( OperacaoIlegalException ex ) {
			assertEquals(20,c.getSaldo(),0.0);
			System.out.println("PASS - O valor negativo não foi creditado!");
		  }	
	}
	
	// Teste para o método transferir - Valor válido
	@Test
	public void testTransferirSucesso() throws OperacaoIlegalException{
		Conta c = new Conta("12345678", 20);
		Conta c2 = new Conta("1230", 0);
		c.transferir(c2, 10);
		assertEquals(10,c.getSaldo(),0.0);
		assertEquals(10,c.getSaldo(),0.0);
		
	}
	
	// Teste para o método transferir - Valor inválido
	@Test
	public void testTransferirNegativo() throws OperacaoIlegalException{
		Conta c = new Conta("123456789", 20);
		Conta c2 = new Conta("1231", 0);

		try {
			c.transferir(c2, -10);
			fail ("ERRO - O valor negativo foi transferido!");

		} catch( OperacaoIlegalException ex ) {
			assertEquals(20,c.getSaldo(),0.0);
			assertEquals(0,c2.getSaldo(),0.0);
			System.out.println("PASS - O valor negativo não foi transferido!");
		  }	
	}
	
	// Teste para o método transferir - Valor inválido
	@Test
	public void testTransferirAlem() throws OperacaoIlegalException{
		Conta c = new Conta("12345678910", 20);
		Conta c2 = new Conta("1232", 0);
		try {
			c.transferir(c, 30);
			fail ("ERRO - Não deve ser possível debitar além do saldo!");
		} catch( OperacaoIlegalException ex ) {
			assertEquals(20,c.getSaldo(),0.0);
			assertEquals(0,c2.getSaldo(),0.0);
			System.out.println("PASS - Valor acima do Saldo não foi debitado!");
		  }	
	}
	
	// Teste de insucesso para o método transferir
	@Test
	public void testTransferirSelf() throws OperacaoIlegalException{
		Conta c = new Conta("12345678910", 20);
		try {
			c.transferir(c, 20);
			fail ("ERRO - Não deve ser possível transferir para mesma conta de origem!");
		} catch( OperacaoIlegalException ex ) {
			assertEquals(20,c.getSaldo(),0.0);
			System.out.println("PASS - Não foi possível transferir para sí mesmo");
		  }	
	}
}
