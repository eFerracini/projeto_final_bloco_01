package produto.model;

public class Sapato extends Produto {

	private int tamanhoSapato;

	public Sapato(int numeroProduto, int tamanhoSapato,int tipoProduto, String nomeProduto, String corProduto, float precoProduto) {
		super(numeroProduto, nomeProduto,tipoProduto, corProduto, precoProduto);


	}

	public int getTamanho() {
		return tamanhoSapato;
	}

	public void setTamanho(int tamanhoSapato) {
		this.tamanhoSapato = tamanhoSapato;
	}

}
