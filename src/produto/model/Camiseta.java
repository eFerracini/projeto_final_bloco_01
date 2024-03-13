package produto.model;

public class Camiseta extends Produto {

	private String tamanhoCamiseta;

	public Camiseta(int numeroProduto, String tamanhoCamiseta,int tipoProduto, String nomeProduto, String corProduto,
			float precoProduto) {
		super(numeroProduto, nomeProduto,tipoProduto, corProduto, precoProduto);

	}

	public String getTamanho() {
		return tamanhoCamiseta;
	}

	public void setTamanho(String tamanhoCamiseta) {
		this.tamanhoCamiseta = tamanhoCamiseta;
	}

}
