/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controle.ArquivoTexto;
import controle.CriarSenha;
import controle.ValidateFields;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author julio
 */
public class Registrar extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList<String> usu = new ArrayList();
    ArquivoTexto reg = new ArquivoTexto();
    CriarSenha c = new CriarSenha();
    ValidateFields v = new ValidateFields();
    Usuario u = new Usuario();
    public Registrar() {
        setResizable(false);
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCadUsu = new javax.swing.JPanel();
        LabelCadUsu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textNome1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        textSobrenome1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textCSenha = new javax.swing.JPasswordField();
        textSenha = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        textJogoFavorito = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        buttonCadastrarUsuario1 = new javax.swing.JButton();
        ComboBoxGen = new javax.swing.JComboBox<>();
        MenuBarPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemNewUsu = new javax.swing.JMenuItem();
        MenuItemNewAva = new javax.swing.JMenuItem();
        MenuItemNewJogo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemEditUsu = new javax.swing.JMenuItem();
        MenuItemEditAva = new javax.swing.JMenuItem();
        MenuItemEditJogo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCadUsu.setBackground(new java.awt.Color(236, 239, 249));

        LabelCadUsu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelCadUsu.setText("CADASTRAR USUÁRIO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nome*:");

        textNome1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textNome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNome1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Sobrenome*:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Email*:");

        textEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        textSobrenome1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Senha*:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Confirme a senha*:");

        textCSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCSenhaActionPerformed(evt);
            }
        });

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Genero Favorito:");

        textJogoFavorito.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textJogoFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textJogoFavoritoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Jogo Favorito:");

        buttonCadastrarUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b8013d3077f62d29bce2664db69424.png"))); // NOI18N
        buttonCadastrarUsuario1.setToolTipText("Cadastrar");
        buttonCadastrarUsuario1.setAutoscrolls(true);
        buttonCadastrarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarUsuario1ActionPerformed(evt);
            }
        });

        ComboBoxGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "FPS", "Terror", "Ação/Aventura", "RPG", "Plataforma", "Luta", "Corrida", "Esportes" }));
        ComboBoxGen.setPreferredSize(new java.awt.Dimension(74, 25));
        ComboBoxGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxGenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCadUsuLayout = new javax.swing.GroupLayout(PanelCadUsu);
        PanelCadUsu.setLayout(PanelCadUsuLayout);
        PanelCadUsuLayout.setHorizontalGroup(
            PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadUsuLayout.createSequentialGroup()
                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadUsuLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(LabelCadUsu)
                            .addGroup(PanelCadUsuLayout.createSequentialGroup()
                                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(53, 53, 53)
                                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textJogoFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ComboBoxGen, 0, 368, Short.MAX_VALUE)
                                        .addComponent(textCSenha)
                                        .addComponent(textEmail)
                                        .addComponent(textSobrenome1)
                                        .addComponent(textNome1)
                                        .addComponent(textSenha))))))
                    .addGroup(PanelCadUsuLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(buttonCadastrarUsuario1)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        PanelCadUsuLayout.setVerticalGroup(
            PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadUsuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(LabelCadUsu)
                .addGap(18, 18, 18)
                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PanelCadUsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJogoFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(buttonCadastrarUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jMenu1.setText("Novo");

        MenuItemNewUsu.setText("Usuário");
        MenuItemNewUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNewUsuActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemNewUsu);

        MenuItemNewAva.setText("Avaliação");
        MenuItemNewAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNewAvaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemNewAva);

        MenuItemNewJogo.setText("Jogo");
        MenuItemNewJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNewJogoActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemNewJogo);

        MenuBarPrincipal.add(jMenu1);

        jMenu2.setText("Editar");

        MenuItemEditUsu.setText("Usuário");
        MenuItemEditUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEditUsuActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemEditUsu);

        MenuItemEditAva.setText("Avaliação");
        jMenu2.add(MenuItemEditAva);

        MenuItemEditJogo.setText("Jogo");
        jMenu2.add(MenuItemEditJogo);

        MenuBarPrincipal.add(jMenu2);

        jMenu3.setText("Sobre");
        MenuBarPrincipal.add(jMenu3);

        setJMenuBar(MenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelCadUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelCadUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemNewUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNewUsuActionPerformed
        
    }//GEN-LAST:event_MenuItemNewUsuActionPerformed

    private void MenuItemEditUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEditUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemEditUsuActionPerformed

    private void MenuItemNewAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNewAvaActionPerformed
        
    }//GEN-LAST:event_MenuItemNewAvaActionPerformed

    private void MenuItemNewJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNewJogoActionPerformed
        
    }//GEN-LAST:event_MenuItemNewJogoActionPerformed

    private void textNome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNome1ActionPerformed

    private void textCSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCSenhaActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    private void textJogoFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textJogoFavoritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textJogoFavoritoActionPerformed

    private void buttonCadastrarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarUsuario1ActionPerformed
        
        u.setNome(textNome1.getText());
        u.setSobrenome(textSobrenome1.getText());
        u.setEmail(textEmail.getText());
        u.setSenha(textSenha.getText().toString());
        u.setcSenha(textCSenha.getText().toString());
        u.setGenero(ComboBoxGen.getModel().getSelectedItem().toString());
        u.setFavorito(textJogoFavorito.getText());
        if(v.emptyFields(u.getNome(), u.getSobrenome(), u.getEmail(), u.getSenha(), u.getcSenha())){
            try {
                if(c.CompareSenha()){
                    
                    reg.criaArquivo("usuarios");
                    
                    new Login().setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não conferem");
                    textSenha.setText("");
                    textCSenha.setText(""); 
                }
            } catch (IOException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonCadastrarUsuario1ActionPerformed

    private void ComboBoxGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxGenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxGenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FontFormatException, IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxGen;
    private javax.swing.JLabel LabelCadUsu;
    private javax.swing.JMenuBar MenuBarPrincipal;
    private javax.swing.JMenuItem MenuItemEditAva;
    private javax.swing.JMenuItem MenuItemEditJogo;
    private javax.swing.JMenuItem MenuItemEditUsu;
    private javax.swing.JMenuItem MenuItemNewAva;
    private javax.swing.JMenuItem MenuItemNewJogo;
    private javax.swing.JMenuItem MenuItemNewUsu;
    private javax.swing.JPanel PanelCadUsu;
    private javax.swing.JButton buttonCadastrarUsuario1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPasswordField textCSenha;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textJogoFavorito;
    private javax.swing.JTextField textNome1;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textSobrenome1;
    // End of variables declaration//GEN-END:variables
}
