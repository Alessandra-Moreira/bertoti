
package com.mycompany.Loja;

import java.util.LinkedList;
import java.util.List;

public class Funcionario {
    private String nomeFuncionario;
    private String senha;
    private String email;
    private Reserva reserva;

    public Funcionario(String nomeFuncionario, String senha, String email, Reserva reserva) {
        this.nomeFuncionario = nomeFuncionario;
        this.senha = senha;
        this.email = email;
        this.reserva = reserva;
    }

    private List<Carro> carros = new LinkedList<>();

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
	


}
