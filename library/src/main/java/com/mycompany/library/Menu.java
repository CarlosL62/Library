/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library;

import com.mycompany.library.archives.archive;
import com.mycompany.library.archives.dataBase;
import com.mycompany.library.books.booksForm;
import com.mycompany.library.lists.listException;
import com.mycompany.library.loans.loansForm;
import com.mycompany.library.reports.reports;
import com.mycompany.library.students.studentsForm;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        archive = new archive();
        try {
            dataBase = archive.startdb(); //Loading database
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private dataBase dataBase;
    private archive archive;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBooks = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();
        btnLoans = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnImportData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Centro Universitario de Occidente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        btnExit.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/exit.png"))); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 730, 210, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Biblioteca");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        btnBooks.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/book.png"))); // NOI18N
        btnBooks.setText("Libros");
        btnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksActionPerformed(evt);
            }
        });

        btnStudents.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/students.png"))); // NOI18N
        btnStudents.setText("Estudiantes");
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });

        btnLoans.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnLoans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/loan.png"))); // NOI18N
        btnLoans.setText("Préstamos");
        btnLoans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoansActionPerformed(evt);
            }
        });

        btnReports.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/report.png"))); // NOI18N
        btnReports.setText("Reportes");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLoans, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStudents)
                    .addComponent(btnBooks))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoans)
                    .addComponent(btnReports))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 660, 180));

        btnImportData.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnImportData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/importData.png"))); // NOI18N
        btnImportData.setText("Importar datos");
        btnImportData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnImportData, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksActionPerformed
        booksForm books = new booksForm(this, dataBase);
        books.setVisible(true);
        books.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnBooksActionPerformed

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        studentsForm students = new studentsForm((Menu) this, dataBase);
        students.setVisible(true);
        students.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        archive.savedb(dataBase);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        reports reportsForm = new reports(this, dataBase);
        reportsForm.setVisible(true);
        reportsForm.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnImportDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportDataActionPerformed

    private void btnLoansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoansActionPerformed
        // TODO add your handling code here:
        loansForm loansForm = new loansForm(this, dataBase);
        loansForm.setVisible(true);
        loansForm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoansActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnImportData;
    private javax.swing.JButton btnLoans;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
