package com.mycompany.cadastro_de_trecos;

import static com.mycompany.cadastro_de_trecos.AppSetup.conn;
import static com.mycompany.cadastro_de_trecos.AppSetup.pstm;
import static com.mycompany.cadastro_de_trecos.AppSetup.res;
import static com.mycompany.cadastro_de_trecos.AppSetup.scanner;
import static com.mycompany.cadastro_de_trecos.AppSetup.stmt;
import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.clearScreen;
import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.exitProgram;
import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.mainMenu;
import static com.mycompany.cadastro_de_trecos.Cadastro_de_trecos.reloadMenu;
import java.sql.SQLException;

public class Read extends AppSetup{
    
    public static void readAll(){try {
            String sql = "SELECT * FROM things";
            conn = DbConnection.dbConnect();
            stmt = conn.createStatement();
            res = stmt.executeQuery(sql);

            System.out.println(" ");
            while (res.next()) {
                System.out.println(
                        "ID: " + res.getString("id") + "\n"
                        + "Nome: " + res.getString("name") + "\n"
                        + "Descrição: " + res.getString("description") + "\n"
                );
            }

            DbConnection.dbClose(res, stmt, pstm, conn);

            System.out.println("Menu:\n\t[1] Menu principal\n\t[0] Sair\n");
            System.out.print("Opção: ");

            String option = scanner.next();

            switch (option) {
                case "0" ->
                    exitProgram();
                case "1" -> {
                    clearScreen();
                    mainMenu();
                }
                default ->
                    reloadMenu();
            }

        } catch (SQLException error) {
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }

        
        
    }
    
    
}
