package com.CheckpointII.LocadoraDeVeiculos.Entidades;

import com.CheckpointII.LocadoraDeVeiculos.Abstracts.Pessoa;

public class Cliente extends Pessoa {
    private String rg;

    public Cliente() {
        super();
    }

    public Cliente(String cpf, String nome, Endereco endereco, String telefone, String email, String rg) {
        super(cpf, nome, endereco, telefone, email);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
