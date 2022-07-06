package com.CheckpointII.LocadoraDeVeiculos.Entidades;

import com.CheckpointII.LocadoraDeVeiculos.Interfaces.LocadoraVeiculosInterface;

import java.util.ArrayList;
import java.util.List;

public class LocadoraVeiculos implements LocadoraVeiculosInterface {
    private String nome;
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public LocadoraVeiculos(String nome) {
        this.nome = nome;
    }

    @Override
    public String cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        return "Veículo cadastrado com sucesso";
    }

    @Override
    public String cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        return "Funcionário adicionado com sucesso";
    }

    @Override
    public String cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        return "Cliente adicionado com sucesso";
    }

    @Override
    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }

    @Override
    public boolean estaDisponivel(int idVeiculo) {
        Veiculo veiculoEncontrado = (Veiculo) veiculos.stream().filter(veiculo -> veiculo.getIdVeiculo() == idVeiculo);

        return veiculoEncontrado.isEstaDisponivel();
    }

    public String getNome() {
        return nome;
    }
}
