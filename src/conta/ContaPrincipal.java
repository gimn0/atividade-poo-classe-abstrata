package conta;

public class ContaPrincipal {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		
		cp.setSaldo(13999.69);
		cp.imprimeExtrato();
	}

}
