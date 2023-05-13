import org.junit.Test;
import com.mycompany.Loja.Carro;
import java.util.ArrayList;
import static org.junit.Assert.*;

import com.mycompany.Loja.Loja;
import java.util.List;
public class Teste {
    @Test
    public void teste() {
        Carro carro1 = new Carro("A", "Peugeot 203", 1999, true);
        List<Carro> car = new ArrayList<>();
        Loja loja = new Loja("ok","ok", car);
        loja.adicionarCarro(carro1);
        
         assertEquals(1, loja.getCarros().size());
	}      

    }