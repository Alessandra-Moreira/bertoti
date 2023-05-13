
package com.mycompany.Loja;

import java.util.LinkedList;
import java.util.List;

public class Reserva {
	private Loja local;
	private List<Carro> carroDisponivel = new LinkedList<Carro>();
	
	public Reserva ( Loja local) {
		this.local = local;
	}
	
	public Loja getLocal() {
		return local;
	}
	

}