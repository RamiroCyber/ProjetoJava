package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import enuns.Status;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os Dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.println("Data do aniversário (DD//MM/YYYY): ");
		String dataNiver = sc.nextLine();
		Date data = sdf.parse(dataNiver);

		Cliente c1 = new Cliente(nome, email, data);

		System.out.println("Digite os dados do pedido:");
		System.out.println("Status:");
		String stringStatus = sc.nextLine();
		Status status = Status.valueOf(stringStatus);
		System.out.println("Quantos itens vai ter no pedido?");
		int quantItens = sc.nextInt();

		Pedido pedido = new Pedido(c1, new Date(), status);

		for (int pos = 0; pos < quantItens; pos++) {
			sc.nextLine();
			System.out.println("Dados do pedido número #" + (pos + 1));
			System.out.print("Nome Produto: ");
			String nomeP = sc.nextLine();
			System.out.print("Preço do Produto:");
			double precoP = sc.nextDouble();
			System.out.println("Quantidade do Produto:");
			int quantP = sc.nextInt();

			Produto produto = new Produto(nomeP, precoP);

			ItemPedido itemP = new ItemPedido(quantP, precoP, produto);

			pedido.adicionarItem(itemP);
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Sumário");
		System.out.println("Data Pedido: " + sdf2.format(new Date()));
		System.out.println("Cliente: " + c1);
		System.out.println("Itens do pedido: ");

		
		for (ItemPedido itens : pedido.getListaDeItens()) {
			System.out.println("Nome: "+itens.getProdutos().getNome() + " , R$ " + itens.getValor() + ", Quantidade: "
					+ itens.getQuantidade() + ", Subtotal: $" + itens.subTotal());
		}
		System.out.println("Valor total: $" + pedido.total());

		sc.close();

	}

}
