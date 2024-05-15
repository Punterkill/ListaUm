public class ContaCorrente {
	private int numeroConta;
	private double saldo;
	
	public ContaCorrente(int novoNumeroConta, double novoSaldo) {
		this.numeroConta = novoNumeroConta;
		this.saldo = novoSaldo;
	}
	
	//get
	
	public double getSaldo() {
		return saldo;
	}

	//set
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	//sacar/depositar
	
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}
	
	public String mostrarConta() {
		return "Conta:" + this.numeroConta + "\nSaldo: R$ " + this.saldo;
	}
}
