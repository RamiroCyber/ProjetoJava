package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enuns.Status;

public class Pedido {

	private Cliente cliente;
	private Date dataPedido = new Date();
	private Status statusPedido;
	List<ItemPedido> listaDeItens = new ArrayList<>();

	public Pedido() {
	}

	public Pedido(Cliente cliente, Date dataPedido, Status statusPedido) {

		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.statusPedido = statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Status getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(Status statusPedido) {
		this.statusPedido = statusPedido;
	}

	public List<ItemPedido> getListaDeItens() {
		return listaDeItens;
	}

	public void adicionarItem(ItemPedido item) {
		listaDeItens.add(item);
	}

	public void removerItem(ItemPedido item) {
		listaDeItens.remove(item);
	}

	public Double total() {
		double total = 0.0;
		for (ItemPedido listaItem : listaDeItens) {
			total += listaItem.subTotal();

		}
		return total;

	}
}
