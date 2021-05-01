package executavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Program {

	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy");
		Scanner sc = new Scanner(System.in);

		List<Produto> lista = new ArrayList<>();

		System.out.print("Quantide de produtos?");
		int quantInserido = sc.nextInt();

		
		for (int pos = 0; pos < quantInserido; pos++) {
			System.out.println("Produto #" + (pos + 1));
			System.out.print("Importado, usado ou comum ?(c/u/i)");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Valor da taxa: ");
				double taxa = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxa));
			}
			if (tipo == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				String data = sc.next();
				Date dataFabri = sdf.parse(sdf.format(data));
				lista.add(new ProdutoUsado(nome, preco, dataFabri));
			} else {
				lista.add(new Produto(nome, preco));
			}

		}
		System.out.println("Preço e tipo ");
		
		for (Produto prod : lista) { /*Quero que ele imprime de maneira diferente sendo um produto importado dos demais (usados e comuns)*/
			if(prod instanceof ProdutoImportado) {
				
			}
			
		}

		sc.close();

	}

}
