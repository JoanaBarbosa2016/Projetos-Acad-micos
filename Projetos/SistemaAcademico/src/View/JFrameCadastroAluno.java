/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Joana
 */
public class JFrameCadastroAluno extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCadastroAluno
     */
    public JFrameCadastroAluno() {
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

        jButtonEnviar = new javax.swing.JButton();
        jLabelCodigoAluno = new javax.swing.JLabel();
        jLabelMomealuno = new javax.swing.JLabel();
        jLabelCpfAluno = new javax.swing.JLabel();
        jTextFieldDigitar3 = new javax.swing.JTextField();
        jTextFieldDigitar2 = new javax.swing.JTextField();
        jTextFielddigitar1 = new javax.swing.JTextField();
        jLabelInserir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonEnviar.setText("enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jLabelCodigoAluno.setText("Código do Aluno");

        jLabelMomealuno.setText("Nome do aluno");

        jLabelCpfAluno.setText("Cpf do Aluno");

        jTextFieldDigitar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDigitar3ActionPerformed(evt);
            }
        });

        jTextFieldDigitar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDigitar2ActionPerformed(evt);
            }
        });

        jTextFielddigitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddigitar1ActionPerformed(evt);
            }
        });

        jLabelInserir.setText("Insira os Dados do Aluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMomealuno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCpfAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldDigitar3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldDigitar2)
                        .addComponent(jTextFielddigitar1)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButtonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabelInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMomealuno)
                    .addComponent(jTextFielddigitar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigoAluno)
                            .addComponent(jTextFieldDigitar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCpfAluno)
                        .addComponent(jTextFieldDigitar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(jButtonEnviar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        // TODO add your handling code here:
        try{ //tratamento de erros

            Class.forName("com.mysql.jdbc.Driver");//Driver mysql – Fonte de Dados mysql

            //conecta no BD, as aspas vazias representam o Login: usuário e senha.

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matricula", "root", "");

            Statement stmt = con.createStatement();       //objeto comdo sql

            String nome = jTextFieldDigitar2.getText();  //obtém nome digitado
            String codigo = jTextFielddigitar1.getText(); //obtém codigo digitado
            String cpf= jTextFieldDigitar3.getText();  //obtém horas digitadas

            stmt.executeUpdate("insert into Aluno (nome, codigo,cpf) values ('" + codigo + "','"  + nome +  "','" + cpf+  "')" );

            JOptionPane.showMessageDialog( this, " Dados Salvos! ");

            con.close();  // fecha conexão com BD

        }  catch( SQLException e){ //trata os erros SQL

            JOptionPane.showMessageDialog(this, "Erro Comando SQL " + e.getMessage() );

        } catch( ClassNotFoundException e){      //trata erros de conexão

            JOptionPane.showMessageDialog( this, " Driver não encontrado " );
            
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jTextFieldDigitar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDigitar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDigitar3ActionPerformed

    private void jTextFieldDigitar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDigitar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDigitar2ActionPerformed

    private void jTextFielddigitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddigitar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddigitar1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JLabel jLabelCodigoAluno;
    private javax.swing.JLabel jLabelCpfAluno;
    private javax.swing.JLabel jLabelInserir;
    private javax.swing.JLabel jLabelMomealuno;
    private javax.swing.JTextField jTextFieldDigitar2;
    private javax.swing.JTextField jTextFieldDigitar3;
    private javax.swing.JTextField jTextFielddigitar1;
    // End of variables declaration//GEN-END:variables
}