package com.CheckpointII.LocadoraDeVeiculos.Entidades;

import com.CheckpointII.LocadoraDeVeiculos.Abstracts.Pessoa;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String cpf, String nome, Endereco endereco, String telefone, String email, double salario) {
        super(cpf, nome, endereco, telefone, email);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
