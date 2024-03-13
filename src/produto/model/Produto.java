package produto.model;

public abstract class Produto {
	
	private int numero;
	private int tipo;
	private String nome;
	private String cor;
	private float preco;

	public Produto(int numeroProduto,String nomeProduto,int tipoProduto, String corProduto , float precoProduto) {

		this.numero = numeroProduto;
		this.nome = nomeProduto;
		this.tipo = tipoProduto;
		this.cor = corProduto;
		this.preco = precoProduto;

	}
	
	
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Camiseta";
		break;
		case 2:
			tipo = "Sapato";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Numero do  Produto: " + this.numero);
		System.out.println("Nome: " + this.nome);
		System.out.println("Tipo do produto: " + tipo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Preço: " + this.preco);

	}


	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return cor;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}

}
