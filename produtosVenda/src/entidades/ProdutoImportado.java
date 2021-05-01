package entidades;

public class ProdutoImportado extends Produto {

	private double taxaAlfandega;

	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public String etiquetaPreco() {
		return super.etiquetaPreco() + valorTotal();
	}

	public Double valorTotal() {
		return super.preco + taxaAlfandega;
	}

}
