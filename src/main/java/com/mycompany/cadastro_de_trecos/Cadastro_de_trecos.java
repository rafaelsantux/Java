/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastro_de_trecos;

import java.sql.SQLException;

public class Cadastro_de_trecos extends AppSetup {

    public static void main(String[] args) {
        clearScreen();
        mainMenu();
    }

    // Método que exibe o menu principal.
    public static void mainMenu() {

        System.out.println( appName + '\n');
        System.out.println("Menu:");
        System.out.println("\t[1] Listar todos");
        System.out.println("\t[2] Listar");
        System.out.println("\t[3] Novo");
        System.out.println("\t[4] Editar");
        System.out.println("\t[5] Apagar");
        System.out.println("\t[0] Sair");
        System.out.print("\nOpção: ");

        // Recebe a opção do teclado.
        String option = scanner.next();

        // Executa um método conforme a opção escolhida.
        switch (option) {
            case "0" ->
                exitProgram();
            case "1" ->
                listAll();
            case "2" ->
                listOne();
            case "3" ->
                newThing();
            case "4" ->
                editThing();
            case "5" ->
                deleteThing();
            default ->
                reloadMenu();
        }
    }

    // Encerra o programa.
    public static void exitProgram() {
        scanner.close();
        clearScreen();
        System.out.println("\n\nFui!\n\n");
        System.exit(0);
    }

    // Lista todos os trecos cadastrados.
    public static void listAll() {

      
    }

    // Lista um treco específico pelo Id.
    public static void listOne() {
    }

    // Cadastra um novo treco.
    public static void newThing() {
    }

    // Edita um treco pelo Id.
    public static void editThing() {
    }

    // Apaga um treco pelo Id.
    public static void deleteThing() {
    }

    // Recarrega o menu principal.
    public static void reloadMenu() {
        clearScreen(); // Limpa o terminal.
        System.out.println("Oooops! Opção inválida!\n");
        mainMenu();    // Mostra o menu.
    }

    // Limpa a tela do terminal.
    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }

}
