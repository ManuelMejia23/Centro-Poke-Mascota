
package vista;

import conexion.Conexion;
import controlador.Ctrl_Veterinario;
import java.awt.Dimension;
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
import javax.swing.*;
import javax.swing.table.*;
import modelo.Veterinario;

public class Base extends javax.swing.JFrame {
    public int idSeleccionado = -1;
    private Ctrl_Veterinario vet;

    public Base() {
    this.vet = new Ctrl_Veterinario();
        initComponents();
        this.setSize(new Dimension(1000, 700));
        this.setLocationRelativeTo(null);
        this.setTitle("Personas");

        //Cargar tabla
        this.CargarTabla();
    }

public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel0 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btn_veterinarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_mascotas = new javax.swing.JButton();
        btn_citas = new javax.swing.JButton();
        btn_visitas = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        btn_ventas = new javax.swing.JButton();
        btn_facturas = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_nombre = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_fecha_nac = new javax.swing.JTextField();
        txt_turno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personas");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(254, 228, 64));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel0.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel0.setForeground(new java.awt.Color(231, 29, 54));
        jLabel0.setText("Veterinarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(jLabel0)
                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel0)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(46, 196, 182));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setForeground(new java.awt.Color(46, 196, 182));
        jPanel2.setPreferredSize(new java.awt.Dimension(202, 600));

        btn_veterinarios.setBackground(new java.awt.Color(255, 159, 28));
        btn_veterinarios.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn_veterinarios.setForeground(new java.awt.Color(1, 22, 39));
        btn_veterinarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/veterinarios.png"))); // NOI18N
        btn_veterinarios.setText("Veterinarios");
        btn_veterinarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veterinariosActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/logo menu.png"))); // NOI18N

        btn_mascotas.setBackground(new java.awt.Color(255, 159, 28));
        btn_mascotas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn_mascotas.setForeground(new java.awt.Color(1, 22, 39));
        btn_mascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/mascotas.png"))); // NOI18N
        btn_mascotas.setText("Mascotas");
        btn_mascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mascotasActionPerformed(evt);
            }
        });

        btn_citas.setBackground(new java.awt.Color(255, 159, 28));
        btn_citas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_citas.setForeground(new java.awt.Color(1, 22, 39));
        btn_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/citas.png"))); // NOI18N
        btn_citas.setText("Citas");
        btn_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citasActionPerformed(evt);
            }
        });

        btn_visitas.setBackground(new java.awt.Color(255, 159, 28));
        btn_visitas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_visitas.setForeground(new java.awt.Color(1, 22, 39));
        btn_visitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/visitas.png"))); // NOI18N
        btn_visitas.setText("Visitas");
        btn_visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_visitasActionPerformed(evt);
            }
        });

        btn_productos.setBackground(new java.awt.Color(255, 159, 28));
        btn_productos.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btn_productos.setForeground(new java.awt.Color(1, 22, 39));
        btn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/productos.png"))); // NOI18N
        btn_productos.setText("Productos");
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });

        btn_ventas.setBackground(new java.awt.Color(255, 159, 28));
        btn_ventas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_ventas.setForeground(new java.awt.Color(1, 22, 39));
        btn_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/ventas.png"))); // NOI18N
        btn_ventas.setText("Ventas");
        btn_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventasActionPerformed(evt);
            }
        });

        btn_facturas.setBackground(new java.awt.Color(255, 159, 28));
        btn_facturas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_facturas.setForeground(new java.awt.Color(1, 22, 39));
        btn_facturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/facturas.png"))); // NOI18N
        btn_facturas.setText("Facturas");
        btn_facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturasActionPerformed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(231, 29, 54));
        btn_cerrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(1, 22, 39));
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/salir.png"))); // NOI18N
        btn_cerrar.setText("Cerrar Sesión");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        btn_clientes.setBackground(new java.awt.Color(255, 159, 28));
        btn_clientes.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn_clientes.setForeground(new java.awt.Color(1, 22, 39));
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/clientes.png"))); // NOI18N
        btn_clientes.setText("Clientes");
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_veterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_visitas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_veterinarios, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_visitas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregar.setBackground(new java.awt.Color(0, 187, 249));
        btn_agregar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(1, 22, 39));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/agregar.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(0, 187, 249));
        btn_editar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(1, 22, 39));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/editar.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(0, 187, 249));
        btn_eliminar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(1, 22, 39));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(0, 187, 249));
        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(1, 22, 39));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SistemaDeventas1/src/img/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "persona", "Nombre", "Dirección", "Telefono", "Correo", "Fecha Nacimiento", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(15);
            tabla.getColumnModel().getColumn(1).setMinWidth(0);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(1).setMaxWidth(0);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(45);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(15);
        }

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 255));
        txt_direccion.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(0, 0, 0));

        txt_correo.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(0, 0, 0));

        txt_fecha_nac.setBackground(new java.awt.Color(255, 255, 255));
        txt_fecha_nac.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_fecha_nac.setForeground(new java.awt.Color(0, 0, 0));

        txt_turno.setBackground(new java.awt.Color(255, 255, 255));
        txt_turno.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_turno.setForeground(new java.awt.Color(0, 0, 0));
        txt_turno.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 22, 39));
        jLabel11.setText("Dirección");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 22, 39));
        jLabel12.setText("Nombre completo");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 22, 39));
        jLabel13.setText("Fecha de nacimiento (aaaa-mm-dd)");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 22, 39));
        jLabel14.setText("Telefono");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(1, 22, 39));
        jLabel15.setText("Turno (M/V)");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 22, 39));
        jLabel16.setText("Correo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(184, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
    Veterinario veterinario = new Veterinario();
    veterinario.setNombre(txt_nombre.getText().trim());
    veterinario.setDireccion(txt_direccion.getText().trim());
    veterinario.setTelefono(txt_telefono.getText().trim());
    veterinario.setCorreo(txt_correo.getText().trim());
    veterinario.setFecha_nacimiento(txt_fecha_nac.getText().trim());
    veterinario.setTurno(txt_turno.getText().trim());

    boolean resultado = vet.agregar(veterinario);

    if (resultado) {
        JOptionPane.showMessageDialog(null, "El veterinario se guardó correctamente");
    } else {
        JOptionPane.showMessageDialog(null, "Error al guardar el veterinario");
    }
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturasActionPerformed

    private void btn_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ventasActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productosActionPerformed

    private void btn_visitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_visitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_visitasActionPerformed

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citasActionPerformed

    private void btn_mascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mascotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_mascotasActionPerformed

    private void btn_veterinariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_veterinariosActionPerformed
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_veterinariosActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
   int fila = tabla.getSelectedRow();
        int idVeterinario = (int) tabla.getValueAt(fila, 0);
        String nombre = (String) tabla.getValueAt(fila, 1);
        String direccion = (String) tabla.getValueAt(fila, 2);
        String telefono = (String) tabla.getValueAt(fila, 3);
        String correo = (String) tabla.getValueAt(fila, 4);
        String fecha_nacimiento = (String) tabla.getValueAt(fila, 5);
        String turno = (String) tabla.getValueAt(fila, 6);

        // Pasa los datos obtenidos a los JTextFields correspondientes
        txt_nombre.setText(nombre);
        txt_direccion.setText(direccion);
        txt_telefono.setText(telefono);
        txt_correo.setText(correo);
        txt_fecha_nac.setText(fecha_nacimiento);
        txt_turno.setText(turno);

        // Guarda el ID del registro seleccionado
        Veterinario.id = idVeterinario;
    }//GEN-LAST:event_tablaMouseClicked

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
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_citas;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_facturas;
    private javax.swing.JButton btn_mascotas;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_ventas;
    private javax.swing.JButton btn_veterinarios;
    private javax.swing.JButton btn_visitas;
    private javax.swing.JLabel jLabel0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fecha_nac;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_turno;
    // End of variables declaration//GEN-END:variables
/*
     * *****************************************************
     * metodo para mostrar todos los clientes registrados
     * *****************************************************
     */
    private void CargarTabla() {
    try {
        // Crear la tabla
        JTable tabla = new JTable();

        // Crear el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Persona");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Dirección");
        modeloTabla.addColumn("Teléfono");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Fecha de nacimiento");
        modeloTabla.addColumn("Turno");
        tabla.setModel(modeloTabla);

        // Conectarse a la base de datos
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/centropokemascota", "root", "");

        // Ejecutar la consulta en la vista
        Statement statement = conexion.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM vista_veterinarios");

        // Agregar los datos obtenidos a la tabla
        while (resultSet.next()) {
            Object[] fila = new Object[8];
            fila[0] = resultSet.getInt("id");
            fila[1] = resultSet.getString("persona");
            fila[2] = resultSet.getString("nombre");
            fila[3] = resultSet.getString("direccion");
            fila[4] = resultSet.getString("telefono");
            fila[5] = resultSet.getString("correo");
            fila[6] = resultSet.getDate("fecha_nacimiento");
            fila[7] = resultSet.getString("turno");
            modeloTabla.addRow(fila);
        }

        // Agregar la tabla a tu interfaz
        jPanel3.add(tabla);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


}
