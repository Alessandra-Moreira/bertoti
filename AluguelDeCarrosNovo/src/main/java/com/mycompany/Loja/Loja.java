
package com.mycompany.Loja;
import java.util.LinkedList;
import java.util.List;


public class Loja {
    private String nome;
    private String local;
    private List<Carro> carros = new LinkedList<>();
    
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
    
    public List<Carro> getCarros(){
        return carros;
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        //funcionario.add(funcionario);
    }


}