
package com.mycompany.Loja;
import java.util.LinkedList;
import java.util.List;


public class Loja {
	private String nome;
	private String local;
	private List<Carro> carros = new LinkedList<Carro>();
	
	public List<Carro> getCarros(){
		 return carros;
	}
        public void adicionarCarro(Carro carro){
            carros.add(carro);
        }
	
	public Loja (String nome, String local, List<Carro> carros) {
		this.nome = nome;
		this.local = local;
                this.carros = carros;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getLocal() {
		return local;
	}
}