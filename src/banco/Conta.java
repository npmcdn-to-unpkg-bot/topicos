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
		if(!saldo.isNaN()){
			return saldo;
		}
		return 0.0;
	}
	
	public void depositar(Double valorDeposito){
		this.saldo += valorDeposito;
	}
	
	public boolean sacar(Double valorSaque){
		if(this.diferencaSaque(valorSaque) >= 0){
			saldo -= valorSaque; 
			return true;
		}
		return false;
	}
	
	private Double diferencaSaque(Double valorSaque){
		return this.getSaldo() - valorSaque;
	}
}