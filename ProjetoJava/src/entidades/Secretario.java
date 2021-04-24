package entidades;

import interfaces.PermitirAcesso;

public class Secretario implements PermitirAcesso {
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	

	@Override
	public boolean autenticar(String login, String senha) {
		
		return login.equals("admin") && senha.equals("admin");
	}
	
	
	
}
