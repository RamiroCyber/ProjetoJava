package executavel;

import java.util.Locale;

import javax.swing.JOptionPane;

import entidades.Aluno;
import entidades.Disciplina;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String nome = JOptionPane.showInputDialog("Nome do Aluno ?");
		String idade = JOptionPane.showInputDialog("Idade do aluno ?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento ?");
		String rg = JOptionPane.showInputDialog("Registro geral do Aluno ?");
		String cpf = JOptionPane.showInputDialog("CPF ?");
		String mae = JOptionPane.showInputDialog("Nome da mãe ?");
		String pai = JOptionPane.showInputDialog("Nome do Pai ?");
		String dataMatricula = JOptionPane.showInputDialog("Data da matrícula do Aluno ?");
		String matricula = JOptionPane.showInputDialog("Matrícula do Aluno ?");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola ?");

		Aluno aluno1 = new Aluno(nome, Integer.parseInt(idade), dataNascimento, rg, cpf, mae, pai, dataMatricula,
				matricula, nomeEscola);

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

		System.out.println(aluno1);
		System.out.println("Com media: " + aluno1.mediaNotas());
		System.out.println("Resultado: " + aluno1.resultado());
	}

}
