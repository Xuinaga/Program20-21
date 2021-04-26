/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.FKudeatu;
import model.Terminoa;
import model.TerminoenTableModelaBerria;

/**
 *
 * @author suinaga.jon
 */
public class Itzultzailea extends javax.swing.JFrame {

    /**
     * Creates new form Itzultzailea
     */
    public Itzultzailea() {
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

        inpriFrame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        terminoenTaula = new javax.swing.JTable();
        jLabelIzenburua = new javax.swing.JLabel();
        inputa = new javax.swing.JTextField();
        outputa = new javax.swing.JTextField();
        jLabelInput = new javax.swing.JLabel();
        jLabelOutput = new javax.swing.JLabel();
        jButtonBilatu = new javax.swing.JButton();
        jButtonGehitu = new javax.swing.JButton();
        jButtonInprimatu = new javax.swing.JButton();
        gehituTestua = new javax.swing.JLabel();

        inpriFrame.setSize(new java.awt.Dimension(500, 500));

        terminoenTaula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(terminoenTaula);

        javax.swing.GroupLayout inpriFrameLayout = new javax.swing.GroupLayout(inpriFrame.getContentPane());
        inpriFrame.getContentPane().setLayout(inpriFrameLayout);
        inpriFrameLayout.setHorizontalGroup(
            inpriFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inpriFrameLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        inpriFrameLayout.setVerticalGroup(
            inpriFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inpriFrameLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelIzenburua.setText("Suinagaren Itzultzailea");

        inputa.setToolTipText("");

        outputa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputaActionPerformed(evt);
            }
        });

        jLabelInput.setText("Input");

        jLabelOutput.setText("Output");

        jButtonBilatu.setText("Itzulpena bilatu");
        jButtonBilatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBilatuActionPerformed(evt);
            }
        });

        jButtonGehitu.setText("Itzulpena Gehitu");
        jButtonGehitu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGehituActionPerformed(evt);
            }
        });

        jButtonInprimatu.setText("Hiztegia Ikusi");
        jButtonInprimatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInprimatuActionPerformed(evt);
            }
        });

        gehituTestua.setText("Hitz berria ondo gehitu da!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabelIzenburua)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInput)
                            .addComponent(inputa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(outputa, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jButtonBilatu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelOutput)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gehituTestua)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonGehitu, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jButtonInprimatu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIzenburua)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInput)
                    .addComponent(jLabelOutput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBilatu))
                .addGap(25, 25, 25)
                .addComponent(jButtonGehitu)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInprimatu)
                    .addComponent(gehituTestua))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outputaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputaActionPerformed

    private void jButtonBilatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBilatuActionPerformed
        Terminoa itzulpena = FKudeatu.bilatu(inputa.getText());
        if (itzulpena != null) {
            outputa.setText(itzulpena.getGaztelera());
        } else {
            outputa.setText("Hitza ez dago");
        }

    }//GEN-LAST:event_jButtonBilatuActionPerformed

    private void jButtonInprimatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInprimatuActionPerformed
        terminoenTaula.setModel(new TerminoenTableModelaBerria());
        inpriFrame.setVisible(true);

    }//GEN-LAST:event_jButtonInprimatuActionPerformed

    private void jButtonGehituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGehituActionPerformed
        Terminoa tGehitu = new Terminoa(inputa.getText(), outputa.getText());
        FKudeatu.gehitu(tGehitu);
        gehituTestua.setVisible(true);
    }//GEN-LAST:event_jButtonGehituActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        gehituTestua.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Itzultzailea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Itzultzailea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Itzultzailea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Itzultzailea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Itzultzailea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gehituTestua;
    private javax.swing.JFrame inpriFrame;
    private javax.swing.JTextField inputa;
    private javax.swing.JButton jButtonBilatu;
    private javax.swing.JButton jButtonGehitu;
    private javax.swing.JButton jButtonInprimatu;
    private javax.swing.JLabel jLabelInput;
    private javax.swing.JLabel jLabelIzenburua;
    private javax.swing.JLabel jLabelOutput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField outputa;
    private javax.swing.JTable terminoenTaula;
    // End of variables declaration//GEN-END:variables
}
