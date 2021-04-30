package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Empregado;
import entidades.EmpregadoTercerizado;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Empregado> lista = new ArrayList<>();

		System.out.print("Digite a quantidade de empregados:");
		int quantEmpregado = sc.nextInt();

		for (int pos = 0; pos < quantEmpregado; pos++) {
			System.out.println("Dados do empregado #" + (pos + 1));
			System.out.print("Terceirizado (y/n)?");
			char yn = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valor = sc.nextDouble();
			sc.nextLine();
			

			if (yn == 'y') {
				System.out.print("Valor do adiconal:");
				double adicional = sc.nextDouble();
				lista.add(new EmpregadoTercerizado(nome, horas, valor, adicional));
			} else {

				lista.add(new Empregado(nome, horas, valor));
			}

		}

		System.out.println("Pagamentos:");
		System.out.println();
		for (Empregado emp : lista) {
			System.out.println("Nome: " + emp.getNome() + "- $" + emp.pagamento());

		}

		sc.close();
	}

}
