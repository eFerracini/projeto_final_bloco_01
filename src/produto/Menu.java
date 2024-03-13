package produto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import produto.util.Cores;

public class Menu {
	
		public static Scanner leia = new Scanner(System.in);


		public static void main(String[] args) {

			int opcao, numero, agencia, tipo, aniversario, numeroDestino;
			String titular;
			float saldo, limite, valor;
			

			while (true) {

				System.out.println(Cores.TEXT_CYAN_BRIGHT+ Cores.ANSI_BLACK_BACKGROUND
						+ "*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                CADASTRO DE PRODUTOS                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Criar Produto                        ");
				System.out.println("            2 - Listar todos os produtos             ");
				System.out.println("            3 - Atualizar Dados dos produtos         ");
				System.out.println("            5 - Apagar Produto                       ");
				System.out.println("            6 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     " + Cores.TEXT_RESET);

				try {
					opcao = leia.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("\nDigite valores inteiros!");
					leia.nextLine();
					opcao = 0;
				}

				if (opcao == 6) {
					System.out.println("\nBanco de dados dos produtos perfeitamente em dia!");
					sobre();
					leia.close();
					System.exit(0);
				}

				switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Produto\n");

					keyPress();
					break;
				case 2:
					System.out.println("\n Listar todos os Produto");

					keyPress();
					break;

				case 3:
					System.out.println("\n Atualizar dados do Produto");

					
					keyPress();
					break;
				case 4:
					System.out.println("\n Apagar Produto");

					keyPress();
					break;

				default:
					System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);

					keyPress();
					break;
				}
			}

		}

		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Eduardo Ferracini");
			System.out.println("github.com/eFerracini/projeto_final_bloco_01");
			System.out.println("*********************************************************");
		}

		public static void keyPress() {

			try {

				System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
				System.in.read();

			} catch (IOException e) {

				System.out.println("Você pressionou uma tecla diferente de enter!");

			}
		}
	}
