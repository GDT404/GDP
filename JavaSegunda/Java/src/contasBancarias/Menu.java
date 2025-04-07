package contasBancarias;

import java.util.Scanner;

public class Menu extends Conta{

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		int cont = 1, opcoes;
		
		System.out.println("Digite o numero da conta: ");
		cc.numeroConta = leia.nextInt();
		System.out.println("Digite o numero do Cliente: ");
		cc.numeroCliente = leia.nextInt();
		
		while(cont != 0) {
			System.out.println("Menu opções: \n 1 - Conta Corrente"
					+ "\n 2 - Conta Poupança \n 0 - Sair");
			opcoes = leia.nextInt();
			
			if(opcoes == 0) {
				cont = 0;
			}else if(opcoes == 1) {
				DigitaContaCC.main(args);
			}else if(opcoes == 2) {
				DigitaContaCP.main(args);
			}
			}
		System.out.println("Resumo da operação: "
				+ "\n Numero da Conta: "+cc.numeroConta 
				+ "\n Numero do Cliente: "+cc.numeroCliente
				+ "\n Saldo na Conta Corrente: "+cc.saldo
				+ "\n Saldo na Conta Poupança: "+cp.saldo
				+ "\n Data de Abertura: "+cc.dataAbertura);

	}

}
