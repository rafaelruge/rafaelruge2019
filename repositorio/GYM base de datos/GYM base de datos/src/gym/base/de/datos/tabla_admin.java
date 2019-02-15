/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.base.de.datos;

import controladores.AdministradorJpaController;
import entidades.Administrador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class tabla_admin extends javax.swing.JFrame {

    AdministradorJpaController AdMIN = new AdministradorJpaController();
    
    public tabla_admin() {
        initComponents();
        tabla_admin();
        cargar_info_admin();
    }

    DefaultTableModel tabla_admin;

    private void tabla_admin() {
        try {
            tabla_admin = (new DefaultTableModel(
                    null, new String[]{
                        "id administrador", "nombre administrador",
                        "apellido administrador"}) {
                Class[] types = new Class[]{
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class
                    
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int colIndex) {
                    return canEdit[colIndex];
                }
            });
            tabla.setModel(tabla_admin);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "error2");
        }
    }
    
    private void cargar_info_admin() {
        try {
            System.out.println("CARGANDO...");
            
            Object O[] =null;
            List<Administrador> ListAd = AdMIN.findAdministradorEntities();
            
            for (int i =0; i <ListAd.size();i++){
                
                tabla_admin.addRow(O);
                tabla_admin.setValueAt(ListAd.get(i).getIdAdministrador(), i,0);
                tabla_admin.setValueAt(ListAd.get(i).getNombreAdministrador(), i,1);
                tabla_admin.setValueAt(ListAd.get(i).getApellidoAdministrador(), i,2);
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lbfonda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbot.setText("regresar");
        jbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotActionPerformed(evt);
            }
        });
        getContentPane().add(jbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 253, 80, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 200));

        lbfonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/200229.jpg"))); // NOI18N
        getContentPane().add(lbfonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotActionPerformed
        consul tabad  = new consul ();
        tabad.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_jbotActionPerformed

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
            java.util.logging.Logger.getLogger(tabla_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbot;
    private javax.swing.JLabel lbfonda;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
