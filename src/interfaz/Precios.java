/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Ropa;

/**
 *
 * @author Wdavid
 */
public class Precios extends javax.swing.JDialog {

    /**
     * Creates new form Agenda
     */
    public Precios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        txtcolordeTela = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTipodeTela = new javax.swing.JComboBox();
        cmbmetrodeTela = new javax.swing.JComboBox();
        cmbSexo = new javax.swing.JComboBox();
        cmbTalla = new javax.swing.JComboBox();
        cmbHilos = new javax.swing.JComboBox();
        cmbBotones = new javax.swing.JComboBox();
        cmbModa = new javax.swing.JComboBox();
        cmbCorredera = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdCotizar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtcolordeTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 130, -1));

        jLabel1.setText("Hilos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel9.setText("Color de Tela");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("Tipo de Tela");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel11.setText("Metro de Tela");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel12.setText("Sexo");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel2.setText("Talla");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setText("Moda");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 20));

        jLabel4.setText("Botones");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, 20));

        cmbTipodeTela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chifon", "Dril", "Oxford", "Crepe", "Seda" }));
        jPanel2.add(cmbTipodeTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 100, -1));

        cmbmetrodeTela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Metro", "1.5 Metros", "2 Metros" }));
        jPanel2.add(cmbmetrodeTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        jPanel2.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, -1));

        cmbTalla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "14", "16", "S", "M", "X", "XL", "XXL" }));
        jPanel2.add(cmbTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, -1));

        cmbHilos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        jPanel2.add(cmbHilos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 100, -1));

        cmbBotones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "25", "30" }));
        jPanel2.add(cmbBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, -1));

        cmbModa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Facil", "Complicada" }));
        jPanel2.add(cmbModa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, -1));

        cmbCorredera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        jPanel2.add(cmbCorredera, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 100, -1));

        jLabel5.setText("Corredera");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 420, 220));

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 51, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setBackground(new java.awt.Color(255, 204, 0));
        cmdGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fountain-pen-close-up.png"))); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 40));

        cmdCancelar.setBackground(new java.awt.Color(255, 204, 0));
        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 40));

        cmdCotizar.setBackground(new java.awt.Color(255, 204, 0));
        cmdCotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contract.png"))); // NOI18N
        cmdCotizar.setText("Cotizar");
        cmdCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCotizarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 170, 180));

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "Precio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, null, new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel5.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 530, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 590, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo-de-pantalla-Abstracto-229.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

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

        setSize(new java.awt.Dimension(696, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        String color, tipo, metro, sexo, talla, hilo, boton, moda, corredera;

        color = txtcolordeTela.getText();
        tipo = cmbTipodeTela.getSelectedItem().toString();
        metro = cmbmetrodeTela.getSelectedItem().toString();
        sexo = cmbSexo.getSelectedItem().toString();
        talla = cmbTalla.getSelectedItem().toString();
        hilo = cmbHilos.getSelectedItem().toString();
        boton = cmbBotones.getSelectedItem().toString();
        moda = cmbModa.getSelectedItem().toString();
        corredera = cmbCorredera.getSelectedItem().toString();

        Ropa r = new Ropa (color , tipo , metro , sexo , talla , hilo , boton , moda , corredera);
        
        txtcolordeTela.setText("");
        cmbBotones.setSelectedIndex(0);
        cmbCorredera.setSelectedIndex(0);
        cmbHilos.setSelectedIndex(0);
        cmbModa.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        cmbTalla.setSelectedIndex(0);
        cmbTipodeTela.setSelectedIndex(0);
        cmbmetrodeTela.setSelectedIndex(0);
        txtcolordeTela.requestFocusInWindow();
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        txtcolordeTela.setText("");
        cmbBotones.setSelectedIndex(0);
        cmbCorredera.setSelectedIndex(0);
        cmbHilos.setSelectedIndex(0);
        cmbModa.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        cmbTalla.setSelectedIndex(0);
        cmbTipodeTela.setSelectedIndex(0);
        cmbmetrodeTela.setSelectedIndex(0);
        txtcolordeTela.requestFocusInWindow();
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCotizarActionPerformed

    }//GEN-LAST:event_cmdCotizarActionPerformed

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
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Precios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Precios dialog = new Precios(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbBotones;
    private javax.swing.JComboBox cmbCorredera;
    private javax.swing.JComboBox cmbHilos;
    private javax.swing.JComboBox cmbModa;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JComboBox cmbTalla;
    private javax.swing.JComboBox cmbTipodeTela;
    private javax.swing.JComboBox cmbmetrodeTela;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdCotizar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtcolordeTela;
    // End of variables declaration//GEN-END:variables
}
