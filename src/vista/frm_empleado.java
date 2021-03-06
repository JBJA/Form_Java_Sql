/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import models.Conexion;
import models.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author Juárez Arevalo
 */
public class frm_empleado extends javax.swing.JFrame {

    /**
     * Creates new form frm_empleado
     */
    Empleado obj_empleado;
    public frm_empleado() {
        initComponents();
        obj_empleado = new Empleado();
        tbl_empleado.setModel(obj_empleado.leer_empleado());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_id_empleado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre_empleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellido_empleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo_empleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_direccion_empleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_telefono_empleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_fecha_nacimiento_empleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmb_puesto_empleado = new javax.swing.JComboBox<>();
        btn_aceptar_empleado = new javax.swing.JButton();
        btn_modificar_empleado = new javax.swing.JButton();
        btn_eliminar_empleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleado = new javax.swing.JTable();
        btn_conexion_empleado = new javax.swing.JButton();
        txt_puesto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_id_empleado.setText("ID");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        txt_apellido_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellido_empleadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo");

        jLabel5.setFont(new java.awt.Font("Charlemagne Std", 0, 14)); // NOI18N
        jLabel5.setText("< EMPLEADOS >");

        jLabel6.setText("Direccion");

        jLabel7.setText("Telefono");

        jLabel8.setText("Fecha de Nacimiento");

        jLabel9.setText("Puesto");

        cmb_puesto_empleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_aceptar_empleado.setText("Aceptar");
        btn_aceptar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar_empleadoActionPerformed(evt);
            }
        });

        btn_modificar_empleado.setText("Modificar");
        btn_modificar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_empleadoActionPerformed(evt);
            }
        });

        btn_eliminar_empleado.setText("Eliminar");
        btn_eliminar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_empleadoActionPerformed(evt);
            }
        });

        tbl_empleado.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadoMouseClicked(evt);
            }
        });
        tbl_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_empleadoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_empleado);

        btn_conexion_empleado.setText("Conexion");
        btn_conexion_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conexion_empleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_id_empleado)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_aceptar_empleado)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_modificar_empleado)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_direccion_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                            .addComponent(txt_telefono_empleado)
                                            .addComponent(txt_fecha_nacimiento_empleado)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cmb_puesto_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_puesto))
                                            .addComponent(txt_codigo_empleado)
                                            .addComponent(txt_nombre_empleado)
                                            .addComponent(txt_apellido_empleado))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_eliminar_empleado)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_conexion_empleado))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(jLabel5))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lbl_id_empleado)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_codigo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellido_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_direccion_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_fecha_nacimiento_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_puesto_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar_empleado)
                    .addComponent(btn_modificar_empleado)
                    .addComponent(btn_eliminar_empleado)
                    .addComponent(btn_conexion_empleado))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_apellido_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellido_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellido_empleadoActionPerformed

    private void btn_conexion_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conexion_empleadoActionPerformed
        // TODO add your handling code here:
        Conexion cn = new Conexion();
        cn.abrir_conexion();
        // Codigo 
        cn.cerrar_conexion();
    }//GEN-LAST:event_btn_conexion_empleadoActionPerformed

    private void btn_aceptar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar_empleadoActionPerformed
        // TODO add your handling code here:
        obj_empleado = new Empleado(0,txt_codigo_empleado.getText(),txt_nombre_empleado.getText(),txt_apellido_empleado.getText(),txt_direccion_empleado.getText(),txt_telefono_empleado.getText(),this.txt_fecha_nacimiento_empleado.getText(),txt_puesto.getText());
        obj_empleado.agregar_empleado();
       // tbl_empleado.setModel(obj_empleado.leer());
    }//GEN-LAST:event_btn_aceptar_empleadoActionPerformed

    private void btn_modificar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_empleadoActionPerformed
        // TODO add your handling code here:
        obj_empleado = new Empleado(Integer.valueOf(lbl_id_empleado.getText()),txt_codigo_empleado.getText(),txt_nombre_empleado.getText(),txt_apellido_empleado.getText(),txt_direccion_empleado.getText(),txt_telefono_empleado.getText(),this.txt_fecha_nacimiento_empleado.getText(),txt_puesto.getText());
        obj_empleado.modificar_empleado();
        tbl_empleado.setModel(obj_empleado.leer_empleado());
    }//GEN-LAST:event_btn_modificar_empleadoActionPerformed

      public void select_empleado(){
        int fila = tbl_empleado.getSelectedRow();
        lbl_id_empleado.setText(tbl_empleado.getValueAt(fila, 0).toString());
        txt_codigo_empleado.setText(tbl_empleado.getValueAt(fila, 1).toString());
        txt_nombre_empleado.setText(tbl_empleado.getValueAt(fila, 2).toString());
        txt_apellido_empleado.setText(tbl_empleado.getValueAt(fila, 3).toString());
        txt_direccion_empleado.setText(tbl_empleado.getValueAt(fila, 4).toString());
        txt_telefono_empleado.setText(tbl_empleado.getValueAt(fila, 5).toString());
        txt_fecha_nacimiento_empleado.setText(tbl_empleado.getValueAt(fila, 6).toString());
        txt_puesto.setText(tbl_empleado.getValueAt(fila, 7).toString());
}
    
    private void tbl_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadoMouseClicked
        // TODO add your handling code here:
                select_empleado();
    }//GEN-LAST:event_tbl_empleadoMouseClicked

    private void tbl_empleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_empleadoKeyReleased
        // TODO add your handling code here:
                select_empleado();
    }//GEN-LAST:event_tbl_empleadoKeyReleased

    private void btn_eliminar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_empleadoActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Eliminar el Registro?","Opcion",JOptionPane.YES_OPTION);
        // yes = 0,no = 1;
        if (opcion ==0){
        obj_empleado = new Empleado();
        obj_empleado.setId_empleado(Integer.valueOf(lbl_id_empleado.getText()));
        obj_empleado.eliminar();
        tbl_empleado.setModel(obj_empleado.leer_empleado());
        }
    }//GEN-LAST:event_btn_eliminar_empleadoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar_empleado;
    private javax.swing.JButton btn_conexion_empleado;
    private javax.swing.JButton btn_eliminar_empleado;
    private javax.swing.JButton btn_modificar_empleado;
    private javax.swing.JComboBox<String> cmb_puesto_empleado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id_empleado;
    private javax.swing.JTable tbl_empleado;
    private javax.swing.JTextField txt_apellido_empleado;
    private javax.swing.JTextField txt_codigo_empleado;
    private javax.swing.JTextField txt_direccion_empleado;
    private javax.swing.JTextField txt_fecha_nacimiento_empleado;
    private javax.swing.JTextField txt_nombre_empleado;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_telefono_empleado;
    // End of variables declaration//GEN-END:variables
}
