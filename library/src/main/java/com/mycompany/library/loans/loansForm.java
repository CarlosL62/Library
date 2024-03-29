/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library.loans;

import com.mycompany.library.Menu;
import com.mycompany.library.archives.dataBase;
import com.mycompany.library.books.book;
import com.mycompany.library.errorManagement.errorManagement;
import com.mycompany.library.students.student;
import java.time.*;
import java.util.ArrayList;
import static java.util.Arrays.stream;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hamme
 */
public class loansForm extends javax.swing.JFrame {

    /**
     * Creates new form loans
     */
    public loansForm(Menu menu, dataBase dataBase) {
        initComponents();
        this.menu = menu;
        this.dataBase = dataBase;
        fillTable(dataBase.getLoansList());
    }

    private Menu menu;
    private loan newLoan;
    private dataBase dataBase;
    private LocalDate localDate;
    private errorManagement errorM = new errorManagement();

    private loansForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAddLoan = new javax.swing.JButton();
        lblNewStudent1 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        lblNewStudent2 = new javax.swing.JLabel();
        txtBookCod = new javax.swing.JTextField();
        btnEndLoan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportsTable = new javax.swing.JTable();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Préstamos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 35, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar préstamo");

        btnAddLoan.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnAddLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/addLoan.png"))); // NOI18N
        btnAddLoan.setText("Agregar");
        btnAddLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLoanActionPerformed(evt);
            }
        });

        lblNewStudent1.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent1.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent1.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent1.setText("Carnet:");

        txtCarnet.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        lblNewStudent2.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent2.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent2.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent2.setText("Código del libro:");

        txtBookCod.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        btnEndLoan.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnEndLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/pay.png"))); // NOI18N
        btnEndLoan.setText("Finalizar");
        btnEndLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndLoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewStudent1)
                            .addComponent(lblNewStudent2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtBookCod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddLoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEndLoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNewStudent1)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBookCod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNewStudent2)))
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddLoan)
                        .addGap(18, 18, 18)
                        .addComponent(btnEndLoan)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 101, 740, 180));

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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 299, 740, 400));

        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/goBack.png"))); // NOI18N
        returnButton.setText("Regresar");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });
        jPanel1.add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 730, 210, 40));

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

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        this.dispose();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_returnButtonMouseClicked

    private void btnAddLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLoanActionPerformed
        // button to save the new loan data
        newLoan = new loan();

        if (errorM.isValidCarnet(txtCarnet.getText()) && errorM.isValidBookCode(txtBookCod.getText())) {
            // adding values
            newLoan.setStudentCarnet(Integer.parseInt(txtCarnet.getText()));
            newLoan.setBookCode(txtBookCod.getText());
            localDate = localDate.now();
            newLoan.setBeginDate(localDate);
            // comprobations
            List ls = dataBase.getStudentsList().stream().filter(x -> x.isCarnet(String.valueOf(newLoan.getStudentCarnet()))).collect(Collectors.toList());
            // if there is one, then it is a correct carnet
            if (ls.size() == 1) {
                // then, we need to check the book
                List lb = dataBase.getBooksList().stream().filter(x -> x.isBookCode(newLoan.getBookCode())).collect(Collectors.toList());
                if (lb.size() == 1) {
                    List lc = dataBase.getLoansList().stream().filter(x -> (x.isStudentCarnet(newLoan.getStudentCarnet()))).collect(Collectors.toList());
                    // we check if the student has loans left
                    if (lc.size() < 3) {

                        dataBase.getBooksList().stream().forEach(x -> {
                            if (x.getCodeBook().equals(newLoan.getBookCode())) {
                                if (x.getNoCopies() > 0) {
                                    x.setNoCopies(x.getNoCopies() - 1);
                                    dataBase.getLoansList().add(newLoan);
                                    //confirmation message
                                    cleanScreen();
                                    JOptionPane.showMessageDialog(null, "Préstamo agregado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    // error message
                                    JOptionPane.showMessageDialog(null, "No hay suficiente copias", "Error", JOptionPane.ERROR_MESSAGE);
                                }

                            }
                        });

                    } else {
                        // error message
                        JOptionPane.showMessageDialog(null, "El estudiante no puede hacer préstamos por ahora", "Error", JOptionPane.ERROR_MESSAGE);
                        fillTable(dataBase.getLoansList());
                    }

                } else {
                    // error message
                    JOptionPane.showMessageDialog(null, "El libro no existe en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                    fillTable(dataBase.getLoansList());
                }

            } else {
                // error message
                JOptionPane.showMessageDialog(null, "El carnet no existe en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // error message
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos sean correctos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        fillTable(dataBase.getLoansList());

    }//GEN-LAST:event_btnAddLoanActionPerformed

    private void btnEndLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndLoanActionPerformed
        //button to calculate the total price of the loan
        if (errorM.isValidCarnet(txtCarnet.getText()) && errorM.isValidBookCode(txtBookCod.getText())) {
            localDate = localDate.now();
            //Period period = null;
            //newLoan.setBeginDate(localDate);******
            
            for (int i = 0; i < dataBase.getLoansList().size(); i++) {
                if (dataBase.getLoansList().get(i).getStatus() == true) {
                    if (dataBase.getLoansList().get(i).getStudentCarnet() == Integer.parseInt(txtCarnet.getText())
                            && dataBase.getLoansList().get(i).getBookCode().equals(txtBookCod.getText())) {
                        dataBase.getLoansList().get(i).setEndDate(localDate);
                        
                        int ans = JOptionPane.showConfirmDialog(null, "El costo total del préstamo es Q" + dataBase.getLoansList().get(i).totalCost() + "\n" + "¿Desea cofirmar el pago?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if (ans == JOptionPane.YES_OPTION) {
                            dataBase.getLoansList().get(i).setStatus(false);
                            for (int j = 0; j < dataBase.getBooksList().size(); j++) {
                                if (dataBase.getBooksList().get(j).isBookCode(dataBase.getLoansList().get(i).getBookCode())) {
                                    dataBase.getBooksList().get(j).setNoCopies(dataBase.getBooksList().get(j).getNoCopies()+1);
                                    //confirmation message
                                    cleanScreen();
                                    JOptionPane.showMessageDialog(null, "Préstamo pagado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            // error message
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos sean correctos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        fillTable(dataBase.getLoansList());


    }//GEN-LAST:event_btnEndLoanActionPerformed

    // cleans all the textbox
    private void cleanScreen() {
        txtCarnet.setText("");
        txtBookCod.setText("");
    }

    // fills all data to the tableModel
    private void fillTable(ArrayList<loan> loansList) {
        DefaultTableModel defaultModel = new DefaultTableModel(new String[]{"Carnet", "Código de libro", "Fecha de inicio"}, loansList.size());
        reportsTable.setModel(defaultModel);

        TableModel dataModel = reportsTable.getModel();

        List<loan> studentsSorted = loansList.stream().sorted(Comparator.comparing(loan::getStudentCarnet)).collect(Collectors.toList());

        for (int i = 0; i < studentsSorted.size(); i++) {
            loan loan = studentsSorted.get(i);
            dataModel.setValueAt(loan.getStudentCarnet(), i, 0);
            dataModel.setValueAt(loan.getBookCode(), i, 1);
            dataModel.setValueAt(loan.getBeginDate().toString(), i, 2);
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
            java.util.logging.Logger.getLogger(loansForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loansForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loansForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loansForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loansForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLoan;
    private javax.swing.JButton btnEndLoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNewStudent1;
    private javax.swing.JLabel lblNewStudent2;
    private javax.swing.JTable reportsTable;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField txtBookCod;
    private javax.swing.JTextField txtCarnet;
    // End of variables declaration//GEN-END:variables
}
