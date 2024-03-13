package produto.repository;

import produto.model.Produto;

public class ProdutoRepository {

	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Produto conta);
	public void atualizar(Produto conta);
	public void deletar(int numero);
	
}
