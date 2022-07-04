package com.CheckpointII.LocadoraDeVeiculos;

public class Veiculo {
    private int idVeiculo;
    private String placa;
    private Modelo modelo;
    private double precoLocacao;


    // Construtor
    public Veiculo(int idVeiculo, String placa, Modelo modelo, double precoLocacao) {
        this.idVeiculo = idVeiculo;
        this.placa = placa;
        this.modelo = modelo;
        this.precoLocacao = precoLocacao;
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

    //métodos
    public String cadastrarVeículo() {
        return cadastrarVeículo();
    }
}
