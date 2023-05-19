import org.junit.Before;
import org.junit.Test;
import com.mycompany.Loja.Carro;
import com.mycompany.Loja.Cliente;
import com.mycompany.Loja.Funcionario;
import java.util.ArrayList;
import static org.junit.Assert.*;

import com.mycompany.Loja.Loja;
import java.util.List;

public class Teste {

    private Loja loja;

    @Before
    public void setUp() {
        List<Carro> carros = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        loja = new Loja("Minha Loja", "Local", carros, funcionarios, clientes);
    }

    @Test
    public void testeAdicionarCarro() {
        Carro carro1 = new Carro("Peugeot ", "A", 2018, true);
        loja.adicionarCarro(carro1);
        
        assertEquals(1, loja.getCarros().size());
    } 
    
    @Test
    public void testRemoverCarro() {
        Carro carro1 = new Carro("Peugeot ", "A", 2018, true);
        Carro carro = new Carro("Modelo1", "Grupo1", 2021, true);
        loja.adicionarCarro(carro1);
        loja.adicionarCarro(carro);
        loja.removerCarro(carro);

        assertEquals(1, loja.getCarros().size());
        assertFalse(loja.getCarros().contains(carro));
    }
    
    @Test
    public void testeCriarLoja() {
        assertEquals("Minha Loja", loja.getNome());
        assertEquals("Local", loja.getLocal());
        assertEquals(0, loja.getCarros().size());
    }
    
    @Test
    public void testAdicionarCliente() {
        Cliente cliente = new Cliente("Alessandra", "abc12", "alessandra@fatec.com", 123456789);
        loja.adicionarCliente(cliente);

        assertEquals(1, loja.getClientes().size());
        assertTrue(loja.getClientes().contains(cliente));
    }

    @Test
    public void testAdicionarFuncionario() {
        Funcionario funcionario = new Funcionario("Funcionario1", "senha", "email", null);
        loja.adicionarFuncionario(funcionario);

        assertEquals(1, loja.getFuncionarios().size());
        assertTrue(loja.getFuncionarios().contains(funcionario));
    }
    
    @Test
    public void testBuscarCarroDisponivelPorModelo() {
        Carro carro1 = new Carro("Modelo1", "Grupo1", 2021, true);
        Carro carro2 = new Carro("Modelo2", "Grupo2", 2022, false);
        loja.adicionarCarro(carro1);
        loja.adicionarCarro(carro2);
        List<Carro> carrosDisponiveis = loja.buscarCarrosDisponiveisPorModelo("Modelo1");

        assertEquals(1, carrosDisponiveis.size());
        assertEquals("Modelo1", carrosDisponiveis.get(0).getModelo());
        assertTrue(carrosDisponiveis.get(0).isDisponivel());
    }
}
