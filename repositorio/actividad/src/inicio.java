
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soft2-01
 */
public class inicio extends javax.swing.JFrame {

    USUARIO usu= new USUARIO();
    
    public inicio() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        numerodecuenta = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        nombre1 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        numerodecuenta1 = new javax.swing.JTextField();
        direccion1 = new javax.swing.JTextField();
        login1 = new javax.swing.JTextField();
        password1 = new javax.swing.JTextField();
        sug = new javax.swing.JButton();
        le = new javax.swing.JButton();
        com = new javax.swing.JButton();
        ven = new javax.swing.JButton();
        rea = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nombre.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        nombre.setText("Nombre");
        nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        apellido.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        apellido.setText("Apellido");
        apellido.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        numerodecuenta.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        numerodecuenta.setText("Numero de cuenta");
        numerodecuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        direccion.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        direccion.setText("Direccion");
        direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        login.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        login.setText("Login");
        login.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        password.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        password.setText("Password");
        password.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        aceptar.setText("Guardar");
        aceptar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        nombre1.setFont(new java.awt.Font("Latha", 2, 10)); // NOI18N
        nombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });

        apellido1.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        apellido1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        numerodecuenta1.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        numerodecuenta1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        direccion1.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        direccion1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        login1.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        login1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });

        password1.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        password1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        sug.setText("Enviar Sugerencia");
        sug.setBorder(new javax.swing.border.SoftBevelBorder(0));
        sug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugActionPerformed(evt);
            }
        });

        le.setText("Leer");
        le.setBorder(new javax.swing.border.SoftBevelBorder(0));
        le.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leActionPerformed(evt);
            }
        });

        com.setText("Comprar");
        com.setBorder(new javax.swing.border.SoftBevelBorder(0));
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });

        ven.setText("Vender");
        ven.setBorder(new javax.swing.border.SoftBevelBorder(0));
        ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venActionPerformed(evt);
            }
        });

        rea.setText("Realizar Reclamacion");
        rea.setBorder(new javax.swing.border.SoftBevelBorder(0));
        rea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(numerodecuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(nombre1)
                    .addComponent(direccion1)
                    .addComponent(login1)
                    .addComponent(password1)
                    .addComponent(numerodecuenta1))
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sug, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(le, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ven, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aceptar)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rea, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(apellido))
                    .addComponent(apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numerodecuenta)
                            .addComponent(numerodecuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion)
                    .addComponent(direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sug)
                    .addComponent(com))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rea)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ven)
                            .addComponent(le))
                        .addContainerGap(191, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aceptar)
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        
        usu.Nombre= nombre1.getText();
        usu.Apellido= apellido1.getText();
        usu.Numerocuenta= numerodecuenta1.getText();
        usu.Direccion= direccion1.getText();
        usu.Login=login1.getText();
        usu.Password=password1.getText();
        
        
        JOptionPane.showMessageDialog(null,"El Nombre Es: "+ usu.Nombre+"\nEl Apellido Es: "+usu.Apellido+"\nEl Numero De Cuenta Es: "+usu.Numerocuenta+"\nLa Direccion Es: "+usu.Direccion+"\nEl Login Es: "+usu.Login+"\nEl Password Es: "+usu.Password);
      
        
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login1ActionPerformed

    private void sugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugActionPerformed
        
        usu.enviar_sugerencia();
        
    }//GEN-LAST:event_sugActionPerformed

    private void leActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leActionPerformed
        usu.leer();
    }//GEN-LAST:event_leActionPerformed

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        usu.comprar();
    }//GEN-LAST:event_comActionPerformed

    private void venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venActionPerformed
       usu.vender();
    }//GEN-LAST:event_venActionPerformed

    private void reaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reaActionPerformed
        usu.realizar_reclamacion();
    }//GEN-LAST:event_reaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellido1;
    private javax.swing.JButton com;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField direccion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton le;
    private javax.swing.JLabel login;
    private javax.swing.JTextField login1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombre1;
    private javax.swing.JLabel numerodecuenta;
    private javax.swing.JTextField numerodecuenta1;
    private javax.swing.JLabel password;
    private javax.swing.JTextField password1;
    private javax.swing.JButton rea;
    private javax.swing.JButton sug;
    private javax.swing.JButton ven;
    // End of variables declaration//GEN-END:variables
}
