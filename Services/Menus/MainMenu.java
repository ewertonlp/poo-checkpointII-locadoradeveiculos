package com.CheckpointII.LocadoraDeVeiculos.Services.Menus;

public class MainMenu {
    private String nomeLocadora;

    public MainMenu(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    public void showMainMenu() {
        System.out.println("Navegue pelo menu da locadora " + nomeLocadora);

        System.out.println("1 - Veículos");
        System.out.println("2 - Funcionarios");
        System.out.println("3 - Clientes");
        System.out.println("4 - Locadora");
        System.out.println("5 - Sair");
    }
}
