/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.estructuradedatos2026;

import java.util.ArrayDeque;
import java.util.Deque;
import javax.swing.JOptionPane;


public class Pila_de_frutas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Pila_de_frutas.class.getName());

    Deque<String> pilaFrutas;
    
    public Pila_de_frutas() {
        initComponents();
        
        pilaFrutas = new ArrayDeque();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNuevaFruta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnApilar = new javax.swing.JButton();
        lblTexto = new javax.swing.JLabel();
        btnDesapilar = new javax.swing.JButton();
        btnVerCima = new javax.swing.JButton();
        lblCantidadFrutas = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("         PILA DE FRUTAS");

        txtNuevaFruta.addActionListener(this::txtNuevaFrutaActionPerformed);
        txtNuevaFruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNuevaFrutaKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Apilar fruta:");

        btnApilar.setBackground(new java.awt.Color(0, 255, 102));
        btnApilar.setText("APILAR");
        btnApilar.addActionListener(this::btnApilarActionPerformed);

        lblTexto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(0, 153, 153));
        lblTexto.setText("Frutas en la pila: ");

        btnDesapilar.setBackground(new java.awt.Color(0, 255, 102));
        btnDesapilar.setText("DESAPILAR");
        btnDesapilar.addActionListener(this::btnDesapilarActionPerformed);

        btnVerCima.setBackground(new java.awt.Color(0, 255, 102));
        btnVerCima.setText("VER CIMA");
        btnVerCima.addActionListener(this::btnVerCimaActionPerformed);

        lblCantidadFrutas.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerCima, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesapilar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnApilar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevaFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(txtNuevaFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnApilar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnVerCima)
                .addGap(18, 18, 18)
                .addComponent(btnDesapilar)
                .addContainerGap(113, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtNuevaFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaFrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaFrutaActionPerformed

    private void btnDesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesapilarActionPerformed
    
        String frutaDesapilada = pilaFrutas.pop();
        JOptionPane.showMessageDialog(this, frutaDesapilada, "FRUTA DESAPILADA", 1);
        lblCantidadFrutas.setText(pilaFrutas.size()+"");
        
        
    }//GEN-LAST:event_btnDesapilarActionPerformed

    private void btnVerCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCimaActionPerformed
        
    JOptionPane.showMessageDialog(this, pilaFrutas.peek(), "CIMA DE LA PILA", 1);
        
    }//GEN-LAST:event_btnVerCimaActionPerformed

    private void btnApilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApilarActionPerformed
    String nuevaFruta = txtNuevaFruta.getText();
    
    pilaFrutas.push(nuevaFruta);
    
    lblCantidadFrutas.setText(pilaFrutas.size()+"");
    txtNuevaFruta.setText("");
    txtNuevaFruta.requestFocusInWindow();
            
    }//GEN-LAST:event_btnApilarActionPerformed

    private void txtNuevaFrutaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevaFrutaKeyReleased
    
        int teclaCode = evt.getKeyCode();
        if(teclaCode == 10){
            btnApilar.doClick();
        }
        
    }//GEN-LAST:event_txtNuevaFrutaKeyReleased

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Pila_de_frutas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApilar;
    private javax.swing.JButton btnDesapilar;
    private javax.swing.JButton btnVerCima;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCantidadFrutas;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JTextField txtNuevaFruta;
    // End of variables declaration//GEN-END:variables
}
