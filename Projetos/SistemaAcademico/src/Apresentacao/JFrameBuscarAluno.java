/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemaacademico.Persistencia;
import javax.swing.table.DefaultTableModel;
import sistemaacademico.Aluno;


/**
 *
 * @author Joana
 */
public class JFrameBuscarAluno extends javax.swing.JFrame {


    /**
     * Creates new form JFrameBuscarAluno
     */
    public JFrameBuscarAluno() {
        initComponents();
         try {
            Persistencia persistir = new Persistencia();
            ArrayList<Aluno> alunos = persistir.listarAlunos("");
            for(Aluno aluno : alunos){
                DefaultTableModel model = (DefaultTableModel) jTableAluno.getModel();
                Object linha[] = new Object[]{ aluno.getNome(),aluno.getCodigo(), aluno.getCpf()};
                model.addRow(linha);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos.");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();
        jTextFieldObterDados1 = new javax.swing.JTextField();
        jLabelDadosdoaluno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome ", "Código ", "Cpf"
            }
        ));
        jScrollPane1.setViewportView(jTableAluno);

        jTextFieldObterDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObterDados1ActionPerformed(evt);
            }
        });

        jLabelDadosdoaluno.setText("DADOS DO ALUNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldObterDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabelDadosdoaluno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDadosdoaluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldObterDados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldObterDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObterDados1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObterDados1ActionPerformed

    
     private void filtrarAlunos(java.awt.event.KeyEvent evt) {                             
        try {
            Persistencia persistir = new Persistencia();
            ArrayList<Aluno> alunos = persistir.listarAlunos(jTextFieldObterDados1.getText());
            DefaultTableModel limpar = (DefaultTableModel) jTableAluno.getModel();
            limpar.getDataVector().removeAllElements();
            for(Aluno aluno : alunos){
                DefaultTableModel model = (DefaultTableModel) jTableAluno.getModel();
                Object linha[] = new Object[]{ aluno.getNome(),aluno.getCodigo(), aluno.getCpf()};
                model.addRow(linha);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos.");
        }
     }
   
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
            java.util.logging.Logger.getLogger(JFrameBuscarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBuscarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBuscarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBuscarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBuscarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDadosdoaluno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldObterDados1;
    // End of variables declaration//GEN-END:variables
}
