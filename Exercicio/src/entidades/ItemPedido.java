package entidades;

public class ItemPedido {
	private int quantidade;
	private double valor;
	private Produto produtos;

	public ItemPedido() {
	}

	public ItemPedido(int quantidade, double valor, Produto produtos) {

		this.quantidade = quantidade;
		this.valor = valor;
		this.produtos = produtos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}

	public Double subTotal() {
		return quantidade * valor;
	}

}
