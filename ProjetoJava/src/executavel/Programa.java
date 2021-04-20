package executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.swing.JOptionPane;

import entidades.Aluno;
import entidades.Disciplina;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Aluno> alunos = new ArrayList<Aluno>();

		String receberAlunos = JOptionPane.showInputDialog("Quantos alunos deseja cadastrar? ");

		int quantAlunos = Integer.parseInt(receberAlunos);

		for (int q = 0; q < quantAlunos; q++) {

			String nome = JOptionPane.showInputDialog("Nome do Aluno ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Idade do aluno ?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento ?"); String
			 * rg = JOptionPane.showInputDialog("Registro geral do Aluno ?"); String cpf =
			 * JOptionPane.showInputDialog("CPF ?"); String mae =
			 * JOptionPane.showInputDialog("Nome da mãe ?"); String pai =
			 * JOptionPane.showInputDialog("Nome do Pai ?"); String dataMatricula =
			 * JOptionPane.showInputDialog("Data da matrícula do Aluno ?"); String matricula
			 * = JOptionPane.showInputDialog("Matrícula do Aluno ?"); String nomeEscola =
			 * JOptionPane.showInputDialog("Nome da escola ?");
			 */

			Aluno aluno1 = new Aluno(nome);/*
											 * , Integer.parseInt(idade), dataNascimento, rg, cpf, mae, pai,
											 * dataMatricula, matricula, nomeEscola);
											 */

			String quantDisciplinas = JOptionPane.showInputDialog("Quantidade de disciplinas?");
			int nDisciplinas = Integer.parseInt(quantDisciplinas);

			for (int i = 0; i < nDisciplinas; i++) {
				String nomeDis = JOptionPane.showInputDialog("Nome da disciplina? ");
				String notaDis = JOptionPane.showInputDialog("Nota do aluno na disciplina " + nomeDis + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDis);
				disciplina.setNota(Double.parseDouble(notaDis));

				aluno1.getListDisciplinas().add(disciplina);
			}

			int remover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
			if (remover == 0) {
				int continuar = 0;
				int cont = 1;
				while (continuar == 0) {
					String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina deseja remover ?");
					int n = (Integer.valueOf(removerDisciplina).intValue());
					aluno1.getListDisciplinas().remove(n - cont);
					cont++;
					continuar = JOptionPane.showConfirmDialog(null, "Deseja remover mais ? ");
				}
			}
			alunos.add(aluno1);
		}
		for (Aluno listaAlunos : alunos) {
			System.out.println(("Nome: ") + listaAlunos.getNome());
			System.out.println(("Matrícula: ") + listaAlunos.getMatricula());
			System.out.println("Média do aluno :" + listaAlunos.mediaNotas());
			System.out.println("Resultado : " + listaAlunos.resultado());

			for (Disciplina listaDisciplina : listaAlunos.getListDisciplinas()) {
				System.out.println("-------------------------");
				System.out.println("Nome disciplina: " + listaDisciplina.getDisciplina());
				System.out.println("Nota disciplina: " + listaDisciplina.getNota());
				System.out.println("-------------------------");
			}
		}

	}

}
