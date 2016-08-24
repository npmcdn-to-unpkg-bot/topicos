package banco;

public class ContaPoupanca extends Conta {
	public boolean sacar(Double valorSaque){
		return super.sacar(valorSaque, null);
	}
}
