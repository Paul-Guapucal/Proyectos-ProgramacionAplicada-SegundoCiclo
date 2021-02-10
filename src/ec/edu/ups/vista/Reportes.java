/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.controladorEgreso;
import ec.edu.ups.controlador.controladorIngreso;
import ec.edu.ups.modelo.Egresos;
import ec.edu.ups.modelo.Ingresos;

import java.util.Calendar;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public final class Reportes extends javax.swing.JInternalFrame {

    private int idIngreso = 0;
    private int id = 0;

    private controladorIngreso controladorIngreso;
    private controladorEgreso controladorEgreso;

    public Reportes(controladorIngreso controladorIngreso, controladorEgreso controladorEgreso) {
        initComponents();
        this.controladorIngreso = controladorIngreso;
        this.controladorEgreso = controladorEgreso;

        cargarIngresosTbl();
        cargarEgresosTbl();
        calcularSaldo();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngresos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTotalIngresos = new javax.swing.JTextField();
        btnEliminarIngreso = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEgresos = new javax.swing.JTable();
        txtTotalEgresos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarE = new javax.swing.JButton();
        btnActualizarT = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadEgreso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtDisponible = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Reportes Monetarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tblIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Hora", "Descripcion", "Ingreso ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngresosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIngresos);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Total:");

        txtTotalIngresos.setEditable(false);

        btnEliminarIngreso.setText("ELIMINAR");
        btnEliminarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIngresoActionPerformed(evt);
            }
        });

        btnActualizar1.setText("ACTUALIZAR");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminarIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarIngreso)
                    .addComponent(btnActualizar1)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Egresos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tblEgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Hora", "Descripcion", "Egreso ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEgresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEgresosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEgresos);

        txtTotalEgresos.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Total:");

        btnGuardarE.setText("GUARDAR");
        btnGuardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEActionPerformed(evt);
            }
        });

        btnActualizarT.setText("ACTUALIZAR");
        btnActualizarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarE, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarT)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnGuardarE)
                    .addComponent(btnActualizarT)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(txtTotalEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText(" Cantidad   ($)");

        txtDisponible.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Disponible: ($)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(72, 72, 72)
                                .addComponent(txtCantidadEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidadEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void cargarIngresosTbl() {
        String fecha = "";
        String hora = "";
        DefaultTableModel modelo = (DefaultTableModel) tblIngresos.getModel();
        modelo.setRowCount(0);
        if (controladorIngreso.ingresos() != null) {
            for (Ingresos ingreso : controladorIngreso.buscarTodo()) {
                Calendar f = ingreso.getFechaHora();
                int mes = f.get(Calendar.MONTH) + 1;
                fecha = f.get(Calendar.DAY_OF_MONTH) + "/" + mes + "/" + f.get(Calendar.YEAR);
                hora = f.get(Calendar.HOUR_OF_DAY) + ":" + (f.get(Calendar.MINUTE)) + ":" + f.get(Calendar.SECOND);
                Object[] rowData = {ingreso.getId(), fecha, hora, ingreso.getDescripcion(), ingreso.getIngreso()};
                modelo.addRow(rowData);
                tblIngresos.setModel(modelo);
            }
        } else {
            System.out.println("LISTA VACIA");
        }

        txtTotalIngresos.setText("" + calcularTotalIngresos(controladorIngreso.buscarTodo()));
    }

    public void cargarEgresosTbl() {
        String fecha = "";
        String hora = "";
        DefaultTableModel modelo = (DefaultTableModel) tblEgresos.getModel();
        modelo.setRowCount(0);
        if (controladorEgreso.egresos() != null) {
            for (Egresos egreso : controladorEgreso.buscarTodo()) {
                Calendar f = egreso.getFechaHora();
                int mes = (f.get(Calendar.MONTH)) + 1;
                fecha = f.get(Calendar.DAY_OF_MONTH) + "/" + mes + "/" + f.get(Calendar.YEAR);
                hora = f.get(Calendar.HOUR_OF_DAY) + ":" + (f.get(Calendar.MINUTE)) + ":" + f.get(Calendar.SECOND);
                Object[] rowData = {egreso.getId(), fecha, hora, egreso.getDescripcion(), egreso.getEgreso()};
                modelo.addRow(rowData);
                tblEgresos.setModel(modelo);
            }
        } else {
            System.out.println("LISTA VACIA");
        }
        txtTotalEgresos.setText("" + calcularTotalEgresos(controladorEgreso.buscarTodo()));
    }

    public double calcularTotalIngresos(List<Ingresos> ingresos) {
        double acum = 0;
        for (Ingresos ingreso : ingresos) {
            acum = acum + ingreso.getIngreso();
        }
        return acum;

    }

    public void calcularSaldo() {
        if (txtTotalIngresos.getText().isEmpty() && txtTotalEgresos.getText().isEmpty()) {

        } else {

            String ingresos = txtTotalIngresos.getText().trim();
            String egresos = txtTotalEgresos.getText().trim();
            double total = 0;

            total = Double.parseDouble(ingresos) - Double.parseDouble(egresos);
            txtDisponible.setText("" + total);
        }

    }

    public double calcularTotalEgresos(List<Egresos> egresos) {
        double acum = 0;
        for (Egresos egreso : egresos) {
            acum = acum + egreso.getEgreso();
        }
        return acum;

    }
    private void btnEliminarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIngresoActionPerformed
        if (idIngreso != 0) {

            Ingresos i = controladorIngreso.buscar(id);;

            int d = JOptionPane.showConfirmDialog(this, "Esta seguro de elminar el ingreso seleccionado?-");

            if (d == JOptionPane.YES_OPTION) {
                if (controladorIngreso.eliminar(i)) {

                    JOptionPane.showMessageDialog(this, "Ingreso eliminado correctamente");

                }
            }
        }
        cargarIngresosTbl();

    }//GEN-LAST:event_btnEliminarIngresoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cargarEgresosTbl();
        txtDescripcion.setText("");
        txtCantidadEgreso.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTActionPerformed
        if (txtDescripcion.getText().isEmpty() || txtCantidadEgreso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos vacios");
        } else {

            Egresos egreso = controladorEgreso.buscar(id);

            egreso.setDescripcion(txtDescripcion.getText());
            egreso.setEgreso(Double.parseDouble(txtCantidadEgreso.getText()));
            if (controladorEgreso.actualizar(egreso)) {

                JOptionPane.showMessageDialog(this, "Egreso actualizado exitosamente");
            }
        }
        cargarEgresosTbl();
    }//GEN-LAST:event_btnActualizarTActionPerformed

    private void btnGuardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEActionPerformed
        if (txtDescripcion.getText().isEmpty() || txtCantidadEgreso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos vacios");
        } else {

            Egresos egreso = new Egresos();
            Calendar fecha = Calendar.getInstance();;
            egreso.setFechaHora(fecha);
            egreso.setDescripcion(txtDescripcion.getText());
            egreso.setEgreso(Double.parseDouble(txtCantidadEgreso.getText()));
            if (controladorEgreso.crear(egreso)) {

                JOptionPane.showMessageDialog(this, "Egreso guardado exitosamente");
            }
        }

        cargarEgresosTbl();
    }//GEN-LAST:event_btnGuardarEActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (id != 0) {
            Egresos egreso = controladorEgreso.buscar(id);

            int d = JOptionPane.showConfirmDialog(this, "Esta seguro de elminar el ingreso seleccionado?-");

            if (d == JOptionPane.YES_OPTION) {
                if (controladorEgreso.eliminar(egreso)) {

                    JOptionPane.showMessageDialog(this, "Ingreso eliminado correctamente");

                }
            }
        }
        cargarIngresosTbl();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblIngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngresosMouseClicked
        int index = tblIngresos.getSelectedRow();
        idIngreso = Integer.parseInt("" + tblIngresos.getValueAt(index, 0));

    }//GEN-LAST:event_tblIngresosMouseClicked

    public double calcularValorDisponible() {
        return 0;

    }
    private void tblEgresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEgresosMouseClicked
        int index = tblIngresos.getSelectedRow();
        id = Integer.parseInt("" + tblIngresos.getValueAt(index, 0));
    }//GEN-LAST:event_tblEgresosMouseClicked

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        cargarIngresosTbl();
        cargarEgresosTbl();
        calcularSaldo();
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnActualizarT;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarIngreso;
    private javax.swing.JButton btnGuardarE;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEgresos;
    private javax.swing.JTable tblIngresos;
    private javax.swing.JTextField txtCantidadEgreso;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtTotalEgresos;
    private javax.swing.JTextField txtTotalIngresos;
    // End of variables declaration//GEN-END:variables
}
