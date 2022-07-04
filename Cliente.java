package com.CheckpointII.LocadoraDeVeiculos;

public class Cliente extends Pessoa{
    private String rg;

    public Cliente(String cpf, String nome, Endereco endereco, String telefone, String email) {
        super(cpf, nome, endereco, telefone, email);
    }


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
