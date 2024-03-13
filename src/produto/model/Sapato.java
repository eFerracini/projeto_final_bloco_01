package produto.model;

public class Sapato extends Produto {

	private int tamanho;

	public Sapato(int numeroProduto, int tamanhoProduto,int tipoProduto, String nomeProduto, String corProduto, float precoProduto) {
		super(numeroProduto, nomeProduto,tipoProduto, corProduto, precoProduto);

		this.setTamanho(tamanhoProduto);

	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
