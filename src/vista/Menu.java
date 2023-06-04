package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author manue
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
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
        veterinarios = new javax.swing.JLabel();
        clientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mascotas = new javax.swing.JLabel();
        visitas = new javax.swing.JLabel();
        productos = new javax.swing.JLabel();
        ventas = new javax.swing.JLabel();
        facturas = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        clientes1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jLabel0.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel0.setForeground(new java.awt.Color(231, 29, 54));
        jLabel0.setText("Veterinarios");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(162, 156, 187));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(162, 156, 187));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 800));

        veterinarios.setBackground(new java.awt.Color(0, 0, 0));
        veterinarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        veterinarios.setForeground(new java.awt.Color(28, 35, 126));
        veterinarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        veterinarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/veterinarios.png"))); // NOI18N
        veterinarios.setText("Veterinarios");
        veterinarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                veterinariosMouseMoved(evt);
            }
        });
        veterinarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veterinariosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                veterinariosMousePressed(evt);
            }
        });

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

        productos.setBackground(new java.awt.Color(0, 0, 0));
        productos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        productos.setForeground(new java.awt.Color(28, 35, 126));
        productos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos.png"))); // NOI18N
        productos.setText("Productos");
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productosMousePressed(evt);
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

        facturas.setBackground(new java.awt.Color(0, 0, 0));
        facturas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        facturas.setForeground(new java.awt.Color(28, 35, 126));
        facturas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        facturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturas.png"))); // NOI18N
        facturas.setText("Facturas");
        facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                facturasMousePressed(evt);
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

        clientes1.setBackground(new java.awt.Color(0, 0, 0));
        clientes1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        clientes1.setForeground(new java.awt.Color(28, 35, 126));
        clientes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        clientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Personas.png"))); // NOI18N
        clientes1.setText("Administrador");
        clientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientes1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(veterinarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mascotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(visitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(facturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientes1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(veterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(visitas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(clientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(150, 150, 150)
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veterinariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veterinariosMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_veterinariosMouseMoved

    private void veterinariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veterinariosMouseClicked
    
    }//GEN-LAST:event_veterinariosMouseClicked

    private void veterinariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veterinariosMousePressed
        // Crear una instancia del JPanel de la otra clase
        Veterinarios vet = new Veterinarios();
        JPanel base = vet.getPanelVet();
        base.setSize(1470, 800);
        base.setLocation(0, 0);

        // Limpiar el JPanel existente
        jPanel2.removeAll();
        // Agregar el JPanel de la otra clase al JPanel existente
        jPanel2.add(base, BorderLayout.CENTER);
        //jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_veterinariosMousePressed

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

    private void productosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMousePressed
        // Crear una instancia del JPanel de la otra clase
        Productos prod = new Productos();
        JPanel base = prod.getPanelProd();
        base.setSize(1470, 800);
        base.setLocation(0, 0);

        // Limpiar el JPanel existente
        jPanel2.removeAll();
        // Agregar el JPanel de la otra clase al JPanel existente
        jPanel2.add(base, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_productosMousePressed

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

    private void facturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturasMousePressed
        // Crear una instancia del JPanel de la otra clase
        Facturas fact = new Facturas();
        JPanel base = fact.getPanelFact();
        base.setSize(1470, 800);
        base.setLocation(0, 0);

        // Limpiar el JPanel existente
        jPanel2.removeAll();
        // Agregar el JPanel de la otra clase al JPanel existente
        jPanel2.add(base, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_facturasMousePressed

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirMousePressed

    private void clientes1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientes1MousePressed
        Administradores admin = new Administradores();
        JPanel base = admin.getPanelAdmin();
        base.setSize(1470, 800);
        base.setLocation(0, 0);

        // Limpiar el JPanel existente
        jPanel2.removeAll();
        // Agregar el JPanel de la otra clase al JPanel existente
        jPanel2.add(base, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_clientes1MousePressed

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
    private javax.swing.JLabel clientes1;
    private javax.swing.JLabel facturas;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mascotas;
    private javax.swing.JLabel productos;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel ventas;
    private javax.swing.JLabel veterinarios;
    private javax.swing.JLabel visitas;
    // End of variables declaration//GEN-END:variables
}
