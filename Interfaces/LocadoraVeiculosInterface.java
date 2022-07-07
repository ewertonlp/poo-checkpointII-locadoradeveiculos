package com.CheckpointII.LocadoraDeVeiculos.Interfaces;

import com.CheckpointII.LocadoraDeVeiculos.Entidades.Cliente;
import com.CheckpointII.LocadoraDeVeiculos.Entidades.Funcionario;
import com.CheckpointII.LocadoraDeVeiculos.Entidades.Veiculo;

public interface LocadoraVeiculosInterface {
    String cadastrarVeiculo(Veiculo veiculo);
    String cadastrarFuncionario(Funcionario funcionario);
    void cadastrarCliente(Cliente cliente);
    boolean estaDisponivel(int idVeiculo);
    void alugarVeiculo(Veiculo veiculo, Cliente cliente);
    void mostrarClientes();
    void mostrarVeiculos();
    void mostrarFuncionarios();
    void mostrarLocacoes();
}
