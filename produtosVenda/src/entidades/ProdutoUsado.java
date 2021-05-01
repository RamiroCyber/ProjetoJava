package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataFabricacao;

	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String etiquetaPreco() {
		return super.etiquetaPreco() + sdf.format(dataFabricacao);

	}
}
