package Loja;

import java.util.LinkedList;
import java.util.List;

public class Funcionario {

	private List<Carro> carros = new LinkedList<Carro>();
	
	public void adicionarCarro(Carro carro){
		 carros.add(carro);
	}

	public List<Carro> buscarCarro(String modelo){
        List<Carro> encontrados = new LinkedList<Carro>();
        for (Carro carro: carros){
            if (carro.getModelo().equals(modelo))
                encontrados.add(carro);
        }
        return encontrados;
    }
}
