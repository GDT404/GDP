package contasBancarias;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Conta {
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	Date data = new Date(System.currentTimeMillis());
	int numeroConta;
	int numeroCliente;
	double saldo;
	String dataAbertura = sdf1.format(data);
	
	void saqueConta(double valor) {
		saldo = saldo - valor;
	}
	
	void depositaConta(double valor) {
		saldo = saldo + valor;
	}
	
	Conta(){
		saldo = 100.00;
	}
}
