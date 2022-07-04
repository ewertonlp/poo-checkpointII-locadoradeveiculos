package com.CheckpointII.LocadoraDeVeiculos;

import java.time.LocalDate;

public class Locacao {
    private int idLocacao;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private Cliente cliente;
    private Modelo modelo;
    private Long quilometragem;

    public Locacao(int idLocacao, LocalDate dataLocacao, LocalDate dataDevolucao, Cliente cliente, Modelo modelo, Long quilometragem) {
        this.idLocacao = idLocacao;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Long quilometragem) {
        this.quilometragem = quilometragem;
    }
}
