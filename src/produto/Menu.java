package produto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import produto.controller.ProdutoController;
import produto.model.Camiseta;
import produto.model.Sapato;
import produto.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	static ProdutoController produtos = new ProdutoController();

	public static void main(String[] args) {

		int numero, tipo, tamanhoSapato;
		String nome, cor, tamanhoCamiseta;
		float preco;

		Sapato s1 = new Sapato(produtos.gerarNumero(), 34, 2, "Nike", "Preto", 250.0f);
		produtos.cadastrar(s1);

		Camiseta c1 = new Camiseta(produtos.gerarNumero(), "G", 1, "Gucci", "Azul bebe", 450.0f);
		produtos.cadastrar(c1);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                CADASTRO DE PRODUTOS                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por Número            ");
			System.out.println("            4 - Editar  produto                      ");
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

				System.out.println("Digite o tipo do Produto (1-Camiseta ou 2-Sapato): ");
				tipo = leia.nextInt();
				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Digite a Cor do Produto: ");
				cor = leia.next();
				System.out.println("Digite o preço do Produto: ");
				preco = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Tamando da Camiseta: ");
					tamanhoCamiseta = leia.next();
					produtos.cadastrar(new Camiseta(produtos.gerarNumero(), tamanhoCamiseta, tipo, nome, cor, preco));

				}
				case 2 -> {
					System.out.println("Digite o tamanho do Sapato: ");
					tamanhoSapato = leia.nextInt();
					produtos.cadastrar(new Sapato(produtos.gerarNumero(), tamanhoSapato, tipo, nome, cor, preco));

				}
				}

				keyPress();
				break;

			case 2:
				System.out.println("\n Listar todos os Produtos");

				produtos.listarTodas();

				keyPress();
				break;
			case 3:
				System.out.println("\n Buscar Produto por número");

				System.out.println("Digite o número do produto: ");
				numero = leia.nextInt();

				produtos.procurarPorNumero(numero);

				keyPress();
				break;
			case 4:
				System.out.println("\n Editar  produto");

				System.out.println("Digite o número do Produto: ");
				numero = leia.nextInt();

				var buscaProduto = produtos.buscarNaCollection(numero);

				if (buscaProduto != null) {

					tipo = buscaProduto.getTipo();

					System.out.println("Digite o tipo do Produto (1-Camiseta ou 2-Sapato): ");
					tipo = leia.nextInt();
					System.out.println("Digite o nome do Produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					System.out.println("Digite a Cor do Produto: ");
					cor = leia.next();
					System.out.println("Digite o preço do Produto: ");
					preco = leia.nextFloat();

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o Tamando da Camiseta: ");
						tamanhoCamiseta = leia.next();
						produtos.atualizar(new Camiseta(numero, tamanhoCamiseta, tipo, nome, cor, preco));

					}
					case 2 -> {
						System.out.println("Digite o tamanho do Sapato: ");
						tamanhoSapato = leia.nextInt();
						produtos.atualizar(new Sapato(numero, tamanhoSapato, tipo, nome, cor, preco));

					}

					default -> {
						System.out.println("Tipo de produto inválido");
					}

					}

				} else {
					System.out.println("O Produto não foi encontrada!");
				}

				keyPress();
				break;
			case 5:
				System.out.println("\n Apagar Produto");

				System.out.println("Digite o número do Produto: ");
				numero = leia.nextInt();

				produtos.deletar(numero);

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
