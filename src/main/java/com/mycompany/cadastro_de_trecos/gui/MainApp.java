
package com.mycompany.cadastro_de_trecos.gui;

import com.mycompany.cadastro_de_trecos.db.DbConnection;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class MainApp extends javax.swing.JFrame {

 
    public MainApp() {
        initComponents();
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        cardListAll = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListAll = new javax.swing.JTable();
        cardIdList = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cardRegister = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cardEdit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cardDelete = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        listAllButton = new javax.swing.JButton();
        idListButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        eraseButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Trecos");
        setPreferredSize(new java.awt.Dimension(640, 480));

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Cadastro de trecos");

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("listar todos");

        tableListAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ));
        tableListAll.setShowGrid(true);
        jScrollPane1.setViewportView(tableListAll);
        if (tableListAll.getColumnModel().getColumnCount() > 0) {
            tableListAll.getColumnModel().getColumn(0).setMinWidth(40);
            tableListAll.getColumnModel().getColumn(0).setPreferredWidth(40);
            tableListAll.getColumnModel().getColumn(0).setMaxWidth(100);
            tableListAll.getColumnModel().getColumn(1).setMinWidth(50);
            tableListAll.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableListAll.getColumnModel().getColumn(1).setMaxWidth(300);
            tableListAll.getColumnModel().getColumn(2).setMinWidth(100);
            tableListAll.getColumnModel().getColumn(2).setPreferredWidth(500);
            tableListAll.getColumnModel().getColumn(2).setMaxWidth(600);
        }

        javax.swing.GroupLayout cardListAllLayout = new javax.swing.GroupLayout(cardListAll);
        cardListAll.setLayout(cardListAllLayout);
        cardListAllLayout.setHorizontalGroup(
            cardListAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardListAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardListAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addGroup(cardListAllLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardListAllLayout.setVerticalGroup(
            cardListAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardListAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(cardListAll, "cardListAll");

        jLabel2.setText("listar pelo id");

        javax.swing.GroupLayout cardIdListLayout = new javax.swing.GroupLayout(cardIdList);
        cardIdList.setLayout(cardIdListLayout);
        cardIdListLayout.setHorizontalGroup(
            cardIdListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardIdListLayout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(272, 272, 272))
        );
        cardIdListLayout.setVerticalGroup(
            cardIdListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardIdListLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        mainPanel.add(cardIdList, "cardIdList");

        jLabel3.setText("cadastrar");

        javax.swing.GroupLayout cardRegisterLayout = new javax.swing.GroupLayout(cardRegister);
        cardRegister.setLayout(cardRegisterLayout);
        cardRegisterLayout.setHorizontalGroup(
            cardRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardRegisterLayout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(204, 204, 204))
        );
        cardRegisterLayout.setVerticalGroup(
            cardRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardRegisterLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel3)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        mainPanel.add(cardRegister, "cardRegister");

        jLabel4.setText("editar");

        javax.swing.GroupLayout cardEditLayout = new javax.swing.GroupLayout(cardEdit);
        cardEdit.setLayout(cardEditLayout);
        cardEditLayout.setHorizontalGroup(
            cardEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardEditLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel4)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        cardEditLayout.setVerticalGroup(
            cardEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardEditLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel4)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        mainPanel.add(cardEdit, "cardEdit");

        jLabel5.setText("apagar");

        javax.swing.GroupLayout cardDeleteLayout = new javax.swing.GroupLayout(cardDelete);
        cardDelete.setLayout(cardDeleteLayout);
        cardDeleteLayout.setHorizontalGroup(
            cardDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardDeleteLayout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(247, 247, 247))
        );
        cardDeleteLayout.setVerticalGroup(
            cardDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDeleteLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel5)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        mainPanel.add(cardDelete, "cardDelete");

        listAllButton.setText("Listar todos");
        listAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllButtonActionPerformed(evt);
            }
        });

        idListButton.setText("Listar pelo ID");
        idListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idListButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Cadastrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        editButton.setText("Editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        eraseButton.setText("Apagar");
        eraseButton.setName("Cadastro de Trecos"); // NOI18N
        eraseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Sair");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(listAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idListButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(eraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listAllButton)
                    .addComponent(idListButton)
                    .addComponent(registerButton)
                    .addComponent(editButton)
                    .addComponent(eraseButton)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(656, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();        // TODO add your handling code here:
        card.show(mainPanel, "cardRegister");// TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
        int option = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja sair?",
                "Oooops!",
                YES_NO_OPTION
        );
        if (option == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();        // TODO add your handling code here:
        card.show(mainPanel, "cardEdit");// TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void listAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllButtonActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();        // TODO add your handling code here:
        card.show(mainPanel, "cardListAll");
    }//GEN-LAST:event_listAllButtonActionPerformed

    private void idListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idListButtonActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();        // TODO add your handling code here:
        card.show(mainPanel, "cardIdList");// TODO add your handling code here:
    }//GEN-LAST:event_idListButtonActionPerformed

    private void eraseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseButtonActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();        // TODO add your handling code here:
        card.show(mainPanel, "cardDelete");// TODO add your handling code here:
    }//GEN-LAST:event_eraseButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
                listAll();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardDelete;
    private javax.swing.JPanel cardEdit;
    private javax.swing.JPanel cardIdList;
    private javax.swing.JPanel cardListAll;
    private javax.swing.JPanel cardRegister;
    private javax.swing.JButton editButton;
    private javax.swing.JButton eraseButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton idListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listAllButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton registerButton;
    private static javax.swing.JTable tableListAll;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

public static void listAll() {
        try {
            String sql = "SELECT * FROM things";
            Connection conn = DbConnection.dbConnect();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            DefaultTableModel model = (DefaultTableModel) tableListAll.getModel();
            model.setNumRows(0);

            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("name"),
                    res.getString("description")
                });
            }
            
            DbConnection.dbClose(res, stmt, null, conn);

        } catch (SQLException error) {
            // Tratamento de erros.
            System.out.println("Oooops! " + error.getMessage());
            System.exit(0);
        }
    }




}

