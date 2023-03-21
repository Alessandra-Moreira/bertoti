package Loja;
import java.util.LinkedList;
import java.util.List;


public class Loja {
	private String nome;
	private String local;
	private List<Carro> carros = new LinkedList<Carro>();
	
	public List<Carro> getCarros(){
		 return carros;
	}
	
	public Loja (String nome, String local) {
		this.nome = nome;
		this.local = local;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getLocal() {
		return local;
	}
	
}
