package com.CheckpointII.LocadoraDeVeiculos.Services;

import com.CheckpointII.LocadoraDeVeiculos.Entidades.Cliente;
import com.CheckpointII.LocadoraDeVeiculos.Entidades.Endereco;

import java.util.Scanner;

public class ConfigurarCliente {
    Scanner scanInput = new Scanner(System.in);

    public Cliente configurarCliente () {
        System.out.println("Nome do cliente: ");
        String nome = scanInput.nextLine();

        System.out.println("CPF do cliente: ");
        String cpf = scanInput.nextLine();

        System.out.println("RG do cliente: ");
        String rg = scanInput.nextLine();

        System.out.println("Email do cliente: ");
        String email = scanInput.nextLine();

        System.out.println("Telefone do cliente");
        String telefone = scanInput.nextLine();

        System.out.println("Endereço do cliente");
        System.out.println("CEP do cliente: ");
        String cep = scanInput.nextLine();

        System.out.println("Logradouro do cliente");
        String logradouro = scanInput.nextLine();

        System.out.println("Número da casa: ");
        int numeroCasa = scanInput.nextInt();
        scanInput.nextLine();

        System.out.println("Cidade do cliente: ");
        String cidade = scanInput.nextLine();

        Cliente cliente = new Cliente(
                cpf,
                nome,
                new Endereco(cep, logradouro, numeroCasa, cidade),
                telefone,
                email,
                rg
        );

        return cliente;
    }

}
