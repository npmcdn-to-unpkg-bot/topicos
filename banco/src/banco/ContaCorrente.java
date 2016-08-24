package banco;

public class ContaCorrente extends Conta{
	
	private static final Double DESCONTO = 0.10;
	
	public boolean sacar(Double valorSaque) {
		return super.sacar(valorSaque*DESCONTO);
	}

	
}
