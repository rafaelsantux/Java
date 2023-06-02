package com.mycompany.cadastro_de_trecos;

import com.mycompany.cadastro_de_trecos.crud.Changes;
import com.mycompany.cadastro_de_trecos.setup.AppSetup;
import com.mycompany.cadastro_de_trecos.crud.Read;
import com.mycompany.cadastro_de_trecos.crud.Create;
import com.mycompany.cadastro_de_trecos.crud.Delete;
import com.mycompany.cadastro_de_trecos.crud.Search;
import com.mycompany.cadastro_de_trecos.crud.Update;

public class Cadastro_de_trecos extends AppSetup {

    public static void main(String[] args) {
        clearScreen();
        mainMenu();
    }

    // Método que exibe o menu principal.
    public static void mainMenu() {

        System.out.println(appName + "\n" + appSep);
        System.out.println("Menu:");
        System.out.println("\t[1] Listar todos");
        System.out.println("\t[2] Listar");
        System.out.println("\t[3] Novo");
        System.out.println("\t[4] Editar");
        System.out.println("\t[5] Apagar");
        System.out.println("\t[6] Pesquisar");
        System.out.println("\t[7] Bloquear/Desbloquear");
        System.out.println("\t[0] Sair");
        System.out.println(appSep);
        System.out.print("Opção: ");

        // Recebe a opção do teclado.
        String option = scanner.next();

        // Executa um método conforme a opção escolhida.
        switch (option) {
            case "0":
                exitProgram();
                break;
            case "1":
                clearScreen();
                Read.readAll();
                break;
            case "2":
                clearScreen();
                Read.read();
                break;
            case "3":
                clearScreen();
                Create.create();
                break;
            case "4":
                clearScreen();
                Update.update();
                break;
            case "5":
                clearScreen();
                Delete.delete();
                break;
            
            case "6":
                clearScreen();
                Search.search();
                break;
            case "7":
                clearScreen();
                Changes.change();
                break;

            default:
                clearScreen();
                System.out.println("Opção inválida.\n");
                mainMenu();
        }
    }

    // Encerra o programa.
    public static void exitProgram() {
        scanner.close();
        clearScreen();
        System.out.println("\n\nFui!\n\n");
        System.exit(0);
    }

    // Limpa a tela do terminal.
    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }

}
