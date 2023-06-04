package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author manue
 */
public class MenuVet extends javax.swing.JFrame {

    public MenuVet() {
        initComponents();
        this.setSize(new Dimension(1500, 850));
        this.setLocationRelativeTo(null);

        // Obtener el PanelVet de la instancia de Clientes
        Clientes cli = new Clientes();
        JPanel base = cli.getPanelCli();

    // Agregar el PanelVet al JPanel2 de Menu
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add(base, BorderLayout.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel0 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        clientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mascotas = new javax.swing.JLabel();
        visitas = new javax.swing.JLabel();
        ventas = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jLabel0.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel0.setForeground(new java.awt.Color(231, 29, 54));
        jLabel0.setText("Veterinarios");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(162, 156, 187));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(162, 156, 187));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 800));

        clientes.setBackground(new java.awt.Color(0, 0, 0));
        clientes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        clientes.setForeground(new java.awt.Color(28, 35, 126));
        clientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        clientes.setText("Clientes");
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo menu.png"))); // NOI18N

        mascotas.setBackground(new java.awt.Color(0, 0, 0));
        mascotas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        mascotas.setForeground(new java.awt.Color(28, 35, 126));
        mascotas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mascotas.png"))); // NOI18N
        mascotas.setText("Mascotas");
        mascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mascotasMousePressed(evt);
            }
        });

        visitas.setBackground(new java.awt.Color(0, 0, 0));
        visitas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        visitas.setForeground(new java.awt.Color(28, 35, 126));
        visitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        visitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visitas.png"))); // NOI18N
        visitas.setText("Visitas");
        visitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                visitasMousePressed(evt);
            }
        });

        ventas.setBackground(new java.awt.Color(0, 0, 0));
        ventas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ventas.setForeground(new java.awt.Color(28, 35, 126));
        ventas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        ventas.setText("Ventas");
        ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ventasMousePressed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(231, 29, 54));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        salir.setText("Cerrar sesión");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(visitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(visitas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(250, 250, 250)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1620, 800));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1620, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMousePressed
        // Crear una instancia del JPanel de la otra clase
        Clientes cli = new Clientes();
        JPanel base = cli.getPanelCli();
        base.setSize(1320, 800);
        base.setLocation(0, 0);

        // Limpiar el JPanel existente
        jPanel2.removeAll();
        // Agregar el JPanel de la otra clase al JPanel existente
        jPanel2.add(base, BorderLayout.CENTER);
        //jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_clientesMousePressed

    private void mascotasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotasMousePressed
        // Crear una instancia del JPanel de la otra clase
        Mascotas pet = new Mascotas();
        JPanel base = pet.getPanelPet();
        base.setSize(1470, 800);
        base.setLocation(0, 0);

        // Limpiar el JPanel existente
        jPanel2.removeAll();
        // Agregar el JPanel de la otra clase al JPanel existente
        jPanel2.add(base, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_mascotasMousePressed

    private void visitasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitasMousePressed
        // Crear una instancia del JPanel de la otra clase
        Visitas vis = new Visitas();
        JPanel base = vis.getPanelVis();
        base.setSize(1470, 800);
        base.setLocation(0, 0);

        // Limpiar el JPanel existente
        jPanel2.removeAll();
        // Agregar el JPanel de la otra clase al JPanel existente
        jPanel2.add(base, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_visitasMousePressed

    private void ventasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMousePressed
        // Crear una instancia del JPanel de la otra clase
        Ventas ven = new Ventas();
        JPanel base = ven.getPanelVen();
        base.setSize(1470, 800);
        base.setLocation(0, 0);

        // Limpiar el JPanel existente
        jPanel2.removeAll();
        // Agregar el JPanel de la otra clase al JPanel existente
        jPanel2.add(base, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_ventasMousePressed

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        FrmLoginVet login = new FrmLoginVet();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirMousePressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clientes;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mascotas;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel ventas;
    private javax.swing.JLabel visitas;
    // End of variables declaration//GEN-END:variables
}
