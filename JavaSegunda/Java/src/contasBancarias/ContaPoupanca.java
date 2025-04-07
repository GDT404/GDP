package contasBancarias;

public class ContaPoupanca extends Conta {
	String dataAniversario;
	int saque, deposito;
	
	void saqueConta(double valor) {
		if((saldo - valor) < 0) {
			System.out.println("Erro: saldo abaixo de 0.00");
		}else {
			saldo = saldo - valor;
		}
	}
}
