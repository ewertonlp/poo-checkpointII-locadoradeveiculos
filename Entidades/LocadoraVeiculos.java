package com.CheckpointII.LocadoraDeVeiculos.Entidades;

import com.CheckpointII.LocadoraDeVeiculos.Interfaces.LocadoraVeiculosInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class LocadoraVeiculos implements LocadoraVeiculosInterface {
    private String nome;
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Locacao> locacoes = new ArrayList<>();

    public LocadoraVeiculos(String nome) {
        this.nome = nome;
    }

    @Override
    public String cadastrarVeiculo(Veiculo veiculo) {
        veiculo.setIdVeiculo(veiculos.size() > 0 ? veiculos.get(-1).getIdVeiculo() + 1 : 1);
        veiculos.add(veiculo);
        return "Veículo cadastrado com sucesso";
    }

    @Override
    public String cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        return "Funcionário adicionado com sucesso";
    }

    @Override
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso");
    }

    @Override
    public boolean estaDisponivel(int idVeiculo) {
        Veiculo veiculoEncontrado = (Veiculo) veiculos.stream().filter(veiculo -> veiculo.getIdVeiculo() == idVeiculo);

        return veiculoEncontrado.isEstaDisponivel();
    }

    @Override
    public void alugarVeiculo(Veiculo veiculo, Cliente cliente) {
        Locacao locacao = new Locacao(
                    cliente,
                    veiculo
            );

        locacoes.add(locacao);

        System.out.println("Veículo alugado com sucesso!");
    }

    @Override
    public void mostrarClientes() {
        String clientesString = "";
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = clientes.get(i);
            clientesString += "Nome: " + cli.getNome() + " - CPF: " + cli.getCpf() + " - E-mail: " + cli.getEmail() + "\n";
        }

        System.out.println(clientesString);
    }

    @Override
    public void mostrarLocacoes() {
        String locacoesString = "";
        for (int i = 0; i < locacoes.size(); i++) {
            Locacao loc = locacoes.get(i);
            locacoesString += "Modelo veículo: " + loc.getVeiculo().getModelo().getNome() + " - Nome cliente: " + loc.getCliente().getNome() + "\n";
        }

        System.out.println(locacoesString);
    }

    @Override
    public void mostrarVeiculos() {
        String veiculosString = "";
        for (int i = 0; i < veiculos.size(); i++) {
            Veiculo veic = veiculos.get(i);
            veiculosString += "ID: " + veic.getIdVeiculo() + " - Marca: " + veic.getModelo().getMarca() + " - Modelo: " + veic.getModelo().getNome() + "\n";
        }

        System.out.println(veiculosString);
    }

    @Override
    public void mostrarFuncionarios() {
        String funcionariosString = "";
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario func = funcionarios.get(i);
            funcionariosString += "Nome: " + func.getNome() + " - CPF: " + func.getCpf() + " - Salario: " + func.getSalario() + "\n";
        }

        System.out.println(funcionariosString);
    }

    public Cliente buscarClientePorNome(String nomeCliente) {
        try {
            Cliente clienteEncontrado = clientes.stream().filter(cliente -> cliente.getNome().equals(nomeCliente))
                    .findFirst().orElse(null);

            return clienteEncontrado;
        } catch (Exception ex) {
            return null;
        }
    }

    public Veiculo buscarVeiculoPorNome(String nomeVeiculo) {
        try {
            Veiculo veiculoEncontrado = veiculos.stream().filter(cliente -> cliente.getModelo().getNome().equals(nomeVeiculo))
                    .findFirst().orElse(null);

            return veiculoEncontrado;
        } catch (Exception e) {
            return null;
        }
    }

    public String getNome() {
        return nome;
    }
}
