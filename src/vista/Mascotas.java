
package vista;

import conexion.Conexion;
import controlador.Ctrl_Mascotas;
import static controlador.Ctrl_Mascotas.validarDecimal;
import static controlador.Ctrl_Mascotas.validarEntero;
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
import modelo.Mascota;
import modelo.Veterinario;

public class Mascotas extends javax.swing.JFrame {
    private Ctrl_Mascotas masc;

    public Mascotas() {
    this.masc = new Ctrl_Mascotas();
        initComponents();
        this.setSize(new Dimension(1320, 800));
        this.setLocationRelativeTo(null);
        this.setTitle("Mascotas");

try {
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    SwingUtilities.updateComponentTreeUI(chooser_fehca_nac);
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
        
        // Llenar el JComboBox con los nombres de los clientes
        masc.cargarClientes(combobox_cliente);

        //Cargar tabla
        CargarTabla("MostrarMascotas");
    }

    public JPanel getPanelPet() {
        return PanelPet;
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
        PanelPet = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_nombre = new javax.swing.JTextField();
        txt_especie = new javax.swing.JTextField();
        txt_raza = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        combobox_sexo = new javax.swing.JComboBox<>();
        chooser_fehca_nac = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_longitud = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        combobox_cliente = new javax.swing.JComboBox<>();
        btn_refrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personas");
        setBackground(new java.awt.Color(255, 255, 255));

        PanelPet.setBackground(new java.awt.Color(255, 255, 255));
        PanelPet.setPreferredSize(new java.awt.Dimension(1120, 723));

        btn_agregar.setBackground(new java.awt.Color(132, 218, 244));
        btn_agregar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(0, 0, 0));
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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Especie", "Raza", "Fecha Nacimiento", "Sexo", "Longitud", "Peso", "Dueno_id", "Dueño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, false, false, true, true
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
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(35);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(5).setResizable(false);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(15);
            tabla.getColumnModel().getColumn(6).setMinWidth(70);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(6).setMaxWidth(70);
            tabla.getColumnModel().getColumn(7).setMinWidth(70);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(7).setMaxWidth(70);
            tabla.getColumnModel().getColumn(8).setMinWidth(0);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(8).setMaxWidth(0);
            tabla.getColumnModel().getColumn(9).setResizable(false);
        }

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));

        txt_especie.setBackground(new java.awt.Color(255, 255, 255));
        txt_especie.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_especie.setForeground(new java.awt.Color(0, 0, 0));

        txt_raza.setBackground(new java.awt.Color(255, 255, 255));
        txt_raza.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_raza.setForeground(new java.awt.Color(0, 0, 0));
        txt_raza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_razaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 22, 39));
        jLabel11.setText("Especie");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 22, 39));
        jLabel12.setText("Nombre ");

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 22, 39));
        jLabel13.setText("Fecha de nacimiento(aa/mm/dd)");

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 22, 39));
        jLabel14.setText("Raza");

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(1, 22, 39));
        jLabel15.setText("Sexo");

        jLabel17.setBackground(new java.awt.Color(250, 214, 29));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 65)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(250, 214, 29));
        jLabel17.setText("Mascotas");

        combobox_sexo.setBackground(new java.awt.Color(255, 255, 255));
        combobox_sexo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_sexo.setForeground(new java.awt.Color(0, 0, 0));
        combobox_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        combobox_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_sexoActionPerformed(evt);
            }
        });

        chooser_fehca_nac.setBackground(new java.awt.Color(255, 255, 255));
        chooser_fehca_nac.setForeground(new java.awt.Color(0, 0, 0));
        chooser_fehca_nac.setDateFormatString("yyyy/MM/dd");
        chooser_fehca_nac.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 22, 39));
        jLabel16.setText("Peso");

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(1, 22, 39));
        jLabel18.setText("Longitud");

        txt_longitud.setBackground(new java.awt.Color(255, 255, 255));
        txt_longitud.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_longitud.setForeground(new java.awt.Color(0, 0, 0));

        txt_peso.setBackground(new java.awt.Color(255, 255, 255));
        txt_peso.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_peso.setForeground(new java.awt.Color(0, 0, 0));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(1, 22, 39));
        jLabel19.setText("Dueño");

        txt_cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_cliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_cliente.setForeground(new java.awt.Color(0, 0, 0));

        combobox_cliente.setBackground(new java.awt.Color(255, 255, 255));
        combobox_cliente.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_cliente.setForeground(new java.awt.Color(0, 0, 0));
        combobox_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        combobox_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_clienteActionPerformed(evt);
            }
        });

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 255));
        btn_refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refrescar.png"))); // NOI18N
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPetLayout = new javax.swing.GroupLayout(PanelPet);
        PanelPet.setLayout(PanelPetLayout);
        PanelPetLayout.setHorizontalGroup(
            PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPetLayout.createSequentialGroup()
                .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPetLayout.createSequentialGroup()
                        .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPetLayout.createSequentialGroup()
                                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelPetLayout.createSequentialGroup()
                                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(combobox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chooser_fehca_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPetLayout.createSequentialGroup()
                                        .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(combobox_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPetLayout.createSequentialGroup()
                                        .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(txt_peso))))))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        PanelPetLayout.setVerticalGroup(
            PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(17, 17, 17)
                .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelPetLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(5, 5, 5)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooser_fehca_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combobox_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(PanelPet);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
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
    String especie = txt_especie.getText().trim();
    String raza = txt_raza.getText().trim();

    // Verifica si el campo de texto está vacío y asigna "NULL" si es así
    if (nombre.isEmpty()) {
        nombre = "NULL";
    }else {
        nombre = "'" + nombre + "'";
    }
    if (especie.isEmpty()) {
        especie = "NULL";
    }else {
        especie = "'" + especie + "'";
        }
        if (raza.isEmpty()) {
            raza = "NULL";
        }else {
        raza = "'" + raza + "'";
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

        String sexo = combobox_sexo.getSelectedItem().toString();
        String longitud = txt_longitud.getText().trim();
        String peso = txt_peso.getText().trim();
        if (sexo.isEmpty()) {
            sexo = "NULL";
        } else {
            sexo = "'" + sexo + "'";
        }
        if (longitud.isEmpty()) {
            longitud = "NULL";
        } else {
            longitud = longitud;
        }
        if (peso.isEmpty()) {
            peso = "NULL";
        } else {
            peso = peso;
        }
    // Llama al procedimiento almacenado pasando los valores correctamente formateados
    CargarTabla("BuscarMascotas(" + nombre + ", " + especie + ", " + raza + ", " + fecha_nac + ", " + sexo + ", " + longitud + ", " + peso + ", NULL)");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tabla.getSelectedRow();
        int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        boolean resultado = masc.eliminar(id);

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "La mascota se elimino correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar mascota");
            CargarTabla("MostrarMascotas");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Mascota mascota = new Mascota();
        int fila = tabla.getSelectedRow();
        mascota.id = (Integer) tabla.getValueAt(fila, 0);
        mascota.setNombre(txt_nombre.getText().trim());
        mascota.setEspecie(txt_especie.getText().trim());
        mascota.setRaza(txt_raza.getText().trim());

        String nombre = (txt_nombre.getText().trim());
        // Define el formato de fecha deseado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Convierte la fecha a String utilizando el formato especificado
        String fecha_nac = formato.format(chooser_fehca_nac.getDate());
        mascota.setFecha_nacimiento(fecha_nac);
        mascota.setSexo((String) combobox_sexo.getSelectedItem());
        mascota.setLongitud(txt_longitud.getText().trim());
        mascota.setPeso(txt_peso.getText().trim());
        mascota.setDueno(Integer.parseInt(txt_cliente.getText().trim()));

        String longitud=(txt_longitud.getText().trim());
        String peso=(txt_peso.getText().trim());
        String cliente=(txt_cliente.getText().trim());

        if (validarNombre(nombre)) {
            if (validarDecimal(longitud)) {
            if (validarDecimal(peso)) {
                if (validarEntero(cliente)) {
                boolean resultado = masc.editar(mascota);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "La mascota se actualizo correctamente");
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar mascota");
                    CargarTabla("MostrarMascotas");
                }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente inválido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Peso inválido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Longitud inválido");
        }}else {
            JOptionPane.showMessageDialog(null, "Nombre inválido");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Mascota mascota = new Mascota();
        mascota.setNombre(txt_nombre.getText().trim());
        mascota.setEspecie(txt_especie.getText().trim());
        mascota.setRaza(txt_raza.getText().trim());

        String nombre = (txt_nombre.getText().trim());
        // Define el formato de fecha deseado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Convierte la fecha a String utilizando el formato especificado
        String fecha_nac = formato.format(chooser_fehca_nac.getDate());
        mascota.setFecha_nacimiento(fecha_nac);
        mascota.setSexo((String) combobox_sexo.getSelectedItem());
        mascota.setLongitud(txt_longitud.getText().trim());
        mascota.setPeso(txt_peso.getText().trim());
        mascota.setDueno(Integer.parseInt(txt_cliente.getText().trim()));

        String longitud=(txt_longitud.getText().trim());
        String peso=(txt_peso.getText().trim());
        String cliente=(txt_cliente.getText().trim());

        if (validarNombre(nombre)) {
            if (validarDecimal(longitud)) {
            if (validarDecimal(peso)) {
                if (validarEntero(cliente)) {
                boolean resultado = masc.agregar(mascota);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "La mascota se agrego correctamente");
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar mascota");
                    CargarTabla("MostrarMascotas");
                }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente inválido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Peso inválido");
        }
        } else {
            JOptionPane.showMessageDialog(null, "Longitud inválido");
        }}
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        btn_editar.setEnabled(true);
        btn_eliminar.setEnabled(true);

        int fila = tabla.getSelectedRow();
        String nombre = (String) tabla.getValueAt(fila, 1);
        String especie = (String) tabla.getValueAt(fila, 2);
        String raza = (String) tabla.getValueAt(fila, 3);
        Date fecha_nacimiento = (Date) tabla.getValueAt(fila, 4);
        String sexo = (String) tabla.getValueAt(fila, 5);
        String longitud = (String) tabla.getValueAt(fila, 6);
        String peso = (String) tabla.getValueAt(fila, 7);
        String iddueno = (String) tabla.getValueAt(fila, 8);
        String dueno = (String) tabla.getValueAt(fila, 9);

        // Pasa los datos obtenidos a los JTextFields correspondientes
        txt_nombre.setText(nombre);
        txt_especie.setText(especie);
        txt_raza.setText(raza);
        chooser_fehca_nac.setDate(fecha_nacimiento);
        combobox_sexo.setSelectedItem(sexo.toString());
        txt_longitud.setText(longitud);
        txt_peso.setText(peso);
        txt_cliente.setText(iddueno);
        combobox_cliente.setSelectedItem(dueno.toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void txt_razaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_razaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_razaActionPerformed

    private void combobox_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_sexoActionPerformed

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
    private javax.swing.JPanel PanelPet;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_refrescar;
    private com.toedter.calendar.JDateChooser chooser_fehca_nac;
    private javax.swing.JComboBox<String> combobox_cliente;
    private javax.swing.JComboBox<String> combobox_sexo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_especie;
    private javax.swing.JTextField txt_longitud;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_raza;
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
        modeloTabla.addColumn("Especie");
        modeloTabla.addColumn("Raza");
        modeloTabla.addColumn("Fecha de nacimiento");
        modeloTabla.addColumn("Sexo");
        modeloTabla.addColumn("Longitud");
        modeloTabla.addColumn("Peso");
        modeloTabla.addColumn("Dueno_id");
        modeloTabla.addColumn("Dueño");
        tabla.setModel(modeloTabla);

        // Se definen los tamaños de la tabla
        tabla.setRowHeight(50);
        tabla.getColumnModel().getColumn(0).setMinWidth(50);
        tabla.getColumnModel().getColumn(0).setMaxWidth(50);
        tabla.getColumnModel().getColumn(1).setMinWidth(100);
        tabla.getColumnModel().getColumn(1).setMaxWidth(100);
        tabla.getColumnModel().getColumn(2).setMinWidth(100);
        tabla.getColumnModel().getColumn(2).setMaxWidth(100);
        tabla.getColumnModel().getColumn(3).setMinWidth(150);
        tabla.getColumnModel().getColumn(3).setMaxWidth(150);
        tabla.getColumnModel().getColumn(4).setMinWidth(100);
        tabla.getColumnModel().getColumn(4).setMaxWidth(100);
        tabla.getColumnModel().getColumn(5).setMinWidth(100);
        tabla.getColumnModel().getColumn(5).setMaxWidth(100);
        tabla.getColumnModel().getColumn(6).setMinWidth(60);
        tabla.getColumnModel().getColumn(6).setMaxWidth(60);
        tabla.getColumnModel().getColumn(7).setMinWidth(60);
        tabla.getColumnModel().getColumn(7).setMaxWidth(60);
        tabla.getColumnModel().getColumn(8).setMinWidth(0);
        tabla.getColumnModel().getColumn(8).setMaxWidth(0);
        DefaultTableCellRenderer cellRenderer = new LineWrapTableCellRenderer();
        tabla.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(9).setCellRenderer(cellRenderer);


        // Conectarse a la base de datos
        Connection cn = Conexion.conectar();

        // Ejecutar la consulta en la vista;
        String sql = "{ CALL "+procedimiento+" }";
        PreparedStatement statement = cn.prepareStatement(sql);

        // Ejecutar la consulta y obtener los resultados
        ResultSet resultSet = statement.executeQuery();

        // Agregar los datos obtenidos a la tabla
        while (resultSet.next()) {
            Object[] fila = new Object[10];
            fila[0] = resultSet.getInt("id");
            fila[1] = resultSet.getString("nombre");
            fila[2] = resultSet.getString("especie");
            fila[3] = resultSet.getString("raza");
            fila[4] = resultSet.getDate("fecha_nacimiento");
            fila[5] = resultSet.getString("sexo");
            fila[6] = resultSet.getString("longitud");
            fila[7] = resultSet.getString("peso");
            fila[8] = resultSet.getString("dueno_id");
            fila[9] = resultSet.getString("dueno");
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
        txt_especie.setText("");
        txt_raza.setText("");
        combobox_sexo.setSelectedItem("Masculino");
        txt_longitud.setText("");
        txt_peso.setText("");
        txt_cliente.setText("");
        masc.cargarClientes(combobox_cliente);

        // Poner en blanco el JDateChooser
        chooser_fehca_nac.setDate(null);

        // Desactivar los botones
        btn_editar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        CargarTabla("MostrarMascotas");
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
