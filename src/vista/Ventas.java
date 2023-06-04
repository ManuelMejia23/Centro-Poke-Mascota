
package vista;

import conexion.Conexion;
import controlador.Ctrl_Ventas;
import controlador.Ctrl_Veterinario;
import static controlador.Ctrl_Visitas.validarDecimal;
import static controlador.Ctrl_Visitas.validarEntero;
import static controlador.Ctrl_Visitas.validarHora;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.*;
import modelo.Venta;
import modelo.Veterinario;
import modelo.Visita;

public class Ventas extends javax.swing.JFrame {
    private Ctrl_Ventas vent;

    public Ventas() {
    this.vent = new Ctrl_Ventas();
        initComponents();
        this.setSize(new Dimension(1320, 800));
        this.setLocationRelativeTo(null);
        this.setTitle("Mascotas");

try {
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    //SwingUtilities.updateComponentTreeUI(chooser_fehca_nac);
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
        // Llenar el JComboBox con los nombres de los clientes
        vent.cargarClientes(combobox_cliente);
        vent.cargarProductos(combobox_producto);

        //Cargar tabla
        CargarTabla("MostrarVentas");
    }

    public JPanel getPanelVen() {
        return PanelVen;
    }

public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelVen = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_cliente = new javax.swing.JTextField();
        txt_producto = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        combobox_cliente = new javax.swing.JComboBox<>();
        combobox_producto = new javax.swing.JComboBox<>();
        btn_refrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personas");
        setBackground(new java.awt.Color(255, 255, 255));

        PanelVen.setBackground(new java.awt.Color(255, 255, 255));
        PanelVen.setPreferredSize(new java.awt.Dimension(1120, 723));

        btn_agregar.setBackground(new java.awt.Color(132, 218, 244));
        btn_agregar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(1, 22, 39));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setPreferredSize(new java.awt.Dimension(65, 41));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(132, 218, 244));
        btn_editar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(1, 22, 39));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setEnabled(false);
        btn_editar.setPreferredSize(new java.awt.Dimension(66, 42));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(132, 218, 244));
        btn_eliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(1, 22, 39));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(132, 218, 244));
        btn_buscar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(1, 22, 39));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(255, 204, 255));
        tabla.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "idcliente", "Cliente", "idproducto", "Producto", "Cantidad", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(132, 218, 244));
        tabla.setSelectionForeground(new java.awt.Color(103, 14, 148));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(30);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla.getColumnModel().getColumn(0).setMaxWidth(30);
            tabla.getColumnModel().getColumn(1).setMinWidth(0);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(1).setMaxWidth(0);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setMinWidth(0);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(3).setMaxWidth(0);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(5).setMinWidth(70);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(5).setMaxWidth(70);
            tabla.getColumnModel().getColumn(6).setMinWidth(90);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(6).setMaxWidth(90);
        }

        txt_cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_cliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_cliente.setForeground(new java.awt.Color(0, 0, 0));

        txt_producto.setBackground(new java.awt.Color(255, 255, 255));
        txt_producto.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_producto.setForeground(new java.awt.Color(0, 0, 0));

        txt_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 22, 39));
        jLabel11.setText("Producto(ID)");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 22, 39));
        jLabel12.setText("Cliente(ID)");

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 22, 39));
        jLabel14.setText("Cantidad");

        jLabel17.setBackground(new java.awt.Color(250, 214, 29));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 65)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(250, 214, 29));
        jLabel17.setText("Ventas");

        combobox_cliente.setBackground(new java.awt.Color(255, 255, 255));
        combobox_cliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_cliente.setForeground(new java.awt.Color(0, 0, 0));
        combobox_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        combobox_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_clienteActionPerformed(evt);
            }
        });

        combobox_producto.setBackground(new java.awt.Color(255, 255, 255));
        combobox_producto.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_producto.setForeground(new java.awt.Color(0, 0, 0));
        combobox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        combobox_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_productoActionPerformed(evt);
            }
        });

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 255));
        btn_refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refrescar.png"))); // NOI18N
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVenLayout = new javax.swing.GroupLayout(PanelVen);
        PanelVen.setLayout(PanelVenLayout);
        PanelVenLayout.setHorizontalGroup(
            PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVenLayout.createSequentialGroup()
                .addGroup(PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVenLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVenLayout.createSequentialGroup()
                        .addGroup(PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelVenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelVenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelVenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelVenLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelVenLayout.createSequentialGroup()
                                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVenLayout.createSequentialGroup()
                                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelVenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(combobox_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelVenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelVenLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(combobox_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelVenLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelVenLayout.setVerticalGroup(
            PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(17, 17, 17)
                .addGroup(PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelVenLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelVenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(PanelVen);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1311, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
    // Guarda los valores de lo jtextfields
    String clienteText = txt_cliente.getText().trim();
    int cliente = Integer.parseInt(clienteText);

    // Llama al procedimiento almacenado pasando los valores correctamente formateados
    CargarTabla("BuscarVenta(" +cliente +")");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tabla.getSelectedRow();
        int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        boolean resultado = vent.eliminar(id);

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "La venta se elimino correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar venta");
            CargarTabla("MostrarVentas");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Venta venta = new Venta();
        int fila = tabla.getSelectedRow();
        venta.id = (Integer) tabla.getValueAt(fila, 0);
        String clienteStr = txt_cliente.getText().trim();
        int cliente = Integer.parseInt(clienteStr);
        venta.setCliente(cliente);

        String productosStr = txt_producto.getText().trim();
        int producto = Integer.parseInt(productosStr);
        venta.setProducto(producto);

        String cantidadStr = txt_cantidad.getText().trim();
        int cantidad = Integer.parseInt(cantidadStr);
        venta.setCantidad(cantidad);

        boolean resultado = vent.editar(venta);
        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "La venta se actualizo correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar venta");
            CargarTabla("MostrarVentas");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Venta venta = new Venta();
        String clienteStr = txt_cliente.getText().trim();
        int cliente = Integer.parseInt(clienteStr);
        venta.setCliente(cliente);

        String productosStr = txt_producto.getText().trim();
        int producto = Integer.parseInt(productosStr);
        venta.setProducto(producto);

        String cantidadStr = txt_cantidad.getText().trim();
        int cantidad = Integer.parseInt(cantidadStr);
        venta.setCantidad(cantidad);

        boolean resultado = vent.agregar(venta);
        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "La venta se agrego correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar venta");
            CargarTabla("MostrarVentas");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        btn_editar.setEnabled(true);
        btn_eliminar.setEnabled(true);

        // Pasa los datos obtenidos a los JTextFields correspondientes
        int fila = tabla.getSelectedRow();
        txt_cliente.setText((String) tabla.getValueAt(fila, 1));
        txt_producto.setText((String) tabla.getValueAt(fila, 3));
        txt_cantidad.setText((String) tabla.getValueAt(fila, 5));
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void combobox_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_clienteActionPerformed
        String nombreCliente = (String) combobox_cliente.getSelectedItem();
    if (nombreCliente != null) {
        // Realizar la consulta en la base de datos para obtener el cliente_id
        Connection cn = Conexion.conectar();
        try  {
            String sql = "SELECT cliente_id FROM nombre_clientes WHERE nombre_cliente = ?";
            PreparedStatement stmt = cn.prepareStatement(sql);
            stmt.setString(1, nombreCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String clienteId = rs.getString("cliente_id");
                txt_cliente.setText(clienteId);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }}
    }//GEN-LAST:event_combobox_clienteActionPerformed

    private void combobox_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_productoActionPerformed
        String nombreCliente = (String) combobox_producto.getSelectedItem();
    if (nombreCliente != null) {
        // Realizar la consulta en la base de datos para obtener el cliente_id
        Connection cn = Conexion.conectar();
        try  {
            String sql = "SELECT id FROM productos WHERE nombre = ?";
            PreparedStatement stmt = cn.prepareStatement(sql);
            stmt.setString(1, nombreCliente);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String clienteId = rs.getString("id");
                txt_producto.setText(clienteId);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }}
    }//GEN-LAST:event_combobox_productoActionPerformed

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
            java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelVen;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JComboBox<String> combobox_cliente;
    private javax.swing.JComboBox<String> combobox_producto;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_producto;
    // End of variables declaration//GEN-END:variables
/*
     * *****************************************************
     * metodo para mostrar todos los clientes registrados
     * *****************************************************
     */
    public void CargarTabla(String procedimiento) {
    try {
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        // Crear el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("idCliente");
        modeloTabla.addColumn("Cliente");
        modeloTabla.addColumn("idProducto");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Fecha");
        tabla.setModel(modeloTabla);

        // Se definen los tamaños de la tabla
        tabla.setRowHeight(50);
        tabla.getColumnModel().getColumn(0).setMinWidth(50);
        tabla.getColumnModel().getColumn(0).setMaxWidth(50);
        tabla.getColumnModel().getColumn(1).setMinWidth(0);
        tabla.getColumnModel().getColumn(1).setMaxWidth(0);
        tabla.getColumnModel().getColumn(3).setMinWidth(0);
        tabla.getColumnModel().getColumn(3).setMaxWidth(0);
        tabla.getColumnModel().getColumn(5).setMinWidth(90);
        tabla.getColumnModel().getColumn(5).setMaxWidth(90);
        tabla.getColumnModel().getColumn(6).setMinWidth(100);
        tabla.getColumnModel().getColumn(6).setMaxWidth(100);
        DefaultTableCellRenderer cellRenderer = new LineWrapTableCellRenderer();
        tabla.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);


        // Conectarse a la base de datos
        Connection cn = Conexion.conectar();

        // Ejecutar la consulta en la vista;
        String sql = "{ CALL "+procedimiento+" }";
        PreparedStatement statement = cn.prepareStatement(sql);

        // Ejecutar la consulta y obtener los resultados
        ResultSet resultSet = statement.executeQuery();

        // Agregar los datos obtenidos a la tabla
        while (resultSet.next()) {
            Object[] fila = new Object[7];
            fila[0] = resultSet.getInt("id");
            fila[1] = resultSet.getString("idCliente");
            fila[2] = resultSet.getString("cliente");
            fila[3] = resultSet.getString("idProducto");
            fila[4] = resultSet.getString("producto");
            fila[5] = resultSet.getString("cantidad");
            fila[6] = resultSet.getString("fecha");
            modeloTabla.addRow(fila);
        }
        resultSet.close();
        statement.close();
        cn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    /*
     * *********************************************************
     * metodo para limpiar los textfields y actualizar la tabla
     * *********************************************************
     */
    private void Limpiar() {
        // Poner en blanco los campos de texto
        txt_cliente.setText("");
        txt_producto.setText("");
        txt_cantidad.setText("");

        // Desactivar los botones
        btn_editar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        CargarTabla("MostrarVentas");
        vent.cargarClientes(combobox_cliente);
        vent.cargarProductos(combobox_producto);
    }

    /*
     * *****************************************************
     * metodo para darle formato de textarea a la tabla
     * *****************************************************
     */
    public class LineWrapTableCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            // Crear un JTextArea para permitir el salto de línea
            JTextArea textArea = new JTextArea();

            // Establecer el texto del JTextArea como el valor de la celda
            textArea.setText(String.valueOf(value));

            // Configurar el salto de línea
            textArea.setWrapStyleWord(true);
            textArea.setLineWrap(true);

            // Hacer que el JTextArea sea opaco para que se muestre el fondo
            textArea.setOpaque(true);

            // Establecer la fuente y el tamaño deseado
            Font tableFont = table.getFont();
            textArea.setFont(new Font(tableFont.getName(), tableFont.getStyle(), tableFont.getSize()));

            // Establecer el color de fondo y el color de primer plano basado en la selección
            if (isSelected) {
                textArea.setBackground(table.getSelectionBackground());
                textArea.setForeground(table.getSelectionForeground());
            } else {
                textArea.setBackground(table.getBackground());
                textArea.setForeground(table.getForeground());
            }

            // Devolver el JTextArea como el componente de renderizado de la celda
            return textArea;
        }
    }

}
