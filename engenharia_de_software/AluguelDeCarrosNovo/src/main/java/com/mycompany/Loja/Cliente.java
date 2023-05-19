
package com.mycompany.Loja;

public class Cliente {
    private String nomeCliente;
    private String senhaCliente;
    private String emailCliente;
    private int rgCliente;

    public Cliente(String nomeCliente, String senhaCliente, String emailCliente, int rgCliente) {
        this.nomeCliente = nomeCliente;
        this.senhaCliente = senhaCliente;
        this.emailCliente = emailCliente;
        this.rgCliente = rgCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(int rgCliente) {
        this.rgCliente = rgCliente;
    }
    
}
