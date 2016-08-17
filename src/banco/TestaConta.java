package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaConta {

	private Process exec;
	public static void main(String[] args) {
		String opcaoMenu;
		int codigoEscolhido;
		double valorEscolhido;
		Scanner dadoEscolhido = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<>();
		do {
			limpaTela();
			opcaoMenu = "";
			System.out.print(" ---Banco Ficticio---\n"
					         + "| 1 - Criar Conta    |"
					         + "\n| 2 - Ver saldo      |"
					         + "\n| 3 - Depositar      |"
					         + "\n| 4 - Sacar          |"
					         + "\n ---------------------"
					         + "\nInsira a opcao: ");
			opcaoMenu = dadoEscolhido.next();
			switch (opcaoMenu) {
			case "1":
				limpaTela();
				System.out.print("---Banco Ficticio---\n"
				         +       "| 1 - Corrente      |"
				         +     "\n| 2 - Poupanca      |"
				         +     "\n -------------------"
				         + "\nInsira a opcao: ");
				opcaoMenu = dadoEscolhido.next();
				if ((opcaoMenu.equals("1"))&&(opcaoMenu.equals("2"))) {
					mesagemTempo("Operacao Invalida");
				} else {
					Conta conta = null;
					if (opcaoMenu.equals("1")) {
						
						conta = new ContaCorrente();
						
					} else if (opcaoMenu.equals("1")) {
						conta = new ContaPoupanca();
					}
					limpaTela();
					conta.setCodigo(contas.size());
					System.out.print("Insira o nome do titular: ");
					conta.setCliente(dadoEscolhido.next());
					contas.add(conta);
					mesagemTempo("Conta cadastrado com sucesso");
				}
				
				break;
			case "2":
				limpaTela();
				System.out.print("Insira o codigo do cliente: ");
				codigoEscolhido = dadoEscolhido.nextInt();
				if ((codigoEscolhido < 0) && (codigoEscolhido >= contas.size())) {
					mesagemTempo("Cliente invalido");
					continue;
				}
				limpaTela();
				mesagemTempo("---Banco Ficticio---\n"
				         +       "| Nome: "+contas.get(codigoEscolhido).getCliente()+"   |"
				         +     "\n| Saldo: "+contas.get(codigoEscolhido).getSaldo()+"    |"
				         +     "\n -------------------");
				
				break;
			case "3":
				limpaTela();
				System.out.print("Insira o codigo do cliente: ");
				codigoEscolhido = dadoEscolhido.nextInt();
				if ((codigoEscolhido < 0) || (codigoEscolhido >= contas.size())) {
					mesagemTempo("Cliente invalido");
					continue;
				}
				limpaTela();
				System.out.print("Insira o valor a ser depositado: ");
				valorEscolhido = dadoEscolhido.nextInt();
				contas.get(codigoEscolhido).depositar(valorEscolhido);
				break;
			
			
			case "4":
				limpaTela();
				System.out.print("Insira o codigo do cliente: ");
				codigoEscolhido = dadoEscolhido.nextInt();
				if ((codigoEscolhido < 0) || (codigoEscolhido >= contas.size())) {
					mesagemTempo("Cliente invalido");
					continue;
				}
				limpaTela();
				System.out.print("Insira o valor a ser sacado: ");
				valorEscolhido = dadoEscolhido.nextInt();
				if (contas.get(codigoEscolhido).sacar(valorEscolhido)) {
					mesagemTempo("Retire as notas");
				} else {
					mesagemTempo("Operacao invalida: O saque é maior que o saldo.");
				}
				break;
			default:
				mesagemTempo("Operacao invalida!");
				break;
			}
		} while (!(opcaoMenu.equals("0")));
	}
	public static void limpaTela(){
		for (int i = 0; i < 50; ++i)
		    System.out.println ();
	    
	}
	public static void mesagemTempo(String mensagem){
	limpaTela();
	System.out.print(mensagem);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	}
}
