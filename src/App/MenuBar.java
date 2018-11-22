package App;

import mySQL.MyConnection;

public class MenuBar extends javax.swing.JFrame {

    MyConnection conexao = new MyConnection();

    /**
     * Creates new form MenuBar
     */

    public MenuBar() {
        initComponents();
        conexao.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        btnEditaCliente = new javax.swing.JMenuItem();
        btnDeletaCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadastroJogo = new javax.swing.JMenuItem();
        consultaJogo = new javax.swing.JMenuItem();
        btnEditarJogo = new javax.swing.JMenuItem();
        btnDeletarJogo = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jLabel2.setText("jLabel2");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(128, 0, 128));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nClique na aba de \"Menu\" <br/><br/>\nacima para navegar entre as telas.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jMenu5.setText("Arquivo");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jCheckBoxMenuItem1.setLabel("Sair");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jMenuItem1.setLabel("Cadastrar Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setLabel("Consultar Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        btnEditaCliente.setText("Editar Cliente");
        btnEditaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(btnEditaCliente);

        btnDeletaCliente.setText("Deletar Cliente");
        btnDeletaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaClienteActionPerformed(evt);
            }
        });
        jMenu1.add(btnDeletaCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Jogos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        cadastroJogo.setText("Cadastrar Jogo");
        cadastroJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroJogoActionPerformed(evt);
            }
        });
        jMenu2.add(cadastroJogo);

        consultaJogo.setText("Consultar Jogo");
        consultaJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaJogoActionPerformed(evt);
            }
        });
        jMenu2.add(consultaJogo);

        btnEditarJogo.setText("Editar Jogo");
        btnEditarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarJogoActionPerformed(evt);
            }
        });
        jMenu2.add(btnEditarJogo);

        btnDeletarJogo.setText("Deletar Jogo");
        btnDeletarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarJogoActionPerformed(evt);
            }
        });
        jMenu2.add(btnDeletarJogo);

        jMenuBar1.add(jMenu2);

        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jMenu6.setLabel("Funcionários");

        jMenuItem2.setLabel("Cadastro de Funcionário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem4.setText("Consulta de Funcionário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem5.setText("Editar um Funcionário");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Deletar um Funcionário");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        CadastroCliente obj = new CadastroCliente();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        Login obj = new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConsultaCliente obj = new ConsultaCliente();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void cadastroJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroJogoActionPerformed
        CadastroJogo obj = new CadastroJogo();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_cadastroJogoActionPerformed

    private void consultaJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaJogoActionPerformed
        ConsultaJogo obj = new ConsultaJogo();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_consultaJogoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CadastroFunc obj = new CadastroFunc();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ConsultaFunc obj = new ConsultaFunc();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        EditaFunc obj = new EditaFunc();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DeletaFunc obj = new DeletaFunc();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void btnEditaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaClienteActionPerformed
        EditaCliente obj = new EditaCliente();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnEditaClienteActionPerformed

    private void btnDeletaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaClienteActionPerformed
        DeletaCliente obj = new DeletaCliente();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnDeletaClienteActionPerformed

    private void btnEditarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarJogoActionPerformed
        EditaJogo obj = new EditaJogo();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnEditarJogoActionPerformed

    private void btnDeletarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarJogoActionPerformed
        DeletaJogo obj = new DeletaJogo();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDeletarJogoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnDeletaCliente;
    private javax.swing.JMenuItem btnDeletarJogo;
    private javax.swing.JMenuItem btnEditaCliente;
    private javax.swing.JMenuItem btnEditarJogo;
    private javax.swing.JMenuItem cadastroJogo;
    private javax.swing.JMenuItem consultaJogo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
