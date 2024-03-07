/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library.reports;

import com.mycompany.library.archives.dataBase;
import java.time.*;

/**
 *
 * @author hamme
 */
public class lateBooks extends javax.swing.JFrame {

    /**
     * Creates new form raisedMoney
     */
    public lateBooks(reports menu, dataBase dataBase) {
        initComponents();
        this.menu = menu;
        this.dataBase = dataBase;
        lblDate.setText(currentDate.toString());
    }
    
    private reports menu;
    private dataBase dataBase;
    private LocalDate currentDate = LocalDate.now();

    private lateBooks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportsTable = new javax.swing.JTable();
        returnButton = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblDateTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entregas con mora");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        reportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carnet", "Código de libro", "Fecha de inicio", "Días atrasados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(reportsTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 149, 740, 540));

        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/goBack.png"))); // NOI18N
        returnButton.setText("Regresar");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });
        jPanel2.add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 720, 210, 40));

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 150, 30));

        lblDateTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblDateTitle.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblDateTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTitle.setText("Fecha:");
        jPanel2.add(lblDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        this.dispose();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }//GEN-LAST:event_returnButtonMouseClicked

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
            java.util.logging.Logger.getLogger(lateBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lateBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lateBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lateBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new lateBooks().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateTitle;
    private javax.swing.JTable reportsTable;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
