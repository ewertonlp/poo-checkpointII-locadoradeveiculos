package com.CheckpointII.LocadoraDeVeiculos;

import com.CheckpointII.LocadoraDeVeiculos.Entidades.*;
import com.CheckpointII.LocadoraDeVeiculos.Statics.DividerService;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Bem vindo a sistema de locadora de veículos!");
        System.out.println("Inicialmente, vamos cadastrar o nome da locadora!");
        System.out.println("Digite o nome da locadora: ");
        String nomeLocadora = scanInput.nextLine();

        while (nomeLocadora.length() <= 0) {
            System.out.println("Digite um nome valido!");
            System.out.println("Digite o nome da locadora: ");
            nomeLocadora = scanInput.nextLine();
        }

        LocadoraVeiculos locadoraVeiculos = new LocadoraVeiculos(nomeLocadora);

        DividerService.Diviver();

        System.out.println("Bem vindo a locadora " + locadoraVeiculos.getNome());
        System.out.println("Agora vamos adicionar os veículos que temos para alugar");

        int exit = 1;

        while (exit != 0) {
            System.out.println("Modelo do veículo: ");
            String modelo = scanInput.nextLine();

            System.out.println("Marca do veículo: ");
            String marca = scanInput.nextLine();

            System.out.println("Caracteriscas do veículo (como cor, por exemplo): ");
            String caracteristicas = scanInput.nextLine();

            System.out.println("Ano de fabricação do veículo: ");
            int anoFabricacao = scanInput.nextInt();

            System.out.println("Placa: ");
            String placa = scanInput.nextLine();

            System.out.println("Preço locação: ");
            double precoLocacao = scanInput.nextDouble();

            Veiculo veiculo = new Veiculo(
                    locadoraVeiculos.listarVeiculos().get(-1).getIdVeiculo() + 1,
                    placa,
                    new Modelo(modelo, marca, caracteristicas, anoFabricacao),
                    precoLocacao,
                    true
            );

            locadoraVeiculos.cadastrarVeiculo(veiculo);

            System.out.println("Deseja adicionar mais um veículo? Pressione 0 para não e 1 para sim");
            exit = scanInput.nextInt();
        }

        Cliente cliente = new Cliente(
                "009.934.170-00",
                "Rhuan Bello",
                new Endereco("25025-235", "Rua Padre Marins Loureiro", 120, "Duque de Caxias"),
                "(99) 99999-9999",
                "rhuan@cliente.com",
                "50.564.295-5");

        Funcionario funcionario = new Funcionario(
                "916.534.330-19",
                "Rhuan Funcionario",
                new Endereco("25051-110", "Rua Virgílio Várzea", 123, "Duque de Caxias"),
                "(88) 88888-8888",
                "rhuan@funcionario.com",
                7200.00);
    }
}
