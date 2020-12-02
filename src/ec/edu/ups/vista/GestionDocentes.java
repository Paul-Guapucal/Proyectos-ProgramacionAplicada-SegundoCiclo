/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCurso;
import ec.edu.ups.controlador.ControladorProfesor;
import ec.edu.ups.controlador.ControladorRector;
import ec.edu.ups.modelo.Curso;
import ec.edu.ups.modelo.Profesor;
import ec.edu.ups.modelo.Rector;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paul_
 */
public class GestionDocentes extends javax.swing.JInternalFrame {
    
    private ControladorProfesor controladorDocente;
    private ControladorCurso controladorCurso;
    private ControladorRector controladorUsuario;
    public static String ruta = "datos/Docente.obj";
    
    public GestionDocentes(ControladorProfesor controladorDocente, ControladorCurso controladorCurso, ControladorRector controladorUsuario) {
        initComponents();
        
        this.controladorDocente = controladorDocente;
        this.controladorCurso = controladorCurso;
        this.controladorUsuario = controladorUsuario;
        try {
            controladorDocente.cargarDatos();
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(GestionDocentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocentes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtGcedula = new javax.swing.JTextField();
        txtGnombre = new javax.swing.JTextField();
        txtGapellido = new javax.swing.JTextField();
        txtGEdad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtGDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipoTitulo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoCurso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Edad", "Direccion", "Titulo", "Tipo titulo", "codigo de curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDocentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDocentes);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtGcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGcedulaActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setText("SALIR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Cedula:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Edad:");

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setText("AGREGAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Direccion:");

        btnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizar.setText("MODIFICAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnListar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Titulo");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Tipo Titulo");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Codigo de Curso");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Correo");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Correo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTitulo)
                                .addComponent(txtGnombre)
                                .addComponent(txtGcedula)
                                .addComponent(txtGapellido)
                                .addComponent(txtGEdad)
                                .addComponent(txtGDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTipoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addComponent(txtCodigoCurso)
                                .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTipoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("GESTION DE DOCENTES:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDocentesTbl() {
        DefaultTableModel modelo = (DefaultTableModel) tblDocentes.getModel();
        modelo.setRowCount(0);
        if (controladorDocente.docentes() != null) {
            for (Profesor docente : controladorDocente.docentes()) {
                Object[] rowData = {docente.getCedula(), docente.getNombre(), docente.getApellido(),
                    docente.getEdad(), docente.getDireccion(), docente.getTitulo(), docente.getTipoTitulo(), docente.getCurso().getCodigo()};
                modelo.addRow(rowData);
                tblDocentes.setModel(modelo);
            }
        } else {
            System.out.println("LISTA VACIA");
        }
        
    }
    
    public void limpiar() {
        
        txtGcedula.setText("");
        txtGnombre.setText("");
        txtGapellido.setText("");
        txtGEdad.setText("");
        txtGDireccion.setText("");
        txtTitulo.setText("");
        txtTipoTitulo.setText("");
        
    }
    private void txtGcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGcedulaActionPerformed
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        Profesor docente = new Profesor(txtGcedula.getText().trim(), txtGnombre.getText().trim(),
                txtGapellido.getText().trim(), Integer.parseInt(txtGEdad.getText().trim()), txtGDireccion.getText().trim(), txtTitulo.getText().trim(), txtTipoTitulo.getText().trim());
        
        Curso comparar = new Curso();
        comparar.setCodigo(Integer.parseInt(txtCodigoCurso.getText().trim()));
        
        Optional<Curso> c = controladorCurso.buscar(comparar);
        Curso curso = c.get();
        docente.setCurso(curso);
        Rector u = new Rector(docente, "editor", txtCorreo.getText().trim(), txtPass.getText().trim());
        
        if (controladorDocente.crear(docente) && controladorUsuario.crear(u)) {
            cargarDocentesTbl();
            JOptionPane.showMessageDialog(this, "Registrado con exito");
            try {
                controladorDocente.guardarDatos(ruta);
                controladorUsuario.guardarDatos("datos/Usuario.obj");
            } catch (IOException ex) {
                Logger.getLogger(GestionDocentes.class.getName()).log(Level.SEVERE, null, ex);
            }
            cargarDocentesTbl();
            limpiar();
            
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar");
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        Profesor docente = new Profesor(txtGcedula.getText().trim(), txtGnombre.getText().trim(),
                txtGapellido.getText().trim(), Integer.parseInt(txtGEdad.getText().trim()), txtGDireccion.getText().trim(), txtTitulo.getText().trim(), txtTipoTitulo.getText().trim());
        
        Curso comparar = new Curso();
        comparar.setCodigo(Integer.parseInt(txtCodigoCurso.getText().trim()));
        
        Optional<Curso> c = controladorCurso.buscar(comparar);
        Curso curso = c.get();
        docente.setCurso(curso);
        Rector u = new Rector(docente, "editor", txtCorreo.getText().trim(), txtPass.getText().trim());
        
        if (controladorDocente.actualizar(docente) && controladorUsuario.actualizar(u)) {
            JOptionPane.showMessageDialog(this, "actualizado exitosamente");
            try {
                controladorDocente.guardarDatos(ruta);
                controladorUsuario.guardarDatos("datos/Usuario.obj");
            } catch (IOException ex) {
                Logger.getLogger(GestionDocentes.class.getName()).log(Level.SEVERE, null, ex);
            }
            limpiar();
            cargarDocentesTbl();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar  :ERROR");
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int d = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el docente con cedula" + txtGcedula.getText().trim());
        if (d == JOptionPane.YES_OPTION) {
            Profesor comparar = new Profesor(txtGcedula.getText().trim(), null, null, 0, null);
            comparar.setCedula(txtGcedula.getText().trim());
            Optional<Profesor> p = controladorDocente.buscar(comparar);
            Profesor doc = p.get();
            System.out.println("" + doc);
            Rector compa = controladorUsuario.buscarU(doc);
            
            if (controladorDocente.eliminar(doc) && controladorUsuario.eliminar(compa)) {
                try {
                    controladorDocente.guardarDatos(ruta);
                    controladorUsuario.guardarDatos("datos/Usuario.obj");
                } catch (IOException ex) {
                    Logger.getLogger(GestionDocentes.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "eliminado exitosamente");
                cargarDocentesTbl();
            } else if (d == JOptionPane.NO_OPTION) {
                cargarDocentesTbl();
            }
            
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        if (controladorDocente.docentes() != null) {
            
            cargarDocentesTbl();
            
        }
    }//GEN-LAST:event_btnListarActionPerformed
    
    private void tblDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocentesMouseClicked
        int index = tblDocentes.getSelectedRow();
        
        String cedula = "" + tblDocentes.getValueAt(index, 0);
        String nombre = "" + tblDocentes.getValueAt(index, 1);
        String apellido = "" + tblDocentes.getValueAt(index, 2);
        String Edad = "" + tblDocentes.getValueAt(index, 3);
        String Direccion = "" + tblDocentes.getValueAt(index, 4);
        String Titulo = "" + tblDocentes.getValueAt(index, 5);
        String tipoTitulo = "" + tblDocentes.getValueAt(index, 6);
        int codigoCurso = Integer.parseInt("" + tblDocentes.getValueAt(index, 7));
        String correo = "" + tblDocentes.getValueAt(index, 8);
        String pass = "" + tblDocentes.getValueAt(index, 9);
        
        txtGcedula.setText(cedula);
        txtGnombre.setText(nombre);
        txtGapellido.setText(apellido);
        txtGEdad.setText(Edad);
        txtGDireccion.setText(Direccion);
        txtTitulo.setText(Titulo);
        txtTipoTitulo.setText(tipoTitulo);
        txtCodigoCurso.setText("" + codigoCurso);
        txtCorreo.setText(correo);
        txtPass.setText(pass);
    }//GEN-LAST:event_tblDocentesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDocentes;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtGDireccion;
    private javax.swing.JTextField txtGEdad;
    private javax.swing.JTextField txtGapellido;
    private javax.swing.JTextField txtGcedula;
    private javax.swing.JTextField txtGnombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtTipoTitulo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
