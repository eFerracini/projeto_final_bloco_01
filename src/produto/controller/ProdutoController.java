package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController  implements ProdutoRepository{

	private ArrayList<Produto> listaProduto= new ArrayList<Produto>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("O produto de número: " + numero + " não foi encontrado");
		
	}

	@Override
	public void listarTodas() {
		
		for (var produto : listaProduto) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProduto.add(produto);
		System.out.println("O Produto com número: " + produto.getNumero() + " foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getNumero());

		if (buscaProduto != null) {
			listaProduto.set(listaProduto.indexOf(buscaProduto), produto);
			System.out.println("O produto de número: " + produto.getNumero() + " foi atualizada com sucesso!");
		} else {
			System.out.println("O produto de número: " + produto.getNumero() + " não foi encontrada!");

		}
		
	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);

		if (produto != null) {
			if (listaProduto.remove(produto) == true)
				System.out.println("O Poduto de número: " + numero + " foi deletado com sucesso!");

		} else {
			System.out.println("O Poduto de número: " + numero + " não foi encontrada!");
		}
		
	}
	
	public int gerarNumero() {
		return ++numero;
	}
	
	public Produto buscarNaCollection(int numero) {
		for (var produto : listaProduto) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}

		return null;
	}

}
