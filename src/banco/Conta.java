package banco;

public class Conta {
	private Integer codigo;
	private String cliente;
	private Double saldo;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public Double getSaldo() {
		if(saldo == null) return 0.0;
			
		return saldo;
	}
	
	public void depositar(Double valorDeposito){
		saldo = getSaldo() + valorDeposito;
	}
	
	public boolean sacar(Double valorSaque){
		Double diferenca = getSaldo() - valorSaque;
		
		if (diferenca < 0) return false; 
		
		saldo -= diferenca;
		return true;
	}
	
	private Double sacarSemDesconto(Double valorSaque){
		return saldo - valorSaque;
	}
	
}