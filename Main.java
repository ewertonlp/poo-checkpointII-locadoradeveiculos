package com.CheckpointII.LocadoraDeVeiculos;

import com.CheckpointII.LocadoraDeVeiculos.Entidades.*;
import com.CheckpointII.LocadoraDeVeiculos.Services.ConfigurarCliente;
import com.CheckpointII.LocadoraDeVeiculos.Services.ConfigurarFuncionario;
import com.CheckpointII.LocadoraDeVeiculos.Services.ConfigurarLocacao;
import com.CheckpointII.LocadoraDeVeiculos.Services.ConfigurarVeiculo;
import com.CheckpointII.LocadoraDeVeiculos.Services.Menus.*;
import com.CheckpointII.LocadoraDeVeiculos.Statics.DividerService;

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
        MainMenu mainMenu = new MainMenu(locadoraVeiculos.getNome());

        DividerService.Diviver();
        System.out.println("Bem vindo a locadora [" + locadoraVeiculos.getNome() + "]");

        int mainMenuOption = 0;
        int subMenuOption;

        while (mainMenuOption != 5) {
            mainMenu.showMainMenu();

            mainMenuOption = scanInput.nextInt();
            scanInput.nextLine();

            DividerService.Diviver();


            switch (mainMenuOption) {
                case 1: {
                    SubMenuVeiculo subMenuVeiculos = new SubMenuVeiculo();
                    subMenuVeiculos.showSubMenuVeiculo();

                    subMenuOption = scanInput.nextInt();
                    scanInput.nextLine();

                    switch (subMenuOption) {
                        case 1: {
                            locadoraVeiculos.mostrarVeiculos();
                            break;
                        } case 2: {
                            ConfigurarVeiculo configurarVeiculo = new ConfigurarVeiculo();
                            Veiculo novoVeiculo = configurarVeiculo.configurarVeiculo();

                            locadoraVeiculos.cadastrarVeiculo(novoVeiculo);
                            break;
                        } case 3: {
                            DividerService.Diviver();
                            break;
                        }
                    }
                    break;
                } case 2: {
                    SubMenuFuncionario subMenuFuncionario = new SubMenuFuncionario();
                    subMenuFuncionario.showSubMenuFuncionario();

                    subMenuOption = scanInput.nextInt();
                    scanInput.nextLine();

                    switch (subMenuOption) {
                        case 1: {
                            locadoraVeiculos.mostrarFuncionarios();
                            break;
                        } case 2: {
                            ConfigurarFuncionario configurarFuncionario = new ConfigurarFuncionario();
                            Funcionario novoFuncionario = configurarFuncionario.configurarFuncionario();

                            locadoraVeiculos.cadastrarFuncionario(novoFuncionario);
                            break;
                        } case 3: {
                            DividerService.Diviver();
                            break;
                        }
                    }
                    break;
                } case 3: {
                    SubMenuCliente subMenuClientes = new SubMenuCliente();
                    subMenuClientes.showSubMenuCliente();

                    subMenuOption = scanInput.nextInt();
                    scanInput.nextLine();

                    switch (subMenuOption) {
                        case 1: {
                            locadoraVeiculos.mostrarClientes();
                            break;
                        } case 2: {
                            ConfigurarCliente configurarCliente = new ConfigurarCliente();
                            Cliente novoCliente = configurarCliente.configurarCliente();

                            locadoraVeiculos.cadastrarCliente(novoCliente);
                            break;
                        } case 3: {
                            DividerService.Diviver();
                            break;
                        }
                    }
                    break;
                } case 4: {
                    SubMenuLocadora subMenuLocadora = new SubMenuLocadora();
                    subMenuLocadora.showSubMenuLocadora();

                    subMenuOption = scanInput.nextInt();
                    scanInput.nextLine();

                    switch (subMenuOption) {
                        case 1: {
                            locadoraVeiculos.mostrarClientes();
                            break;
                        } case 2: {
                            System.out.println("Nome do cliente que vai alugar o veículo");
                            String clienteNome = scanInput.nextLine();

                            Cliente cliente = locadoraVeiculos.buscarClientePorNome(clienteNome);

                            if (cliente != null) {
                                System.out.println("Nome do veículo que será alugado");
                                String veiculoNome = scanInput.nextLine();

                                Veiculo veiculo = locadoraVeiculos.buscarVeiculoPorNome(veiculoNome);

                                if (veiculo != null) {
                                    locadoraVeiculos.alugarVeiculo(veiculo, cliente);
                                } else {
                                    System.out.println("Veículo não encontrado!");
                                }
                            } else {
                                System.out.println("Cliente não encontrado!");
                            }
                            break;
                        } case 3: {
                            DividerService.Diviver();
                            break;
                        }
                    }

                    break;
                } case 5: {
                    System.out.printf("Volte sempre!\n");
                    break;
                }
            }
        }
    }
}
