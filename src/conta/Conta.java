package conta;

public abstract class Conta {
	
	public double saldo;
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void imprimeExtrato();
	
}
