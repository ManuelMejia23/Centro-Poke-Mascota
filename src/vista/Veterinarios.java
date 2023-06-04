
package vista;

import conexion.Conexion;
import static controlador.Ctrl_Veterinario.validarCorreo;
import static controlador.Ctrl_Veterinario.validarNombre;
import static controlador.Ctrl_Veterinario.validarTelefono;
import controlador.Ctrl_Veterinario;
import static controlador.Ctrl_Veterinario.validarContrasena;
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
import modelo.Cliente;
import modelo.Veterinario;

public class Veterinarios extends javax.swing.JFrame {
    public int idSeleccionado = -1;
    private Ctrl_Veterinario vet;

    public Veterinarios() {
    this.vet = new Ctrl_Veterinario();
        initComponents();
        this.setSize(new Dimension(1320, 800));
        this.setLocationRelativeTo(null);
        this.setTitle("Veterinarios");

try {
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    SwingUtilities.updateComponentTreeUI(chooser_fehca_nac);
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}


        //Cargar tabla
        CargarTabla("MostrarVeterinarios");
    }

    public JPanel getPanelVet() {
        return PanelVet;
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
        PanelVet = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_nombre = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        combobox_turno = new javax.swing.JComboBox<>();
        chooser_fehca_nac = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_contrasena = new javax.swing.JTextField();
        btn_refrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personas");
        setBackground(new java.awt.Color(255, 255, 255));

        PanelVet.setBackground(new java.awt.Color(255, 255, 255));
        PanelVet.setPreferredSize(new java.awt.Dimension(1120, 723));

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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "persona", "Nombre", "Dirección", "Telefono", "Fecha Nacimiento", "Correo", "Contraseña", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true
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
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(35);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(7).setResizable(false);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(8).setResizable(false);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(15);
        }

        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        txt_direccion.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        txt_telefono.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 22, 39));
        jLabel11.setText("Dirección");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 22, 39));
        jLabel12.setText("Nombre completo");

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 22, 39));
        jLabel13.setText("Fecha de nacimiento(aa/mm/dd)");

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 22, 39));
        jLabel14.setText("Telefono");

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(1, 22, 39));
        jLabel15.setText("Turno");

        jLabel17.setBackground(new java.awt.Color(250, 214, 29));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 65)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(250, 214, 29));
        jLabel17.setText("Veterinarios");

        combobox_turno.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino" }));
        combobox_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_turnoActionPerformed(evt);
            }
        });

        chooser_fehca_nac.setBackground(new java.awt.Color(255, 255, 255));
        chooser_fehca_nac.setDateFormatString("yyyy/MM/dd");
        chooser_fehca_nac.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 22, 39));
        jLabel16.setText("Correo");

        txt_correo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(1, 22, 39));
        jLabel18.setText("Contraseña");

        txt_contrasena.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 255));
        btn_refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refrescar.png"))); // NOI18N
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVetLayout = new javax.swing.GroupLayout(PanelVet);
        PanelVet.setLayout(PanelVetLayout);
        PanelVetLayout.setHorizontalGroup(
            PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVetLayout.createSequentialGroup()
                .addGroup(PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelVetLayout.createSequentialGroup()
                        .addGroup(PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelVetLayout.createSequentialGroup()
                                .addGroup(PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(PanelVetLayout.createSequentialGroup()
                                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelVetLayout.createSequentialGroup()
                                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(combobox_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel13))
                                    .addGroup(PanelVetLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(chooser_fehca_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVetLayout.createSequentialGroup()
                                .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        PanelVetLayout.setVerticalGroup(
            PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(17, 17, 17)
                .addGroup(PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelVetLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(chooser_fehca_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combobox_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(PanelVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(PanelVet);

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
        // Guarda los valores de los JTextFields
    String nombre = txt_nombre.getText().trim();
    String direccion = txt_direccion.getText().trim();
    String telefono = txt_telefono.getText().trim();

    // Verifica si el campo de texto está vacío y asigna "NULL" si es así
    if (nombre.isEmpty()) {
        nombre = "NULL";
    }else {
        nombre = "'" + nombre + "'";
    }
    if (direccion.isEmpty()) {
        direccion = "NULL";
    }else {
        direccion = "'" + direccion + "'";
        }
        if (telefono.isEmpty()) {
            telefono = "NULL";
        }else {
        telefono = "'" + telefono + "'";
        }

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        String fecha_nac;
        try {
            fecha_nac = formato.format(chooser_fehca_nac.getDate());
        } catch (NullPointerException e) {
            fecha_nac = "NULL";
        }

        if (!fecha_nac.equals("NULL")) {
            fecha_nac = "'" + fecha_nac + "'";
        }

        String correo = txt_correo.getText().trim();
        String contrasena = txt_contrasena.getText().trim();
        String turno = combobox_turno.getSelectedItem().toString();
        if (correo.isEmpty()) {
            correo = "NULL";
        } else {
            correo = "'" + correo + "'";
        }
        if (contrasena.isEmpty()) {
            contrasena = "NULL";
        } else {
            contrasena = "'" + contrasena + "'";
        }
        if (turno.isEmpty()) {
            turno = "NULL";
        } else {
            turno = "'" + turno + "'";
        }
    // Llama al procedimiento almacenado pasando los valores correctamente formateados
    CargarTabla("BuscarVeterinario(" + nombre + ", " + direccion + ", " + telefono + ", " + fecha_nac + ", " + correo + ", " + contrasena + ", " + turno + ")");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tabla.getSelectedRow();
        int persona = Integer.parseInt((String) tabla.getValueAt(fila, 1));
        boolean resultado = vet.eliminar(persona);

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "El Veterinario se elimino correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar el Veterinario");
            CargarTabla("MostrarVeterinarios");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Veterinario veterinario = new Veterinario();
        int fila = tabla.getSelectedRow();
        veterinario.persona = Integer.parseInt((String) tabla.getValueAt(fila, 1));
        veterinario.setNombre(txt_nombre.getText().trim());
        String nombre = (txt_nombre.getText().trim());
        veterinario.setDireccion(txt_direccion.getText().trim());
        veterinario.setTelefono(txt_telefono.getText().trim());
        String telefono=(txt_telefono.getText().trim());
        // Define el formato de fecha deseado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Convierte la fecha a String utilizando el formato especificado
        String fecha_nac = formato.format(chooser_fehca_nac.getDate());
        veterinario.setFecha_nacimiento(fecha_nac);
        veterinario.setCorreo(txt_correo.getText().trim());
        veterinario.setContrasena(txt_contrasena.getText().trim());
        String correo = (txt_correo.getText().trim());
        String contrasena = (txt_contrasena.getText().trim());
        veterinario.setTurno((String) combobox_turno.getSelectedItem());

        if (validarNombre(nombre)) {
            if (validarCorreo(correo)) {
            if (validarTelefono(telefono)) {
                if (validarContrasena(contrasena)) {
                boolean resultado = vet.editar(veterinario);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "El Veterinario se edito correctamente");
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al editar el Veterinario");
                    CargarTabla("MostrarVeterinarios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña inválida");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Teléfono inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Correo inválido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre inválido");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Veterinario veterinario = new Veterinario();
        veterinario.setNombre(txt_nombre.getText().trim());
        veterinario.setDireccion(txt_direccion.getText().trim());
        veterinario.setTelefono(txt_telefono.getText().trim());

        String nombre = (txt_nombre.getText().trim());
        String telefono=(txt_telefono.getText().trim());
        // Define el formato de fecha deseado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Convierte la fecha a String utilizando el formato especificado
        String fecha_nac = formato.format(chooser_fehca_nac.getDate());
        veterinario.setFecha_nacimiento(fecha_nac);
        veterinario.setCorreo(txt_correo.getText().trim());
        veterinario.setContrasena(txt_contrasena.getText().trim());
        veterinario.setTurno((String) combobox_turno.getSelectedItem());

        String correo = (txt_correo.getText().trim());
        String contrasena = (txt_contrasena.getText().trim());

        if (validarNombre(nombre)) {
            if (validarCorreo(correo)) {
            if (validarTelefono(telefono)) {
                if (validarContrasena(contrasena)) {
                boolean resultado = vet.agregar(veterinario);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "El Veterinario se agrego correctamente");
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar el Veterinario");
                    CargarTabla("MostrarVeterinarios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña inválida");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Teléfono inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Correo inválido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre inválido");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        btn_editar.setEnabled(true);
        btn_eliminar.setEnabled(true);

        int fila = tabla.getSelectedRow();
        String nombre = (String) tabla.getValueAt(fila, 2);
        String direccion = (String) tabla.getValueAt(fila, 3);
        String telefono = (String) tabla.getValueAt(fila, 4);
        Date fecha_nacimiento = (Date) tabla.getValueAt(fila, 5);
        String correo = (String) tabla.getValueAt(fila, 6);
        String contrasena = (String) tabla.getValueAt(fila, 7);
        String turno = (String) tabla.getValueAt(fila, 8);


        // Pasa los datos obtenidos a los JTextFields correspondientes
        txt_nombre.setText(nombre);
        txt_direccion.setText(direccion);
        txt_telefono.setText(telefono);
        chooser_fehca_nac.setDate(fecha_nacimiento);
        txt_correo.setText(correo);
        txt_contrasena.setText(contrasena);
        combobox_turno.setSelectedItem(turno.toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void combobox_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_turnoActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

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
    private javax.swing.JPanel PanelVet;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_refrescar;
    private com.toedter.calendar.JDateChooser chooser_fehca_nac;
    private javax.swing.JComboBox<String> combobox_turno;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_contrasena;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
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
        modeloTabla.addColumn("Persona");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Dirección");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("Fecha de nacimiento");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Contraseña");
        modeloTabla.addColumn("Turno");
        tabla.setModel(modeloTabla);

        // Se definen los tamaños de la tabla
        tabla.setRowHeight(70);
        tabla.getColumnModel().getColumn(0).setMinWidth(50);
        tabla.getColumnModel().getColumn(0).setMaxWidth(50);
        tabla.getColumnModel().getColumn(1).setMinWidth(0);
        tabla.getColumnModel().getColumn(1).setMaxWidth(0);
        tabla.getColumnModel().getColumn(4).setMinWidth(100);
        tabla.getColumnModel().getColumn(4).setMaxWidth(100);
        tabla.getColumnModel().getColumn(5).setMinWidth(100);
        tabla.getColumnModel().getColumn(5).setMaxWidth(100);
        tabla.getColumnModel().getColumn(7).setMinWidth(110);
        tabla.getColumnModel().getColumn(7).setMaxWidth(110);
        tabla.getColumnModel().getColumn(8).setMinWidth(80);
        tabla.getColumnModel().getColumn(8).setMaxWidth(80);
        DefaultTableCellRenderer cellRenderer = new LineWrapTableCellRenderer();
        tabla.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
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
            Object[] fila = new Object[9];
            fila[0] = resultSet.getInt("id");
            fila[1] = resultSet.getString("persona");
            fila[2] = resultSet.getString("nombre");
            fila[3] = resultSet.getString("direccion");
            fila[4] = resultSet.getString("telefono");
            fila[5] = resultSet.getDate("fecha_nacimiento");
            fila[6] = resultSet.getString("correo");
            fila[7] = resultSet.getString("contrasena");
            fila[8] = resultSet.getString("turno");
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
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_correo.setText("");
        txt_contrasena.setText("");
        combobox_turno.setSelectedItem("Matutino");

        // Poner en blanco el JDateChooser
        chooser_fehca_nac.setDate(null);

        // Desactivar los botones
        btn_editar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        CargarTabla("MostrarVeterinarios");
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
