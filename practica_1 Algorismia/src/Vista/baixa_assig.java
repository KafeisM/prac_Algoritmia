/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.awt.Color;
import static practica_1.algorismia.Practica_1Algorismia.baixaAssig;

/**
 *
 * @author Usuario
 */
public class baixa_assig extends javax.swing.JPanel {

    /**
     * Creates new form alta_curs
     */
    public baixa_assig() {
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

        jLabel1 = new javax.swing.JLabel();
        baixa_ass = new javax.swing.JTextField();
        confirmar_altaCurs = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(590, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BAIXA ASSIGNATURA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 50));

        baixa_ass.setText("Nom de la assignatura");
        baixa_ass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                baixa_assMousePressed(evt);
            }
        });
        baixa_ass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixa_assActionPerformed(evt);
            }
        });
        add(baixa_ass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

        confirmar_altaCurs.setBackground(new java.awt.Color(51, 102, 255));
        confirmar_altaCurs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmar_altaCurs.setForeground(new java.awt.Color(255, 255, 255));
        confirmar_altaCurs.setText("Confirmar");
        confirmar_altaCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_altaCursActionPerformed(evt);
            }
        });
        add(confirmar_altaCurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void baixa_assMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baixa_assMousePressed
        baixa_ass.setText("");
        baixa_ass.setForeground(Color.BLACK);
    }//GEN-LAST:event_baixa_assMousePressed

    private void baixa_assActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixa_assActionPerformed

    }//GEN-LAST:event_baixa_assActionPerformed

    private void confirmar_altaCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_altaCursActionPerformed

        baixaAssig(baixa_ass.getText());
    }//GEN-LAST:event_confirmar_altaCursActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baixa_ass;
    private javax.swing.JButton confirmar_altaCurs;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
