/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library.reports;

import com.mycompany.library.archives.dataBase;

/**
 *
 * @author hamme
 */
public class currentStudentsLoans extends javax.swing.JFrame {

    /**
     * Creates new form currentStudentLoans
     */
    public currentStudentsLoans(reports menu, dataBase dataBase) {
        initComponents();
        this.menu = menu;
        this.dataBase = dataBase;
    }

    private reports menu;
    private dataBase dataBase;

    private currentStudentsLoans() {
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
        jPanel6 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtCarnet = new javax.swing.JTextField();
        lblNewStudent2 = new javax.swing.JLabel();
        lblNewStudent4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Préstamos actuales realizados por un estudiante");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        reportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carnet", "Código de libro", "Fecha de inicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(reportsTable);
        if (reportsTable.getColumnModel().getColumnCount() > 0) {
            reportsTable.getColumnModel().getColumn(0).setResizable(false);
            reportsTable.getColumnModel().getColumn(1).setResizable(false);
            reportsTable.getColumnModel().getColumn(2).setResizable(false);
        }

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
                .addComponent(jScrollPane1)
                .addGap(15, 15, 15))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 239, 740, 460));

        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/goBack.png"))); // NOI18N
        returnButton.setText("Regresar");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });
        jPanel2.add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 730, 210, 40));

        jPanel6.setBackground(new java.awt.Color(0, 51, 102));

        btnSearch.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/search.png"))); // NOI18N
        btnSearch.setText("Consultar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtCarnet.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        lblNewStudent2.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent2.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent2.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent2.setText("Carnet:");

        lblNewStudent4.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent4.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        lblNewStudent4.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent4.setText("Datos del estudiante");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblNewStudent4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewStudent2)
                .addGap(23, 23, 23)
                .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNewStudent4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewStudent2)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 740, 120));

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // button to save the new student data
        /*newStudent = new student();

        if (errorM.isText(txtName.getText()) && errorM.isValidCarnet(txtCarnet.getText()) && (errorM.isDate(txtyyyy.getText(), txtmm.getText(), txtdd.getText()) || (txtyyyy.getText().equals("") && txtmm.getText().equals("") && txtdd.getText().equals("")))) {
            newStudent.setName(txtName.getText());
            newStudent.setCarnet(Integer.parseInt(txtCarnet.getText()));
            newStudent.setCodeCareer(jcbCodeCareer.getSelectedIndex() + 1);
            try {
                localDate = LocalDate.of(Integer.parseInt(txtyyyy.getText()), Integer.parseInt(txtmm.getText()), Integer.parseInt(txtdd.getText()));
                newStudent.setBirthday(localDate);
            } catch (Exception e) {
                newStudent.setBirthday(null);
            }

            //dataBase.getStudents().addNodo(newStudent);
            dataBase.getStudentsList().add(newStudent);

            // confirmation message
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            cleanScreen();
        } else {
            // error message
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos sean correctos", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(currentStudentsLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(currentStudentsLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(currentStudentsLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(currentStudentsLoans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new currentStudentsLoans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNewStudent2;
    private javax.swing.JLabel lblNewStudent4;
    private javax.swing.JTable reportsTable;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField txtCarnet;
    // End of variables declaration//GEN-END:variables
}
