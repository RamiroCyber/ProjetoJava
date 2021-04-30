package entidades;

public class Empregado {

	protected String nome;
	protected int horas;
	protected double valorPhora;

	public Empregado() {
	}

	public Empregado(String nome, int horas, double valorPhora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPhora = valorPhora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getValorPhora() {
		return valorPhora;
	}

	public void setValorPhora(double valorPhora) {
		this.valorPhora = valorPhora;
	}
	
	public double pagamento() {
		return horas * valorPhora;
	}
}
