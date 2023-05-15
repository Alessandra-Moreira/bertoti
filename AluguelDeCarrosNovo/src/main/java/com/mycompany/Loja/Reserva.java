
package com.mycompany.Loja;

import java.util.LinkedList;
import java.util.List;

public class Reserva {
    private int dataRetirada;
    private int horaRetirada;
    private int dataDevolucao;
    private int horaDevolucao;
    private Loja local;
    private List<Carro> carroDisponivel = new LinkedList<Carro>();

    public Reserva(int dataRetirada, int horaRetirada, int dataDevolucao, int horaDevolucao, Loja local) {
        this.dataRetirada = dataRetirada;
        this.horaRetirada = horaRetirada;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.local = local;
    }
	

    public int getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(int dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public int getHoraRetirada() {
        return horaRetirada;
    }

    public void setHoraRetirada(int horaRetirada) {
        this.horaRetirada = horaRetirada;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(int horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public List<Carro> getCarroDisponivel() {
        return carroDisponivel;
    }

    public void setCarroDisponivel(List<Carro> carroDisponivel) {
        this.carroDisponivel = carroDisponivel;
    }
	

}