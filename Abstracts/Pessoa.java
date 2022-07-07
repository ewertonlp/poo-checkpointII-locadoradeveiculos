package com.CheckpointII.LocadoraDeVeiculos.Abstracts;

import com.CheckpointII.LocadoraDeVeiculos.Entidades.Endereco;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;


    public Pessoa() {}
    public Pessoa(String cpf, String nome, Endereco endereco, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
