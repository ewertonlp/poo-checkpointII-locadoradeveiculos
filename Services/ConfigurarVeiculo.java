package com.CheckpointII.LocadoraDeVeiculos.Services;

import com.CheckpointII.LocadoraDeVeiculos.Entidades.Modelo;
import com.CheckpointII.LocadoraDeVeiculos.Entidades.Veiculo;

import java.util.Scanner;

public class ConfigurarVeiculo {
    Scanner scanInput = new Scanner(System.in);

    public Veiculo configurarVeiculo () {
        System.out.println("Modelo do veículo: ");
        String modelo = scanInput.nextLine();

        System.out.println("Marca do veículo: ");
        String marca = scanInput.nextLine();

        System.out.println("Caracteriscas do veículo (como cor, por exemplo): ");
        String caracteristicas = scanInput.nextLine();

        System.out.println("Ano de fabricação do veículo: ");
        int anoFabricacao = scanInput.nextInt();
        scanInput.nextLine();

        System.out.println("Placa: ");
        String placa = scanInput.nextLine();

        System.out.println("Preço locação: ");
        double precoLocacao = scanInput.nextDouble();
        scanInput.nextLine();

        Veiculo veiculo = new Veiculo(
                placa,
                new Modelo(modelo, marca, caracteristicas, anoFabricacao),
                precoLocacao
        );

        return veiculo;
    }
}
