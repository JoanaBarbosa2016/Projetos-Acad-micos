/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DataAccessObject.CursoDataAccessObject;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Curso;

/**
 *
 * @author Joana
 */

public class JFrameBuscarCurso extends javax.swing.JFrame {
    CursoDataAccessObject curso = new CursoDataAccessObject();
  
    /**
     * Creates new form JFrameBuscarCurso
     */
    public JFrameBuscarCurso() {
        initComponents();
         try {
            ArrayList<Curso> cursos = curso.listarCursos("");
            for(Curso c : cursos){
                DefaultTableModel model = (DefaultTableModel) jTableCurso.getModel();
                Object linha[] = new Object[]{c.getNomeCurso(),c.getCodigoCurso(), c.getCargaHoraria()};
                model.addRow(linha);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cursos.");
        
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

        jTextFieldObterDados = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCurso = new javax.swing.JTable();
        jLabelDadosdocurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldObterDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObterDadosActionPerformed(evt);
            }
        });

        jTableCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nomeCurso", "codigoCurso", "cargaHoraria"
            }
        ));
        jScrollPane1.setViewportView(jTableCurso);

        jLabelDadosdocurso.setText("    DADOS DO CURSO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                            .addComponent(jTextFieldObterDados)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabelDadosdocurso, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelDadosdocurso)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldObterDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     private void filtrarCursos(java.awt.event.KeyEvent evt) {                                   
        try {
   
            ArrayList<Curso> cursos = curso.listarCursos(jTextFieldObterDados.getText());
            DefaultTableModel limpar = (DefaultTableModel) jTableCurso.getModel();
            limpar.getDataVector().removeAllElements();
            for(Curso c : cursos){
                DefaultTableModel model = (DefaultTableModel) jTableCurso.getModel();
                Object linha[] = new Object[]{c.getNomeCurso(),c.getCodigoCurso(), c.getCargaHoraria()};
                model.addRow(linha);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar cursos.");
        }
    }             
    private void jTextFieldObterDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObterDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObterDadosActionPerformed

     
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
            java.util.logging.Logger.getLogger(JFrameBuscarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBuscarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBuscarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBuscarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBuscarCurso().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDadosdocurso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCurso;
    private javax.swing.JTextField jTextFieldObterDados;
    // End of variables declaration//GEN-END:variables
}
