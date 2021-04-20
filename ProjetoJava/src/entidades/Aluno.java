package entidades;

import java.util.ArrayList;
import java.util.List;

import constantes.Status;

public class Aluno {

	private String nome;
	private int idade;
	private String dataNascimento;
	private String rg;
	private String cpf;
	private String mae;
	private String pai;
	private String matricula;
	private String serie;
	private String escola;

	private List<Disciplina> disciplinas = new ArrayList<>();

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, int idade, String dataNascimento, String rg, String cpf, String mae, String pai,
			String matricula, String serie, String escola) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.mae = mae;
		this.pai = pai;
		this.matricula = matricula;
		this.serie = serie;
		this.escola = escola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public List<Disciplina> getListDisciplinas() {
		return disciplinas;
	}

	public double mediaNotas() {
		double soma = 0.0;
		for (Disciplina x : disciplinas) {
			soma += x.getNota();
		}
		return soma / disciplinas.size();
	}

	public boolean mediaGeral() {
		double media = mediaNotas();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String resultado() {
		double mediaAprovado = mediaNotas();
		if (mediaAprovado >= 50) {
			if (mediaAprovado >= 70) {
				return Status.aprovado;
			} else {
				return Status.recuperacao;
			}
		}
		return Status.reprovado;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", cpf=" + cpf + ", mae=" + mae + ", pai=" + pai + ", matricula=" + matricula + ", serie=" + serie
				+ ", escola=" + escola + "";
	}

}
