package com.CheckpointII.LocadoraDeVeiculos.Services;

import com.CheckpointII.LocadoraDeVeiculos.Entidades.Endereco;
import com.CheckpointII.LocadoraDeVeiculos.Entidades.Funcionario;

import java.util.Scanner;

public class ConfigurarLocacao {
    Scanner scanInput = new Scanner(System.in);

    public Funcionario configurarLocacao() {
        System.out.println("Nome do funcionário: ");
        String nome = scanInput.nextLine();

        System.out.println("CPF do funcionário: ");
        String cpf = scanInput.nextLine();

        System.out.println("Email do funcionário: ");
        String email = scanInput.nextLine();

        System.out.println("Telefone do funcionário");
        String telefone = scanInput.nextLine();

        System.out.println("Endereço do funcionário");
        System.out.println("CEP do funcionário: ");
        String cep = scanInput.nextLine();

        System.out.println("Logradouro do funcionário");
        String logradouro = scanInput.nextLine();

        System.out.println("Número da casa: ");
        int numeroCasa = scanInput.nextInt();
        scanInput.nextLine();

        System.out.println("Cidade do funcionário: ");
        String cidade = scanInput.nextLine();

        System.out.println("Por fim, o salário do funcionario");
        double salario = scanInput.nextDouble();
        scanInput.nextLine();

        Funcionario funcionario = new Funcionario(
                cpf,
                nome,
                new Endereco(cep, logradouro, numeroCasa, cidade),
                telefone,
                email,
                salario
        );

        return funcionario;
    }
}
