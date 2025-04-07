package contasBancarias;

import java.util.Scanner;

public class DigitaContaCP {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaPoupanca cp = new ContaPoupanca();
		
		int cont = 1, opcoes;
		
		while(cont != 0) {
			System.out.println("\n Você deseja: \n 1 - sacar "
					+ "\n 2 - depositar \n 0 - sair");
			opcoes = leia.nextInt();
			
			if(opcoes == 0) {
				cont = 0;
			}else if(opcoes == 1) {
				System.out.println("Quanto deseja sacar: ");
				cp.saque = leia.nextInt();
				cp.saqueConta(cp.saque);
				System.out.println("\n Saldo atual "+ cp.saldo);
			}else if(opcoes == 2) {
				System.out.println("Quanto deseja depositar: ");
				cp.deposito = leia.nextInt();
				cp.depositaConta(cp.deposito);
				System.out.println("Saldo atual "+ cp.saldo);
			}else if(opcoes > 2) {
				cont = 1;
			}
		}
		
	}

}
