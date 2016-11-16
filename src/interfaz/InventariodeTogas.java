/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Toga;
import clases.Uniformes;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Wdavid
 */
public class InventariodeTogas extends javax.swing.JDialog {

    /**
     * Creates new form Agenda
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Toga> toga;
    int aux = 0;

    public InventariodeTogas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/InventariodeTogas.bin";
        try {
            toga = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Helper.volcado(salida, toga);
        Helper.llenarTablaTogas(tblTablaUniformes, ruta);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtColor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbBirete = new javax.swing.JComboBox();
        cmbCamisa = new javax.swing.JComboBox();
        cmbBufanda = new javax.swing.JComboBox();
        txtCantCamisas = new javax.swing.JTextField();
        txtCantBirete = new javax.swing.JTextField();
        txtCantBufandas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaUniformes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventario de Togas");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, -1));

        jLabel2.setText("Color");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setText("Bufanda");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setText("Cantidad de Bufandas");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel8.setText("Cantidad de Camisas");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel9.setText("Birete");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel14.setText("Cantidad de Biretes");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel15.setText("Camisa");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        cmbBirete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        jPanel2.add(cmbBirete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));

        cmbCamisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        jPanel2.add(cmbCamisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, -1));

        cmbBufanda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        jPanel2.add(cmbBufanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, -1));

        txtCantCamisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantCamisasActionPerformed(evt);
            }
        });
        jPanel2.add(txtCantCamisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 100, -1));
        jPanel2.add(txtCantBirete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 100, -1));

        txtCantBufandas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantBufandasKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantBufandas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 490, 170));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 51, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setBackground(new java.awt.Color(153, 255, 153));
        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-user-symbol.png"))); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 40));

        cmdEliminar.setBackground(new java.awt.Color(153, 255, 153));
        cmdEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recycle-bin.png"))); // NOI18N
        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 40));

        cmdLimpiar.setBackground(new java.awt.Color(153, 255, 153));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 110, 40));

        cmdBuscar.setBackground(new java.awt.Color(153, 255, 153));
        cmdBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/magnifier.png"))); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 280, 160));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inventario de Togas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, null, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaUniformes.setBackground(new java.awt.Color(153, 255, 153));
        tblTablaUniformes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        tblTablaUniformes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Color", "Bufanda", "Cantidad", "Birete", "Cantidad", "Camisa", "Cantidad"
            }
        ));
        tblTablaUniformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaUniformesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTablaUniformes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 900, 340));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 920, 370));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wall3.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(966, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String color, bufanda, birete, camisa;
        String cantcamisa, cantbiretes, cantbufandas;
        color = txtColor.getText();
        bufanda = cmbBufanda.getSelectedItem().toString();
        birete = cmbBirete.getSelectedItem().toString();
        camisa = cmbCamisa.getSelectedItem().toString();
        cantcamisa = txtCantCamisas.getText();
        cantbiretes = txtCantBirete.getText();
        cantbufandas = txtCantBufandas.getText();
        if (txtColor.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Increse un color para continuar", 1);
        } else if (txtCantBirete.getText().trim().isEmpty()) {
            Helper.mensaje(this, "por favor increse una cantidad de biretes , en caso de que no haya increse nn", 1);
            cmbBirete.setSelectedIndex(1);
        } else if (txtCantBufandas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "por favor increse una cantidad de bufandas , en caso de que no haya increse nn", 1);
            cmbBufanda.setSelectedIndex(1);
        } else if (txtCantCamisas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "por favor increse una cantidad de camisas , en caso de que no haya increse nn", 1);
            cmbCamisa.setSelectedIndex(1);
        } else {
            ArrayList<Toga> togaModificado;
            try {
                if (aux == 0) {
                    Toga t = new Toga(color, bufanda, birete, camisa, cantcamisa, cantbiretes, cantbufandas);
                    t.guardar(salida);
                } else {
                    togaModificado = Helper.modificarToga(ruta, color, bufanda, birete, camisa, cantcamisa, cantbiretes, cantbufandas);
                    salida = new ObjectOutputStream(new FileOutputStream(ruta));
                    Helper.volcado(salida, togaModificado);
                    aux = 0;
                    Helper.mensaje(this, "Toga Actualizada Correctamente!", 1);
                }
            } catch (IOException ex) {
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.llenarTablaTogas(tblTablaUniformes, ruta);

            txtColor.setText("");
            cmbBirete.setSelectedItem(0);
            cmbBufanda.setSelectedItem(0);
            cmbCamisa.setSelectedItem(0);
            bgSexo.clearSelection();
            txtCantBirete.setText("");
            txtCantBufandas.setText("");
            txtCantCamisas.setText("");
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void tblTablaUniformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaUniformesMouseClicked
        int i;
        Toga t;

        ArrayList<Toga> togas = Helper.traerDatos(ruta);
        i = tblTablaUniformes.getSelectedRow();
        t = togas.get(i);

        txtColor.setText(t.getColor());
        cmbBirete.setSelectedItem(t.getBirete());
        cmbBufanda.setSelectedItem(t.getBufanda());
        cmbCamisa.setSelectedItem(t.getCamisa());
        txtCantBirete.setText(t.getCantBirete());
        txtCantBufandas.setText(t.getCantBufanda());
        txtCantCamisas.setText(t.getCantCamisa());


    }//GEN-LAST:event_tblTablaUniformesMouseClicked

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;

        op = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar esta toga del inventario?", "Eliminar", JOptionPane.YES_NO_OPTION);
        ArrayList<Toga> togas = Helper.traerDatos(ruta);
        if (op == JOptionPane.YES_OPTION) {

            i = tblTablaUniformes.getSelectedRow();
            togas.remove(i);
            try {
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(InventariodeTogas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InventariodeTogas.class.getName()).log(Level.SEVERE, null, ex);
            }
            Helper.volcado(salida, togas);
            Helper.llenarTablaTogas(tblTablaUniformes, ruta);

        } else {

        }
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtCantBirete.setText("");
        txtCantBufandas.setText("");
        txtCantCamisas.setText("");
        txtColor.setText("");
        cmbBirete.setSelectedItem(0);
        cmbBufanda.setSelectedItem(0);
        cmbCamisa.setSelectedItem(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtCantCamisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantCamisasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantCamisasActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String color;
        color = txtColor.getText();
        Toga t;
        if (Helper.buscarToga(color, ruta)) {
            t = Helper.traerToga(color, ruta);
            txtColor.setText(t.getColor());
            txtCantBirete.setText(t.getCantBirete());
            txtCantBufandas.setText(t.getCantBufanda());
            txtCantCamisas.setText(t.getCantCamisa());
            cmbBufanda.setSelectedItem(t);
            cmbBirete.setSelectedItem(t);
            cmbCamisa.setSelectedItem(t);
            aux = 1;
        } else {
            txtColor.requestFocusInWindow();
            aux = 0;
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void txtCantBufandasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantBufandasKeyTyped
        
    }//GEN-LAST:event_txtCantBufandasKeyTyped

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
            java.util.logging.Logger.getLogger(InventariodeTogas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventariodeTogas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventariodeTogas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventariodeTogas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InventariodeTogas dialog = new InventariodeTogas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JComboBox cmbBirete;
    private javax.swing.JComboBox cmbBufanda;
    private javax.swing.JComboBox cmbCamisa;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaUniformes;
    private javax.swing.JTextField txtCantBirete;
    private javax.swing.JTextField txtCantBufandas;
    private javax.swing.JTextField txtCantCamisas;
    private javax.swing.JTextField txtColor;
    // End of variables declaration//GEN-END:variables
}
