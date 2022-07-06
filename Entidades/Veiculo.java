package com.CheckpointII.LocadoraDeVeiculos.Entidades;

public class Veiculo {
    private int idVeiculo;
    private String placa;
    private Modelo modelo;
    private double precoLocacao;
    private boolean estaDisponivel;


    // Construtor
    public Veiculo(int idVeiculo, String placa, Modelo modelo, double precoLocacao, boolean estaDisponivel) {
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.modelo = modelo;
        this.precoLocacao = precoLocacao;
        this.estaDisponivel = estaDisponivel;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public double getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }

    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }

    public void setEstaDisponivel(boolean estaDisponivel) {
        this.estaDisponivel = estaDisponivel;
    }
}
