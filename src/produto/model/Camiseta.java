package produto.model;

public class Camiseta extends Produto {

	private String tamanho;

	public Camiseta(int numeroProduto, String tamanhoProduto,int tipoProduto, String nomeProduto, String corProduto,
			float precoProduto) {
		super(numeroProduto, nomeProduto,tipoProduto, corProduto, precoProduto);

		this.setTamanho(tamanhoProduto);
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
