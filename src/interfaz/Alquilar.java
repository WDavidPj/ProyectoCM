/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Alquiler;
import clases.Helper;
import clases.Persona;
import clases.Toga;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Wdavid
 */
public class Alquilar extends javax.swing.JDialog {

    /**
     * Creates new form Agenda
     */
    String rutaT, rutaC, rutaAl;
    int aux = 0;
    ObjectOutputStream salida;
    ArrayList<Alquiler> alquiler;

    public Alquilar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JButton botonesH[] = {cmdCancelar, cmdIngresarCliente, cmdEliminar};
        JButton botonesD[] = {cmdGuardar};

        Helper.habilitarBotonoes(botonesH);
        Helper.deshabilitarBotonoes(botonesD);
        //Inventario de las Togas
        rutaT = "src/datos/InventariodeTogas.bin";
        //Alquileres
        rutaAl = "src/datos/Alquileres";
        //Clientes Registrados en la interfaz interna
        rutaC = "src/datos/Cliente.txt";
        Helper.llenarComboClientes(cmbCliente, rutaC);
        Helper.llenarcomboFiltralTogas(cmbToga, rutaT);

        try {
            salida = new ObjectOutputStream(new FileOutputStream(rutaAl));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
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

        bgSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cmbToga = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtValorAlqui = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();
        cmbCliente = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dcFechadeEntrega = new com.toedter.calendar.JDateChooser();
        dcFechadeAlquiler = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        cmdIngresarCliente = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alquiler");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Toga");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel2.add(cmbToga, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 330, -1));

        jLabel6.setText("Fechas de Alquiler");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        txtValorAlqui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorAlquiKeyTyped(evt);
            }
        });
        jPanel2.add(txtValorAlqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, -1));

        jLabel8.setText("Valor del Alquiler");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel13.setText("Deposito");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtDeposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepositoKeyTyped(evt);
            }
        });
        jPanel2.add(txtDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 150, -1));

        jPanel2.add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 330, -1));

        jLabel14.setText("Cliente");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel10.setText("Fechas de Entrega");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));
        jPanel2.add(dcFechadeEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, -1));
        jPanel2.add(dcFechadeAlquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 230));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 51, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdIngresarCliente.setBackground(new java.awt.Color(153, 255, 153));
        cmdIngresarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-user-symbol.png"))); // NOI18N
        cmdIngresarCliente.setText("Ingresar");
        cmdIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(cmdIngresarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, 40));

        cmdCancelar.setBackground(new java.awt.Color(153, 255, 153));
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 40));

        cmdEliminar.setBackground(new java.awt.Color(153, 255, 153));
        cmdEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recycle-bin.png"))); // NOI18N
        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 40));

        cmdGuardar.setBackground(new java.awt.Color(153, 255, 153));
        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fountain-pen-close-up.png"))); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 300, 130));

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Alquileres", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Cliente", "Toga", "Valor", "Deposito", "Fecha de Alquiler", "Fecha de Entrega"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 800, 300));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 820, 330));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rapciu_grass.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(852, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarClienteActionPerformed
        Cliente c = new Cliente(null, true);
        c.setVisible(true);
        JButton botonesH[] = {cmdCancelar, cmdEliminar, cmdGuardar};
        JButton botonesD[] = { cmdIngresarCliente};

        Helper.habilitarBotonoes(botonesH);
        Helper.deshabilitarBotonoes(botonesD);
    }//GEN-LAST:event_cmdIngresarClienteActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtDeposito.setText("");
        txtValorAlqui.setText("");
        dcFechadeAlquiler.setDate(null);
        dcFechadeEntrega.setDate(null);
        cmbCliente.setSelectedIndex(0);
        cmbToga.setSelectedIndex(0);
        dcFechadeAlquiler.requestFocusInWindow();

        JButton botonesH[] = {cmdCancelar, cmdIngresarCliente, cmdEliminar, cmdGuardar};
        JButton botonesD[] = {};

        Helper.habilitarBotonoes(botonesH);
        Helper.deshabilitarBotonoes(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed

    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String fechadeentrega, fechadealquiler, auxPersona, celular, auxToga, color;
        int valor, depo, indicePersona, indiceToga;
        Persona persona;
        Toga togas;
        fechadeentrega = dcFechadeEntrega.getDate().toString();
        fechadealquiler = dcFechadeAlquiler.getDate().toString();
        valor = Integer.parseInt(txtValorAlqui.getText());
        depo = Integer.parseInt(txtDeposito.getText());
        //Persona
        auxPersona = cmbCliente.getSelectedItem().toString();
        indicePersona = auxPersona.indexOf("-") - 1;
        celular = auxPersona.substring(0, indicePersona);

        //Toga
        auxToga = cmbToga.getSelectedItem().toString();
        indiceToga = auxToga.indexOf("-") - 1;
        color = auxToga.substring(0, indiceToga);

        ArrayList<Alquiler> alquileresModificado;
        persona = Helper.traerPersonaCelular(celular, rutaC);
        togas = Helper.traerToga(color, rutaT);
        if (txtDeposito.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Ingrese el deposito", 2);
            txtDeposito.requestFocusInWindow();
        } else if (txtValorAlqui.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Ingrese el valor del alquiler", 2);
            txtValorAlqui.requestFocusInWindow();
        } else {

            try {
                if (aux == 0) {
                    System.out.println("va bien");
                    Alquiler a = new Alquiler(fechadeentrega, fechadealquiler, valor, depo, persona, togas);
                    a.guardar(salida);
                } else {
                    alquileresModificado = Helper.modificarAlquiler(rutaAl, valor, fechadeentrega, fechadealquiler, depo);
                    salida = new ObjectOutputStream(new FileOutputStream(rutaAl));
                    Helper.volcado(salida, alquileresModificado);
                    aux = 0;
                    Helper.mensaje(this, "Alquiler Actualizado", 1);
                }

            } catch (IOException ex) {
                Logger.getLogger(Alquilar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Helper.llenarTablaAlquiler(jTable1, rutaAl);
        JButton botonesH[] = {cmdCancelar, cmdEliminar ,cmdIngresarCliente};
        JButton botonesD[] = {cmdGuardar} ;

        Helper.habilitarBotonoes(botonesH);
        Helper.deshabilitarBotonoes(botonesD);
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void txtValorAlquiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorAlquiKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtValorAlquiKeyTyped

    private void txtDepositoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepositoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtDepositoKeyTyped

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
            java.util.logging.Logger.getLogger(Alquilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alquilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alquilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alquilar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Alquilar dialog = new Alquilar(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbCliente;
    private javax.swing.JComboBox cmbToga;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdIngresarCliente;
    private com.toedter.calendar.JDateChooser dcFechadeAlquiler;
    private com.toedter.calendar.JDateChooser dcFechadeEntrega;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtValorAlqui;
    // End of variables declaration//GEN-END:variables
}
