package com.mycompany.Loja;
import java.util.ArrayList;
import java.util.List;


public class Loja {
    private String nome;
    private String local;
    private List<Carro> carros = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    
    public Loja (String nome, String local, List<Carro> carros, List<Funcionario> funcionarios, List<Cliente> clientes) {
	this.nome = nome;
	this.local = local;
        this.carros = carros;
        this.funcionarios = funcionarios;
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }


    public String getLocal() {
        return local;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Carro> getCarros(){
        return carros;
    }
    
    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
    
    public void removerCarro(Carro carro) {
    carros.remove(carro);
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
        
    }
    public List<Carro> buscarCarrosDisponiveisPorModelo(String modelo) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getModelo().equals(modelo) && carro.isDisponivel()) {
                carrosDisponiveis.add(carro);
            }
        }
        return carrosDisponiveis;
    }
    
    


}