package com.CheckpointII.LocadoraDeVeiculos;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String cpf, String nome, Endereco endereco, String telefone, String email) {
        super(cpf, nome, endereco, telefone, email);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
