package conta;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimeExtrato() {
		System.out.println("Seu saldo � de: " + getSaldo() + "R$");
	}
}
