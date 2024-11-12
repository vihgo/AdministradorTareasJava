/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemagestiontareas.vista;

import com.mycompany.sistemagestiontareas.controlador.MainFrameController;


/**
 *
 * @author melipilla
 */
public class MainFrame extends javax.swing.JFrame {

    MainFrameController mainFController= new MainFrameController();
    public MainFrame() {
        initComponents();
        lblProyecto.setVisible(false);
        txtNombreProyecto.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgProyecto = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ftxtFechaLimite = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbPrioridad = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        rbProyectoNo = new javax.swing.JRadioButton();
        rbProyectoSi = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombreProyecto = new javax.swing.JTextField();
        lblProyecto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTareas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tareas");

        jPanel1.setBackground(new java.awt.Color(33, 228, 187));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion De Tareas");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Fecha Limite:");

        ftxtFechaLimite.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));

        jLabel4.setText("Prioridad:");

        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        rbProyectoNo.setBackground(jPanel1.getBackground());
        bgProyecto.add(rbProyectoNo);
        rbProyectoNo.setSelected(true);
        rbProyectoNo.setText("No");
        rbProyectoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProyectoNoActionPerformed(evt);
            }
        });

        rbProyectoSi.setBackground(jPanel1.getBackground());
        bgProyecto.add(rbProyectoSi);
        rbProyectoSi.setText("Si");
        rbProyectoSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProyectoSiActionPerformed(evt);
            }
        });

        jLabel5.setText("¿Desea asociar la tarea a un proyecto?");

        lblProyecto.setText("Proyecto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftxtFechaLimite)
                            .addComponent(txtNombreTarea)
                            .addComponent(cmbPrioridad, 0, 92, Short.MAX_VALUE)))
                    .addComponent(btnAgregar)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(rbProyectoNo)
                        .addGap(18, 18, 18)
                        .addComponent(rbProyectoSi)
                        .addGap(26, 26, 26)
                        .addComponent(lblProyecto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftxtFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbProyectoNo)
                    .addComponent(rbProyectoSi)
                    .addComponent(lblProyecto)
                    .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tareas"));

        tbTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Fecha Limite", "Prioridad", "Proyecto", "Terminada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbTareas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Tareasss");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
        System.out.println("Que pasa ahoraa");
        String nombre= txtNombreTarea.getText();
        String fecha= ftxtFechaLimite.getText();
        int prioridad= cmbPrioridad.getSelectedIndex();
        System.out.println(fecha);
        mainFController.agregarTarea(nombre, fecha, prioridad,tbTareas);
       
       
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void rbProyectoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProyectoNoActionPerformed
        lblProyecto.setVisible(false);
        txtNombreProyecto.setText("");
        txtNombreProyecto.setVisible(false);
    }//GEN-LAST:event_rbProyectoNoActionPerformed

    private void rbProyectoSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProyectoSiActionPerformed
        lblProyecto.setVisible(true);
        txtNombreProyecto.setVisible(true);
    }//GEN-LAST:event_rbProyectoSiActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgProyecto;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JFormattedTextField ftxtFechaLimite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProyecto;
    private javax.swing.JRadioButton rbProyectoNo;
    private javax.swing.JRadioButton rbProyectoSi;
    private javax.swing.JTable tbTareas;
    private javax.swing.JTextField txtNombreProyecto;
    private javax.swing.JTextField txtNombreTarea;
    // End of variables declaration//GEN-END:variables
}
