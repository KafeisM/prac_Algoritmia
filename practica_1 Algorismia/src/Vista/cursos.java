/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.awt.Color;
import static practica_1.algorismia.Practica_1Algorismia.est_assig_Curs;

/**
 *
 * @author Usuario
 */
public class cursos extends javax.swing.JPanel {

    /**
     * Creates new form alta_curs
     */
    public cursos() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        sortida_cursos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cerca_curs = new javax.swing.JTextField();
        confirmar_altaCurs = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(590, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sortida_cursos.setColumns(20);
        sortida_cursos.setRows(5);
        jScrollPane2.setViewportView(sortida_cursos);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 510, 260));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MOSTRAR ASSIGNATURES DE UN CURS:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 50));

        cerca_curs.setText("Nom del Curs");
        cerca_curs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerca_cursMousePressed(evt);
            }
        });
        cerca_curs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerca_cursActionPerformed(evt);
            }
        });
        add(cerca_curs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

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

    private void cerca_cursMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerca_cursMousePressed
        cerca_curs.setText("");
        cerca_curs.setForeground(Color.BLACK);
    }//GEN-LAST:event_cerca_cursMousePressed

    private void cerca_cursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerca_cursActionPerformed

    }//GEN-LAST:event_cerca_cursActionPerformed

    private void confirmar_altaCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_altaCursActionPerformed

       sortida_cursos.setText(est_assig_Curs(cerca_curs.getText()));

    }//GEN-LAST:event_confirmar_altaCursActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cerca_curs;
    private javax.swing.JButton confirmar_altaCurs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea sortida_cursos;
    // End of variables declaration//GEN-END:variables
}
