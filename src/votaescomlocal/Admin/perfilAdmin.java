/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votaescomlocal.Admin;

import votaescomlocal.log.Login;

/**
 *
 * @author axel_
 */
public class perfilAdmin extends javax.swing.JFrame {

    /**
     * Creates new form perfilAdmin
     */
    public perfilAdmin() {
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

        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        iconoAdmin = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        iconoVE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuarios = new javax.swing.JButton();
        votaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(16, 104, 163));

        label1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("MI PERFIL");

        iconoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconA.png"))); // NOI18N

        cerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoCerrar.png"))); // NOI18N
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.setContentAreaFilled(false);
        cerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        iconoVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoVE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(iconoVE)
                .addGap(430, 430, 430)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconoAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(cerrarSesion)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrarSesion)
                    .addComponent(iconoAdmin))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoVE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 136, 179));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No hay votación activa por el momento");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        usuarios.setBackground(new java.awt.Color(96, 182, 240));
        usuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuarios.setForeground(new java.awt.Color(255, 255, 255));
        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios72.png"))); // NOI18N
        usuarios.setText("USUARIOS");
        usuarios.setBorderPainted(false);
        usuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usuarios.setMargin(new java.awt.Insets(14, 14, 14, 14));
        usuarios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios72.png"))); // NOI18N
        usuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios96.png"))); // NOI18N
        usuarios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        usuarios.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });

        votaciones.setBackground(new java.awt.Color(96, 182, 240));
        votaciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        votaciones.setForeground(new java.awt.Color(255, 255, 255));
        votaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votaciones72.png"))); // NOI18N
        votaciones.setText("VOTACIONES");
        votaciones.setBorderPainted(false);
        votaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        votaciones.setMargin(new java.awt.Insets(14, 14, 14, 14));
        votaciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votaciones72.png"))); // NOI18N
        votaciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/votaciones88.png"))); // NOI18N
        votaciones.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        votaciones.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        votaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(votaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(votaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        Usuarios users = new Usuarios();
        users.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usuariosActionPerformed

    private void votacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votacionesActionPerformed
        Votaciones votes = new Votaciones();
        votes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_votacionesActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        Login cerrarsesion = new Login();
        cerrarsesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(perfilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perfilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perfilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perfilAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perfilAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JLabel iconoAdmin;
    private javax.swing.JLabel iconoVE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private javax.swing.JButton usuarios;
    private javax.swing.JButton votaciones;
    // End of variables declaration//GEN-END:variables
}
