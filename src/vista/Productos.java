
package vista;

import conexion.Conexion;
import controlador.Ctrl_Productos;
import controlador.Ctrl_Veterinario;
import static controlador.Ctrl_Veterinario.validarContrasena;
import static controlador.Ctrl_Veterinario.validarCorreo;
import static controlador.Ctrl_Veterinario.validarNombre;
import static controlador.Ctrl_Veterinario.validarTelefono;
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
import modelo.Producto;
import modelo.Veterinario;

public class Productos extends javax.swing.JFrame {
    private Ctrl_Productos prod;

    public Productos() {
    this.prod = new Ctrl_Productos();
        initComponents();
        this.setSize(new Dimension(1320, 800));
        this.setLocationRelativeTo(null);
        this.setTitle("Veterinarios");

try {
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    //SwingUtilities.updateComponentTreeUI(chooser_fehca_nac);
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}


        //Cargar tabla
        CargarTabla("MostrarProductos");
    }

    public JPanel getPanelProd() {
        return PanelProd;
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
        PanelProd = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_nombre = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        combobox_categoria = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txt_existencias = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_proveedor = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        btn_refrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personas");
        setBackground(new java.awt.Color(255, 255, 255));

        PanelProd.setBackground(new java.awt.Color(255, 255, 255));
        PanelProd.setPreferredSize(new java.awt.Dimension(1120, 723));

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
                "Id", "Nombre", "Descripción", "Precio", "Existencias", "Categoria", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
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
            tabla.getColumnModel().getColumn(1).setMinWidth(150);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(1).setMaxWidth(150);
            tabla.getColumnModel().getColumn(2).setMinWidth(250);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(250);
            tabla.getColumnModel().getColumn(2).setMaxWidth(250);
            tabla.getColumnModel().getColumn(3).setMinWidth(60);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(60);
            tabla.getColumnModel().getColumn(3).setMaxWidth(60);
            tabla.getColumnModel().getColumn(4).setMinWidth(65);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(65);
            tabla.getColumnModel().getColumn(4).setMaxWidth(65);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_precio.setBackground(new java.awt.Color(255, 255, 255));
        txt_precio.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 22, 39));
        jLabel11.setText("Descripción");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 22, 39));
        jLabel12.setText("Nombre completo");

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 22, 39));
        jLabel14.setText("Precio");

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(1, 22, 39));
        jLabel15.setText("Proveedor");

        jLabel17.setBackground(new java.awt.Color(250, 214, 29));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 65)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(250, 214, 29));
        jLabel17.setText("Productos");

        combobox_categoria.setBackground(new java.awt.Color(255, 255, 255));
        combobox_categoria.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_categoria.setForeground(new java.awt.Color(0, 0, 0));
        combobox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentos", "Higiene", "Medicamentos", "Entrenamiento", "Ropa y accesorios", "Hogar" }));
        combobox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_categoriaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 22, 39));
        jLabel16.setText("Existencias");

        txt_existencias.setBackground(new java.awt.Color(255, 255, 255));
        txt_existencias.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_existencias.setForeground(new java.awt.Color(0, 0, 0));

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(1, 22, 39));
        jLabel18.setText("Categoría");

        txt_proveedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_proveedor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_proveedor.setForeground(new java.awt.Color(0, 0, 0));

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane4.setViewportView(txt_descripcion);

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 255));
        btn_refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refrescar.png"))); // NOI18N
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProdLayout = new javax.swing.GroupLayout(PanelProd);
        PanelProd.setLayout(PanelProdLayout);
        PanelProdLayout.setHorizontalGroup(
            PanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProdLayout.createSequentialGroup()
                .addGroup(PanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelProdLayout.createSequentialGroup()
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelProdLayout.createSequentialGroup()
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_existencias, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(combobox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(PanelProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(617, 823, Short.MAX_VALUE))
        );
        PanelProdLayout.setVerticalGroup(
            PanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(17, 17, 17)
                .addGroup(PanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelProdLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_existencias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18)
                        .addGap(5, 5, 5)
                        .addComponent(combobox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15)
                        .addGap(5, 5, 5)
                        .addComponent(txt_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(PanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(PanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(PanelProd);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
    // Guarda los valores de lo jtextfields
    String nombre = txt_nombre.getText().trim();
    String categoria = combobox_categoria.getSelectedItem().toString();

    // Verifica si el campo de texto está vacío y asigna "NULL" si es así
    if (nombre.isEmpty()) {
        nombre = "NULL";
    }else {
        nombre = "'" + nombre + "'";
    }
    if (categoria.isEmpty()) {
        categoria = "NULL";
    }else {
        categoria = "'" + categoria + "'";
    }

    // Llama al procedimiento almacenado pasando los valores correctamente formateados
    CargarTabla("BuscarProducto("+nombre+", "+ categoria +")");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tabla.getSelectedRow();
        int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        boolean resultado = prod.eliminar(id);

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "El producto se elimino correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar producto");
            CargarTabla("MostrarProductos");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Producto producto = new Producto();
        int fila = tabla.getSelectedRow();
        producto.id = (Integer) tabla.getValueAt(fila, 0);
        producto.setNombre(txt_nombre.getText().trim());
        producto.setDescripcion(txt_descripcion.getText().trim());
        String precioStr = txt_precio.getText().trim();
        double precio = Double.parseDouble(precioStr);
        producto.setPrecio(precio);String existenciasStr = txt_existencias.getText().trim();
        int existencias = Integer.parseInt(existenciasStr);
        producto.setExistencias(existencias);
        producto.setCategoria((String) combobox_categoria.getSelectedItem());
        producto.setProveedor(txt_proveedor.getText().trim());

        boolean resultado = prod.editar(producto);
        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "El Producto se actualizo correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto");
            CargarTabla("MostrarProductos");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Producto producto = new Producto();
        producto.setNombre(txt_nombre.getText().trim());
        producto.setDescripcion(txt_descripcion.getText().trim());
        String precioStr = txt_precio.getText().trim();
        double precio = Double.parseDouble(precioStr);
        producto.setPrecio(precio);String existenciasStr = txt_existencias.getText().trim();
        int existencias = Integer.parseInt(existenciasStr);
        producto.setExistencias(existencias);
        producto.setCategoria((String) combobox_categoria.getSelectedItem());
        producto.setProveedor(txt_proveedor.getText().trim());

        boolean resultado = prod.agregar(producto);
        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "El Producto se agrego correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar el producto");
            CargarTabla("MostrarProductos");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        btn_editar.setEnabled(true);
        btn_eliminar.setEnabled(true);

        int fila = tabla.getSelectedRow();
        String nombre = (String) tabla.getValueAt(fila, 1);
        String descripcion = (String) tabla.getValueAt(fila, 2);
        String precio = (String) tabla.getValueAt(fila, 3);
        String cantidad = (String) tabla.getValueAt(fila, 4);
        String categoria = (String) tabla.getValueAt(fila, 5);
        String proveedor = (String) tabla.getValueAt(fila, 6);

        // Pasa los datos obtenidos a los JTextFields correspondientes      
        txt_nombre.setText(nombre);
        txt_descripcion.setText(descripcion);
        txt_precio.setText(precio);
        txt_existencias.setText(cantidad);
        combobox_categoria.setSelectedItem(categoria.toString());
        txt_proveedor.setText(proveedor);
    }//GEN-LAST:event_tablaMouseClicked

    private void combobox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_categoriaActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

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
                new Veterinarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProd;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JComboBox<String> combobox_categoria;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_existencias;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_proveedor;
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
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Existencias");
        modeloTabla.addColumn("Categoria");
        modeloTabla.addColumn("Proveedor");
        tabla.setModel(modeloTabla);

        // Se definen los tamaños de la tabla
        tabla.setRowHeight(75);
        tabla.getColumnModel().getColumn(0).setMinWidth(50);
        tabla.getColumnModel().getColumn(0).setMaxWidth(50);
        tabla.getColumnModel().getColumn(3).setMinWidth(90);
        tabla.getColumnModel().getColumn(3).setMaxWidth(90);
        tabla.getColumnModel().getColumn(4).setMinWidth(100);
        tabla.getColumnModel().getColumn(4).setMaxWidth(100);
        DefaultTableCellRenderer cellRenderer = new LineWrapTableCellRenderer();
        tabla.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(6).setCellRenderer(cellRenderer);


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
            fila[1] = resultSet.getString("nombre");
            fila[2] = resultSet.getString("descripcion");
            fila[3] = resultSet.getString("precio");
            fila[4] = resultSet.getString("existencias");
            fila[5] = resultSet.getString("categoria");
            fila[6] = resultSet.getString("proveedor");
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
        txt_nombre.setText("");
        txt_descripcion.setText("");
        txt_precio.setText("");
        txt_existencias.setText("");
        txt_proveedor.setText("");
        combobox_categoria.setSelectedItem("Alimentos");

        // Desactivar los botones
        btn_editar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        CargarTabla("MostrarProductos");
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
