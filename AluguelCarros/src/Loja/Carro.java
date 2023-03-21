package Loja;

public class Carro {
	private String modelo;
	private String grupo;
	
	public Carro(String modelo, String grupo) {
		this.modelo = modelo;
		this.grupo = grupo;
		}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getGrupo() {
		return grupo;
	}

}
