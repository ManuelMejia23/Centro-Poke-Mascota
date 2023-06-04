
package vista;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import conexion.Conexion;
import controlador.Ctrl_Ventas;
import controlador.Ctrl_Veterinario;
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
import java.io.FileOutputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;
import modelo.Veterinario;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class Facturas extends javax.swing.JFrame {
    public int idSeleccionado = -1;
    private Ctrl_Ventas vent;

    public Facturas() {
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

        vent.cargarClientes(combobox_cliente);
        //Cargar tabla
        //CargarTabla1("MostrarCobro");
    }

    public JPanel getPanelFact() {
        return PanelFact;
    }

public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        txt_nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelFact = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        combobox_cliente = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_total = new javax.swing.JLabel();
        btn_agregar1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personas");
        setBackground(new java.awt.Color(255, 255, 255));

        PanelFact.setBackground(new java.awt.Color(255, 255, 255));
        PanelFact.setPreferredSize(new java.awt.Dimension(1120, 723));

        jLabel17.setBackground(new java.awt.Color(250, 214, 29));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 65)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(250, 214, 29));
        jLabel17.setText("Facturas");

        tabla1.setBackground(new java.awt.Color(255, 204, 255));
        tabla1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "idCliente", "Cliente", "Servicio", "Producto", "Cantidad", "Precio", "Cobrado"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabla1);
        if (tabla1.getColumnModel().getColumnCount() > 0) {
            tabla1.getColumnModel().getColumn(1).setResizable(false);
            tabla1.getColumnModel().getColumn(1).setPreferredWidth(0);
            tabla1.getColumnModel().getColumn(2).setResizable(false);
            tabla1.getColumnModel().getColumn(2).setPreferredWidth(0);
            tabla1.getColumnModel().getColumn(3).setResizable(false);
            tabla1.getColumnModel().getColumn(3).setPreferredWidth(0);
            tabla1.getColumnModel().getColumn(4).setResizable(false);
            tabla1.getColumnModel().getColumn(4).setPreferredWidth(0);
            tabla1.getColumnModel().getColumn(5).setMinWidth(90);
            tabla1.getColumnModel().getColumn(5).setPreferredWidth(90);
            tabla1.getColumnModel().getColumn(5).setMaxWidth(90);
            tabla1.getColumnModel().getColumn(6).setMinWidth(50);
            tabla1.getColumnModel().getColumn(6).setPreferredWidth(50);
            tabla1.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 22, 39));
        jLabel14.setText("Cliente(ID)");

        txt_cliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        combobox_cliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        combobox_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_clienteActionPerformed(evt);
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

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 22, 39));
        jLabel16.setText("Total:");

        txt_total.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 26)); // NOI18N
        txt_total.setForeground(new java.awt.Color(1, 22, 39));
        txt_total.setText("0.00");

        btn_agregar1.setBackground(new java.awt.Color(132, 218, 244));
        btn_agregar1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        btn_agregar1.setForeground(new java.awt.Color(1, 22, 39));
        btn_agregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturas.png"))); // NOI18N
        btn_agregar1.setText("Imprimir factura");
        btn_agregar1.setPreferredSize(new java.awt.Dimension(65, 41));
        btn_agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(1, 22, 39));
        jLabel22.setText("Servicios no cobrados");

        javax.swing.GroupLayout PanelFactLayout = new javax.swing.GroupLayout(PanelFact);
        PanelFact.setLayout(PanelFactLayout);
        PanelFactLayout.setHorizontalGroup(
            PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFactLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFactLayout.createSequentialGroup()
                        .addGroup(PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFactLayout.createSequentialGroup()
                                .addGap(30, 33, Short.MAX_VALUE)
                                .addGroup(PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelFactLayout.createSequentialGroup()
                                        .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combobox_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFactLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76))
                            .addGroup(PanelFactLayout.createSequentialGroup()
                                .addGroup(PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFactLayout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelFactLayout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(btn_agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PanelFactLayout.setVerticalGroup(
            PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFactLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(PanelFactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_total))
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(376, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(PanelFact);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla1MouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
    // Guarda los valores de lo jtextfields
    String cliente = txt_cliente.getText().trim();

    // Verifica si el campo de texto está vacío y asigna "NULL" si es así
    if (cliente.isEmpty()) {
        cliente = "NULL";
    }else {
        cliente = "'"+cliente+"'";
    }

    // Llama al procedimiento almacenado pasando los valores correctamente formateados
    CargarTabla1("MostrarCobro(" + cliente + ")");
    double total = 0.0;

    DefaultTableModel model = (DefaultTableModel) tabla1.getModel();
    int rowCount = model.getRowCount();

    for (int i = 0; i < rowCount; i++) {
    String precioString = (String) model.getValueAt(i, 5);
    double precio = Double.parseDouble(precioString);
    total += precio;
    }

    txt_total.setText(Double.toString(total));


    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar1ActionPerformed
        
generarPDF();
// Obtener el ID del cliente desde el JTextField
        int clienteId = Integer.parseInt(txt_cliente.getText().trim());

        Connection cn = Conexion.conectar();
// Actualizar Visitas
        String updateVisitas = "UPDATE Visitas SET cobrado = '1' WHERE mascota IN "
                + "(SELECT id FROM Mascotas WHERE dueno = ?) AND cobrado = '0'";
        PreparedStatement stmtVisitas;
        try {
            stmtVisitas = cn.prepareStatement(updateVisitas);
        stmtVisitas.setInt(1, clienteId);
        stmtVisitas.executeUpdate();

// Actualizar Ventas
        String updateVentas = "UPDATE Ventas SET cobrado = '1' WHERE cliente = ? AND cobrado = '0'";
        PreparedStatement stmtVentas = cn.prepareStatement(updateVentas);
        stmtVentas.setInt(1, clienteId);
        stmtVentas.executeUpdate();

// Refrescar la vista para mostrar los cambios actualizados
        Limpiar();

// Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(null, "Se han actualizado los registros correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_agregar1ActionPerformed

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
                new Mascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFact;
    private javax.swing.JButton btn_agregar1;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> combobox_cliente;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JLabel txt_total;
    // End of variables declaration//GEN-END:variables
/*
     * *****************************************************
     * metodo para mostrar todos los clientes registrados
     * *****************************************************
     */
    public void CargarTabla1(String procedimiento) {
    try {
        tabla1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        // Crear el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("IdCliente");
        modeloTabla.addColumn("Cliente");
        modeloTabla.addColumn("Servicio");
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Cobrado");
        tabla1.setModel(modeloTabla);

        // Se definen los tamaños de la tabla
        tabla1.setRowHeight(50);
        tabla1.getColumnModel().getColumn(0).setMinWidth(60);
        tabla1.getColumnModel().getColumn(0).setMaxWidth(60);
        tabla1.getColumnModel().getColumn(2).setMinWidth(90);
        tabla1.getColumnModel().getColumn(2).setMaxWidth(90);
        tabla1.getColumnModel().getColumn(4).setMinWidth(60);
        tabla1.getColumnModel().getColumn(4).setMaxWidth(60);
        tabla1.getColumnModel().getColumn(5).setMinWidth(60);
        tabla1.getColumnModel().getColumn(5).setMaxWidth(60);
        tabla1.getColumnModel().getColumn(6).setMinWidth(60);
        tabla1.getColumnModel().getColumn(6).setMaxWidth(60);
        DefaultTableCellRenderer cellRenderer = new LineWrapTableCellRenderer();
        tabla1.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tabla1.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);

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
            fila[0] = resultSet.getInt("cliente_id");
            fila[1] = resultSet.getString("cliente");
            fila[2] = resultSet.getString("servicio");
            fila[3] = resultSet.getString("producto");
            fila[4] = resultSet.getString("cantidad");
            fila[5] = resultSet.getString("precio");
            fila[6] = resultSet.getString("cobrado");
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
        //txt_descripcion.setText("");
        //txt_precio.setText("");
        //txt_existencias.setText("");
        //txt_proveedor.setText("");
        //combobox_categoria.setSelectedItem("Alimentos");

        // Desactivar los botones
        //btn_editar.setEnabled(false);
        //btn_eliminar.setEnabled(false);
        CargarTabla1("MostrarProductos");
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

public void generarPDF() {
    Document document = new Document();

    try {
        // Crear el objeto PdfWriter para escribir el contenido en un archivo
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("archivo.pdf"));

        // Abrir el documento
        document.open();

        // Obtener los datos de la JTable y JTextField
        DefaultTableModel model = (DefaultTableModel) tabla1.getModel();
        String texto = txt_total.getText();

        // Crear la tabla para almacenar los datos
        PdfPTable table = new PdfPTable(7); // 7 columnas

        // Agregar las columnas de la JTable al PDF
        for (int i = 0; i < model.getColumnCount(); i++) {
            table.addCell(model.getColumnName(i));
        }

        // Agregar los datos de la JTable al PDF
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                table.addCell(model.getValueAt(i, j).toString());
            }
        }

        // Agregar el texto del JTextField al PDF
        Paragraph paragraph = new Paragraph("Total: "+texto);
        paragraph.setAlignment(Element.ALIGN_RIGHT);

        // Agregar la tabla y el texto al documento
        document.add(table);
        document.add(paragraph);

        // Cerrar el documento
        document.close();

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(null, "Se ha generado el PDF correctamente");

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
