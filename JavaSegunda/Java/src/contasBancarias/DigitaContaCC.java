package contasBancarias;

import java.util.Scanner;

public class DigitaContaCC {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		
		int cont = 1, opcoes;
		
		while(cont != 0) {
			System.out.println("\n Você deseja: \n 1 - sacar "
					+ "\n 2 - depositar \n 0 - sair");
			opcoes = leia.nextInt();
			
			if(opcoes == 0) {
				cont = 0;
			}else if(opcoes == 1) {
				System.out.println("Quanto deseja sacar: ");
				cc.saque = leia.nextInt();
				cc.saqueConta(cc.saque);
				System.out.println("\n Saldo atual "+ cc.saldo);
			}else if(opcoes == 2) {
				System.out.println("Quanto deseja depositar: ");
				cc.deposito = leia.nextInt();
				cc.depositaConta(cc.deposito);
				System.out.println("Saldo atual "+ cc.saldo);
			}else if(opcoes > 2) {
				cont = 1;
			}
		}

	}

}
