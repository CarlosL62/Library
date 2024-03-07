/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library.students;

import com.mycompany.library.Menu;
import com.mycompany.library.archives.dataBase;
import com.mycompany.library.errorManagement.errorManagement;
import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author carlos
 */
public class studentsForm extends javax.swing.JFrame {

    /**
     * Creates new form StudentsForm
     * @param menu
     * @param dataBase
     */
    public studentsForm(Menu menu, dataBase dataBase) {
        initComponents();
        this.menu = menu;
        this.dataBase = dataBase; //Loading dataBase
        fillTable(dataBase.getStudentsList());
    }
    
    private Menu menu;
    private dataBase dataBase;
    private student newStudent;
    private LocalDate localDate;
    private errorManagement errorM = new errorManagement();
    
    private studentsForm() {
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
        lblStudents = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        lblNewStudent1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCarnet = new javax.swing.JTextField();
        lblNewStudent2 = new javax.swing.JLabel();
        lblNewStudent3 = new javax.swing.JLabel();
        txtdd = new javax.swing.JTextField();
        lblNewStudent6 = new javax.swing.JLabel();
        txtmm = new javax.swing.JTextField();
        lblNewStudent7 = new javax.swing.JLabel();
        txtyyyy = new javax.swing.JTextField();
        lblNewStudent4 = new javax.swing.JLabel();
        lblNewStudent8 = new javax.swing.JLabel();
        lblNewStudent9 = new javax.swing.JLabel();
        lblNewStudent10 = new javax.swing.JLabel();
        lblNewStudent11 = new javax.swing.JLabel();
        jcbCodeCareer = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblNewStudent = new javax.swing.JLabel();
        lblNewStudent5 = new javax.swing.JLabel();
        jcbFilter = new javax.swing.JComboBox<>();
        txtFilter = new javax.swing.JTextField();
        JScrollPane = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 750));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudents.setBackground(new java.awt.Color(51, 51, 51));
        lblStudents.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        lblStudents.setForeground(new java.awt.Color(255, 255, 255));
        lblStudents.setText("Estudiantes");
        jPanel1.add(lblStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        btnExit.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/goBack.png"))); // NOI18N
        btnExit.setText("Regresar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 730, 210, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        btnAdd.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/addStudent.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblNewStudent1.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent1.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent1.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent1.setText("Nombre:");

        txtName.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        txtCarnet.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        lblNewStudent2.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent2.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent2.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent2.setText("Carnet:");

        lblNewStudent3.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent3.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent3.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent3.setText("Código de carrera:");

        txtdd.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        lblNewStudent6.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        lblNewStudent6.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent6.setText("/");

        txtmm.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        lblNewStudent7.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        lblNewStudent7.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent7.setText("/");

        txtyyyy.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        lblNewStudent4.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent4.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        lblNewStudent4.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent4.setText("Nuevo estudiante");

        lblNewStudent8.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent8.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent8.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent8.setText("Fecha de nacimiento:");

        lblNewStudent9.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent9.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent9.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent9.setText("mes");

        lblNewStudent10.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent10.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent10.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent10.setText("día");

        lblNewStudent11.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent11.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent11.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent11.setText("año");

        jcbCodeCareer.setFont(new java.awt.Font("Liberation Serif", 0, 14)); // NOI18N
        jcbCodeCareer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 - Ingeniería", "2 - Medicina", "3 - Derecho", "4 - Arquitectura", "5 - Administración" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNewStudent8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNewStudent10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNewStudent6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNewStudent9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNewStudent7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNewStudent11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNewStudent1)
                                    .addComponent(lblNewStudent2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNewStudent3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbCodeCareer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblNewStudent4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNewStudent4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewStudent1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewStudent2)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewStudent3)
                    .addComponent(jcbCodeCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewStudent6)
                    .addComponent(txtmm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewStudent7)
                    .addComponent(txtyyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewStudent8)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewStudent9)
                    .addComponent(lblNewStudent10)
                    .addComponent(lblNewStudent11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 740, 220));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        lblNewStudent.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        lblNewStudent.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent.setText("Listado de estudiantes");

        lblNewStudent5.setBackground(new java.awt.Color(255, 255, 255));
        lblNewStudent5.setFont(new java.awt.Font("Liberation Serif", 0, 18)); // NOI18N
        lblNewStudent5.setForeground(new java.awt.Color(255, 255, 255));
        lblNewStudent5.setText("Filtrar usando");
        lblNewStudent5.setToolTipText("");

        jcbFilter.setFont(new java.awt.Font("Liberation Serif", 0, 14)); // NOI18N
        jcbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnet", "Nombre", "Cod Carrera" }));

        txtFilter.setFont(new java.awt.Font("Liberation Serif", 2, 18)); // NOI18N

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carnet", "Nombre", "Cod Carrera", "Fecha de nacimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudents.getTableHeader().setReorderingAllowed(false);
        JScrollPane.setViewportView(tblStudents);
        if (tblStudents.getColumnModel().getColumnCount() > 0) {
            tblStudents.getColumnModel().getColumn(0).setResizable(false);
            tblStudents.getColumnModel().getColumn(1).setResizable(false);
            tblStudents.getColumnModel().getColumn(2).setResizable(false);
            tblStudents.getColumnModel().getColumn(3).setResizable(false);
        }

        btnSearch.setFont(new java.awt.Font("Liberation Serif", 0, 24)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/library/images/search.png"))); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScrollPane)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewStudent)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNewStudent5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblNewStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewStudent5)
                            .addComponent(jcbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSearch)))
                .addGap(18, 18, 18)
                .addComponent(JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 740, 380));

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

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // button to save the new student data
        newStudent = new student();

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
            fillTable(dataBase.getStudentsList());
            cleanScreen();
        } else {
            // error message
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos sean correctos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    // filters the data from students
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int option = jcbFilter.getSelectedIndex(); // 0 Carnet, 1 Name, 2 CodCareer
        String textToFilter = txtFilter.getText();
        if (checkFilter(option, textToFilter)) {
            fillTable(filterList(option, textToFilter));
        } else {
            // error message
            JOptionPane.showMessageDialog(null, "Verifique que el campo sea correcto", "Error", JOptionPane.ERROR_MESSAGE);
            fillTable(dataBase.getStudentsList());
        }            
    }//GEN-LAST:event_btnSearchActionPerformed

    // method to check that the text to filter is correct
    private boolean checkFilter(int option, String textToFilter){
        switch (option) {
            case 0:
                return errorM.isValidCarnet(textToFilter);
            case 1:
                return errorM.isText(textToFilter);
            case 2:
                if (errorM.isInt(textToFilter)) {
                    // checks if the number is correct
                    if (Integer.parseInt(textToFilter) == 1 || Integer.parseInt(textToFilter) == 2 || Integer.parseInt(textToFilter) == 3 || Integer.parseInt(textToFilter) == 4 || Integer.parseInt(textToFilter) == 5) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                throw new AssertionError();
        }
        
    }
    
    // method to filter the table
    private List<student> filterList(int option, String txtToFilter){
        switch (option) {
            case 0:
                return dataBase.getStudentsList().stream().filter(x -> x.isCarnet(txtToFilter)).collect(Collectors.toList());
                
            case 1:
                return dataBase.getStudentsList().stream().filter(x -> x.isName(txtToFilter)).collect(Collectors.toList());
                
            case 2:
                return dataBase.getStudentsList().stream().filter(x -> x.isCodeCareer(txtToFilter)).collect(Collectors.toList());
            default:
                throw new AssertionError();
        }
    }
    
    // cleans all the textbox and resets the combobox
    private void cleanScreen(){
        txtName.setText("");
        txtCarnet.setText("");
        jcbCodeCareer.setSelectedIndex(0);
        txtdd.setText("");
        txtmm.setText("");
        txtyyyy.setText("");
        jcbFilter.setSelectedIndex(0);
        txtFilter.setText("");
    }
    
    // fills all data to the tableModel
    private void fillTable(ArrayList<student> studentsList){
        DefaultTableModel defaultModel = new DefaultTableModel(new String[]{"Carnet", "Nombre", "Código Carrera", "Fecha de nacimiento"}, studentsList.size());
        tblStudents.setModel(defaultModel);
        
        TableModel dataModel = tblStudents.getModel();
        
        List<student> studentsSorted = studentsList.stream().sorted(Comparator.comparing(student::getCarnet)).collect(Collectors.toList());
        
        for (int i = 0; i < studentsSorted.size(); i++) {
            student student = studentsSorted.get(i);
            dataModel.setValueAt(student.getCarnet(), i, 0);
            dataModel.setValueAt(student.getName(), i, 1);
            dataModel.setValueAt(student.getCodeCareer(), i, 2);
            if (student.getBirthday() != null) {
                dataModel.setValueAt(student.getBirthday().toString(), i, 3);
            }
            
        }
    }
    
    // fills all data to the tableModel
    private void fillTable(List<student> studentsList){
        DefaultTableModel defaultModel = new DefaultTableModel(new String[]{"Carnet", "Nombre", "Código Carrera", "Fecha de nacimiento"}, studentsList.size());
        tblStudents.setModel(defaultModel);
        
        TableModel dataModel = tblStudents.getModel();
        
        List<student> studentsSorted = studentsList.stream().sorted(Comparator.comparing(student::getCarnet)).collect(Collectors.toList());
        
        for (int i = 0; i < studentsSorted.size(); i++) {
            student student = studentsSorted.get(i);
            dataModel.setValueAt(student.getCarnet(), i, 0);
            dataModel.setValueAt(student.getName(), i, 1);
            dataModel.setValueAt(student.getCodeCareer(), i, 2);
            if (student.getBirthday() != null) {
                dataModel.setValueAt(student.getBirthday().toString(), i, 3);
            }
            
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
            java.util.logging.Logger.getLogger(studentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcbCodeCareer;
    private javax.swing.JComboBox<String> jcbFilter;
    private javax.swing.JLabel lblNewStudent;
    private javax.swing.JLabel lblNewStudent1;
    private javax.swing.JLabel lblNewStudent10;
    private javax.swing.JLabel lblNewStudent11;
    private javax.swing.JLabel lblNewStudent2;
    private javax.swing.JLabel lblNewStudent3;
    private javax.swing.JLabel lblNewStudent4;
    private javax.swing.JLabel lblNewStudent5;
    private javax.swing.JLabel lblNewStudent6;
    private javax.swing.JLabel lblNewStudent7;
    private javax.swing.JLabel lblNewStudent8;
    private javax.swing.JLabel lblNewStudent9;
    private javax.swing.JLabel lblStudents;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtdd;
    private javax.swing.JTextField txtmm;
    private javax.swing.JTextField txtyyyy;
    // End of variables declaration//GEN-END:variables
}
