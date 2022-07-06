package com.CheckpointII.LocadoraDeVeiculos.Entidades;

import java.util.Scanner;

public class Endereco {
    private String cep;
    private String logradouro;
    private int numero;
    private String Cidade;


    public Endereco(String cep, String logradouro, int numero, String cidade) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        Cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public void validarCep() {
        Scanner cep = new Scanner(System.in);
        System.out.println("O CEP digitado foi: " + cep);
    }
}
