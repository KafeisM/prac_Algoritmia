
package Vista;

import Cursos.Enum_Cursos;
import static Cursos.Enum_Cursos.PRIMER;
import static Cursos.Enum_Cursos.SEGON;
import Cursos.Enum_Especialitats;
import static Cursos.Enum_Especialitats.ELECTRÓNICA;
import static Cursos.Enum_Especialitats.INFORMÀTICA;
import static Cursos.Enum_Especialitats.MECÀNICA;
import java.awt.Color;
import javax.swing.JOptionPane;
import static practica_1.algorismia.Practica_1Algorismia.altaCurs;

/**
 *
 * @author Usuario
 */
public class alta_curs extends javax.swing.JPanel {
    boolean esFP = false;
    /**
     * Creates new form alta_curs
     */
    public alta_curs() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        nom_curs = new javax.swing.JTextField();
        codi = new javax.swing.JTextField();
        batx = new javax.swing.JRadioButton();
        fp = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        anyBatx = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        especialitat = new javax.swing.JList<>();
        confirmar_altaCurs = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(590, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DOANR ALTA CURS:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 50));

        nom_curs.setText("Nom del Curs");
        nom_curs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nom_cursMousePressed(evt);
            }
        });
        nom_curs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_cursActionPerformed(evt);
            }
        });
        add(nom_curs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

        codi.setText("Codi del Curs");
        codi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                codiMousePressed(evt);
            }
        });
        codi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codiActionPerformed(evt);
            }
        });
        add(codi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));

        batx.setBackground(new java.awt.Color(255, 255, 255));
        batx.setForeground(new java.awt.Color(0, 0, 0));
        batx.setText("Batxiller");
        batx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batxActionPerformed(evt);
            }
        });
        add(batx, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        fp.setBackground(new java.awt.Color(255, 255, 255));
        fp.setForeground(new java.awt.Color(0, 0, 0));
        fp.setText("Formació profesinal");
        fp.setBorder(null);
        fp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpActionPerformed(evt);
            }
        });
        add(fp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        anyBatx.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Primer", "Segon" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(anyBatx);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 80, 40));

        especialitat.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mècanica", "Electrònica", "Informàtica" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(especialitat);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 80, 60));

        confirmar_altaCurs.setBackground(new java.awt.Color(51, 102, 255));
        confirmar_altaCurs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmar_altaCurs.setForeground(new java.awt.Color(255, 255, 255));
        confirmar_altaCurs.setText("Confirmar");
        confirmar_altaCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_altaCursActionPerformed(evt);
            }
        });
        add(confirmar_altaCurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 120, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void nom_cursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_cursActionPerformed
        
    }//GEN-LAST:event_nom_cursActionPerformed

    private void codiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codiActionPerformed
        
    }//GEN-LAST:event_codiActionPerformed

    private void batxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batxActionPerformed

    }//GEN-LAST:event_batxActionPerformed

    private void fpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpActionPerformed

    }//GEN-LAST:event_fpActionPerformed

    private void confirmar_altaCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_altaCursActionPerformed
 
        String nom = nom_curs.getText();
        int cod = Integer.parseInt(codi.getText());

        //assignar enums
        Enum_Especialitats esp = null;
        Enum_Cursos any = null;

        if (fp.isSelected() & batx.isSelected()) {
            JOptionPane.showMessageDialog(null, "ERROR");

        } else {
            if (fp.isSelected()) {
                esFP = true;
                switch (especialitat.getSelectedValue()) {
                    case "Mecànica":
                        esp = MECÀNICA;
                        break;
                    case "Electrònica":
                        esp = ELECTRÓNICA;
                        break;
                    case "Informàtica":
                        esp = INFORMÀTICA;
                        break;
                }
            } else if (batx.isSelected()) {
                esFP = false;
                switch (anyBatx.getSelectedValue()) {
                    case "Primer":
                        any = PRIMER;
                        break;
                    case "Segon":
                        any = SEGON;
                        break;
                }
            }

            altaCurs(nom, cod, esp, any, esFP);
        }

        
    }//GEN-LAST:event_confirmar_altaCursActionPerformed

    private void nom_cursMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nom_cursMousePressed
       nom_curs.setText("");
       nom_curs.setForeground(Color.BLACK);
    }//GEN-LAST:event_nom_cursMousePressed

    private void codiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codiMousePressed
        codi.setText("");
        codi.setForeground(Color.BLACK);
    }//GEN-LAST:event_codiMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> anyBatx;
    private javax.swing.JRadioButton batx;
    private javax.swing.JTextField codi;
    private javax.swing.JButton confirmar_altaCurs;
    private javax.swing.JList<String> especialitat;
    private javax.swing.JRadioButton fp;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nom_curs;
    // End of variables declaration//GEN-END:variables
}
