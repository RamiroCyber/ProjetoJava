package entidades;

public class EmpregadoTercerizado extends Empregado {

	double extraAdicional;

	public EmpregadoTercerizado() {
	}

	public EmpregadoTercerizado(String nome, int horas, double valorPhora, double extraAdicional) {
		super(nome, horas, valorPhora);
		this.extraAdicional = extraAdicional;
	}

	public double getExtraAdicional() {
		return extraAdicional;
	}

	public void setExtraAdicional(double extraAdicional) {
		this.extraAdicional = extraAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + extraAdicional * 1.1;
	}
}