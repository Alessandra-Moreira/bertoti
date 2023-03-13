package estoque;
import java.util.List;
import java.util.LinkedList;

public class Estoque {

	private List<Produto> produtos = new LinkedList<Produto>();
	public void addProduto(Produto prod) {
		produtos.add(prod);
	}
	public List<Produto> buscarProdutoNome(String nome){
		List<Produto> localizados = new LinkedList<Produto>();
		for (Produto produto: produtos) {
			if(produto.getNone().equals(none))
				localizados.add(produto);
		}
		return localizados;
		
	}
	
	
	}
	

}
