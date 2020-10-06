package banco;


public class Conta{

	private String codigo;
	private double saldo = 0;

	public Conta (String p_id, double p_saldo) { 
		this.saldo = p_saldo;
	    this.codigo = p_id;
	}
	
	public double getSaldo() {
		return saldo;
	} 

	public double debitar (double valor) throws OperacaoIlegalException {
		
		// Foi acrescentada o caso em que é debitado um valor maior que o saldo
		if( valor > 0 && valor < this.saldo){
	         saldo = saldo-valor; 
		}else{
			throw new OperacaoIlegalException();
		}
	   return saldo;

	}


	public double creditar (double valor) throws OperacaoIlegalException {
		
		
		if(valor > 0 ){
	         saldo = saldo+valor; 
	    }
		else{
			throw new OperacaoIlegalException();
		}
	   return saldo;

	}
	
	/* Este metodo transfere o valor da conta origem para a conta destino. Se o 
	 * valor for negativo ou superior que o saldo da conta origem uma 
	 * OperacaoIlegalException Ã© lanÃ§ada*/
	
	
	// Foi acrescentada a checagem de conta para impedir que seja transferir para sí mesmo
	// Foi acrescentada a checagem de valor para impedir transferencias de valores acima do saldo
	// Foi acrescentada a checagem de valor apra impedir transferencias de valores negativos
	// Foi acrescentado o crédito a conta favorecida pela transferencia
	 public void transferir (Conta destino, double valor) throws OperacaoIlegalException {
		 if(valor > 0 && valor < this.saldo){
			 if( destino.codigo != this.codigo) {
			 
			 this.debitar(valor);
			 destino.creditar(valor);
			 }else {
				 throw new OperacaoIlegalException();
			 }
		 }else {
			 throw new OperacaoIlegalException();
		 }	 
	}
}

