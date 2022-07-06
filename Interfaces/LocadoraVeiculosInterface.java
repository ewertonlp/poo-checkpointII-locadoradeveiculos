package com.CheckpointII.LocadoraDeVeiculos.Interfaces;

import com.CheckpointII.LocadoraDeVeiculos.Entidades.Cliente;
import com.CheckpointII.LocadoraDeVeiculos.Entidades.Funcionario;
import com.CheckpointII.LocadoraDeVeiculos.Entidades.Veiculo;

import java.util.List;

public interface LocadoraVeiculosInterface {
    String cadastrarVeiculo(Veiculo veiculo);
    String cadastrarFuncionario(Funcionario funcionario);
    String cadastrarCliente(Cliente cliente);
    List<Veiculo> listarVeiculos();
    boolean estaDisponivel(int idVeiculo);
}
