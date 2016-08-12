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
		if(!saldo.isNaN()) return saldo;
			
		return 0.0;
	}
	
	public void depositar(Double valorDeposito){
		saldo += valorDeposito;
	}
	
	public boolean sacar(Double valorSaque, Double desconto){
		Double diferenca = desconto.isNaN() ? sacarSemDesconto(valorSaque) : sacarComDesconto(valorSaque, desconto);
		
		if (diferenca < 0) return false; 
		
		saldo -= diferenca;
		return true;
	}
	
	private Double sacarSemDesconto(Double valorSaque){
		return saldo - valorSaque;
	}
	
	private Double sacarComDesconto(Double valorSaque, Double desconto){
		return saldo - valorSaque + (valorSaque * desconto);
	}
	
	
}