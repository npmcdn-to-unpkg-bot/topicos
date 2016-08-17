package banco;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		short opcaoMenu = -1;
		Scanner dadoEscolhido = new Scanner(System.in);
		do {
			System.out.print(" ---Banco Ficticio---\n"
					         + "| 1 - Criar Conta    |"
					         + "\n| 2 - Ver saldo      |"
					         + "\n| 3 - Depositar      |"
					         + "\n| 4 - Sacar          |"
					         + "\n ---------------------"
					         + "\nInsira a opção: ");
			opcaoMenu = dadoEscolhido.nextShort();
			switch (opcaoMenu) {
			case 1:
				
				break;

			default:
				break;
			}
		} while (opcaoMenu != 0);
	}
	
}
