package com.mycompany.Loja;

public class Carro {
	private String modelo;
	private String grupo;
        private int ano;
        private boolean disponivel;
	
	public Carro(String modelo, String grupo, int ano, boolean disponivel) {
		this.modelo = modelo;
		this.grupo = grupo;
                this.ano = ano;
                this.disponivel = disponivel;
		}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getGrupo() {
		return grupo;
	}

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public boolean isDisponivel() {
            return disponivel;
        }

        public void setDisponivel(boolean disponivel) {
            this.disponivel = disponivel;
        }

    }
