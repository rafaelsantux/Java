package com.mycompany.cadastro_de_trecos.crud;

import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.clearScreen;
import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.exitProgram;
import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.mainMenu;
import static com.mycompany.cadastro_de_trecos.crud.Delete.delete;
import com.mycompany.cadastro_de_trecos.db.DbConnection;
import com.mycompany.cadastro_de_trecos.setup.AppSetup;
import java.sql.SQLException;

public class Changes extends AppSetup {

    public static void change() {

        // Reserva recursos para o banco de dados.
        int id = 0;
        String sql;

        // Cabeçalho da seção.
        System.out.println(appName + "\n" + appSep);
        System.out.println("Bloquear ou ativar um registro");
        System.out.println(appSep);

        try {

            // Recebe o Id do teclado.
            System.out.print("Digite o ID ou [0] para bloquear ou ativar um registro: ");
            id = Integer.parseInt(scanner.next());
            if (id == 0) {
                clearScreen();
                mainMenu();
            }
        } catch (NumberFormatException e) {

            // Quando opção é inválida.
            clearScreen();
            System.out.println("Oooops! Opção inválida!\n");
            delete();
        }

        try {

            // Verifica se o registro existe.
            sql = "SELECT * FROM " + DBTABLES + " WHERE id = ? AND status != '0'";
            conn = DbConnection.dbConnect();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            res = pstm.executeQuery();

            if (res.next()) {

                String sepDH[] = res.getString("data").split(" ");
                String sepD[] = sepDH[0].split("-");
                String novoDH = sepD[2] + "/" + sepD[1] + "/" + sepD[0] + " " + sepDH[1];
                String nStatus;
                String nbStatus;
                if (res.getString("status").equals("1")) {
                    nStatus = "BLOQUEADO";
                    nbStatus = "2";
                } else {
                    nStatus = "ATIVADO";
                    nbStatus = "1";
                }
                // Exibe registro na view.
                System.out.println(
                        "\nID: " + res.getString("id") + "\n"
                        + "  Nome: " + res.getString("nome") + "\n"
                        + "  Descrição: " + res.getString("descricao") + "\n"
                        + "  Localização: " + res.getString("localizacao") + "\n"
                        + "  Status: " + nStatus + "\n"
                        + "  Data: " + novoDH + "\n"
                );

                if (nbStatus.equals("2")) {
                    System.out.println("Deseja ativar o registro? [s/N]: ");
                } else {
                    System.out.println("Deseja bloquear o registro? [s/N]: ");
                }
                if (scanner.next().trim().toLowerCase().equals("s")) {

                    sql = "UPDATE " + DBTABLES + " SET status = ? WHERE id = ? ";
                    pstm = conn.prepareStatement(sql);
                    pstm.setInt(2, id);
                    pstm.setString(1, nbStatus);
                    if (pstm.executeUpdate() == 1) {
                        // Registro bloqueado.
                        if (nbStatus.equals("2")) {
                            System.out.println("\nRegistro ativado!");
                        } else {
                            System.out.println("\nRegistro bloqueado!");
                        }
                    } else {
                        System.out.println("Oooops! Algo deu errado!");
                    }
                } else {
                    System.out.println("\nNada aconteceu!");
                }

            } else {
                clearScreen();
                System.out.println("Oooops! Não achei nada!\n");
                change();
            }

            // Fecha banco de dados.
            DbConnection.dbClose(res, stmt, pstm, conn);

            // Menu inferior da seção.
            System.out.println(appSep);
            System.out.println("Menu:\n\t[1] Menu principal\n\t[2] Alterar outro\n\t[0] Sair");
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
                    change();
                }
                default -> {
                    clearScreen();
                    System.out.println("Oooops! Opção inválida!\n");
                    delete();
                }
            }

        } catch (SQLException error) {

            // Tratamento de erros.
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }

    }

}
