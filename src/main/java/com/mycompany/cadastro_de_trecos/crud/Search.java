package com.mycompany.cadastro_de_trecos.crud;

// Lista um único registro pelo id.

import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.clearScreen;
import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.exitProgram;
import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.mainMenu;
import com.mycompany.cadastro_de_trecos.db.DbConnection;
import com.mycompany.cadastro_de_trecos.setup.AppSetup;
import java.sql.SQLException;


public class Search extends AppSetup {  
      
public static void search() {

        // Reserva recursos para o banco de dados.
        String pesquisa = "";
        String sql = "";

        // Cabeçalho da seção.
        System.out.println(appName + "\n" + appSep);
        System.out.println("Lista um registro");
        System.out.println(appSep);

        try {

            // Recebe o Id do teclado.
            System.out.print("Digite uma palavra chave:");
            pesquisa = scanner.next().trim();
            if (pesquisa.equals("")) {
                clearScreen();
                mainMenu();
            }
        } catch (NumberFormatException e) {

            // Quando opção é inválida.
            clearScreen();
            System.out.println("Oooops! Opção inválida!\n");
            search();
        }

        try {

            // Faz consulta no banco de dados usando "preparedStatement".
            sql = "SELECT * FROM " + DBTABLES + " WHERE nome LIKE ? OR descricao LIKE ? OR localizacao LIKE ?";
            conn = DbConnection.dbConnect();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + pesquisa + "%");
            pstm.setString(2, "%" + pesquisa + "%");
            pstm.setString(3, "%" + pesquisa + "%");
            
       
            // Executa a query.
            res = pstm.executeQuery();

            if (res.next()) {

                // Se tem registro, exibe na view.
                System.out.println(
                        "\nID: " + res.getString("id") + "\n"
                        + "  Nome: " + res.getString("nome") + "\n"
                        + "  "
                        + "Descrição: " + res.getString("descricao") + "\n"
                        + "  "
                        + "Localização: " + res.getString("localizacao") + "\n"
                );
            } else {

                // Se não tem registro.
                clearScreen();
                System.out.println("Oooops! Não achei nada!\n");
                search();
            }

            // Fecha banco de dados.
            DbConnection.dbClose(res, stmt, pstm, conn);

            // Menu inferior da seção.
            System.out.println(appSep);
            System.out.println("Menu:\n\t[1] Menu principal\n\t[2] Listar outro\n\t[0] Sair");
            System.out.println(appSep);

            // Recebe opção do teclado.            
            System.out.print("Opção: ");
            String option = scanner.next();

            // Executa conforme a opção.
            switch (option) {
                case "0" ->
                    exitProgram();
                case "1" -> {
                    clearScreen();
                    mainMenu();
                }
                case "2" -> {
                    clearScreen();
                    search();
                }
                default -> {
                    clearScreen();
                    System.out.println("Oooops! Opção inválida!\n");
                    search();
                }
            }
            
            

        } catch (SQLException error) {

            // Tratamento de erros.
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }

    }

}

    

