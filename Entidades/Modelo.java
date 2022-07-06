package com.CheckpointII.LocadoraDeVeiculos.Entidades;

public class Modelo {
    private String nome;
    private String marca;
    private String caracteristicas;
    private int anoFabricacao;


    public Modelo(String nome, String marca, String caracteristicas, int anoFabricacao) {
        this.nome = nome;
        this.marca = marca;
        this.caracteristicas = caracteristicas;
        this.anoFabricacao = anoFabricacao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
