
package vista;

import conexion.Conexion;
import static controlador.Ctrl_Visitas.validarDecimal;
import static controlador.Ctrl_Visitas.validarEntero;
import static controlador.Ctrl_Veterinario.validarNombre;
import controlador.Ctrl_Visitas;
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
import modelo.Veterinario;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import modelo.Mascota;
import modelo.Visita;

public class Visitas extends javax.swing.JFrame {
    private Ctrl_Visitas vis;

    public Visitas() {
    this.vis = new Ctrl_Visitas();
        initComponents();
        this.setSize(new Dimension(1320, 800));
        this.setLocationRelativeTo(null);
        this.setTitle("Mascotas");

try {
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    SwingUtilities.updateComponentTreeUI(chooser_fecha_visita);
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(Veterinarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
        // Llenar el JComboBox
        vis.cargarMascotas(combobox_mascota);
        vis.cargarVets(combobox_veterinario);

        //Cargar tabla
        CargarTabla("MostrarVisitas");
    }

    public JPanel getPanelVis() {
        return PanelVis;
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
        PanelVis = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_hora = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        chooser_fecha_visita = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        txt_mascota = new javax.swing.JTextField();
        combobox_mascota = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txt_veterinario = new javax.swing.JTextField();
        combobox_veterinario = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_diagnostico = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_tratamiento = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_receta = new javax.swing.JTextArea();
        txt_costo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_refrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personas");
        setBackground(new java.awt.Color(255, 255, 255));

        PanelVis.setBackground(new java.awt.Color(255, 255, 255));
        PanelVis.setPreferredSize(new java.awt.Dimension(1120, 723));

        tabla.setBackground(new java.awt.Color(255, 204, 255));
        tabla.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Fecha", "Hora", "id_mascota", "Mascota", "id_veterinario", "Veterinario", "Diagnóstico", "Tratamiento", "Receta", "Costo", "cobrado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
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
            tabla.getColumnModel().getColumn(1).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(45);
            tabla.getColumnModel().getColumn(3).setMinWidth(0);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(3).setMaxWidth(0);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(35);
            tabla.getColumnModel().getColumn(5).setMinWidth(0);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(5).setMaxWidth(0);
            tabla.getColumnModel().getColumn(6).setResizable(false);
            tabla.getColumnModel().getColumn(7).setResizable(false);
            tabla.getColumnModel().getColumn(8).setResizable(false);
            tabla.getColumnModel().getColumn(9).setResizable(false);
            tabla.getColumnModel().getColumn(10).setResizable(false);
            tabla.getColumnModel().getColumn(10).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(11).setMinWidth(0);
            tabla.getColumnModel().getColumn(11).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        txt_hora.setBackground(new java.awt.Color(255, 255, 255));
        txt_hora.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_hora.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 22, 39));
        jLabel11.setText("Hora");

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(1, 22, 39));
        jLabel13.setText("Fecha de visita(aa/mm/dd)");

        jLabel17.setBackground(new java.awt.Color(250, 214, 29));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 65)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(250, 214, 29));
        jLabel17.setText("Visitas");

        chooser_fecha_visita.setBackground(new java.awt.Color(255, 255, 255));
        chooser_fecha_visita.setForeground(new java.awt.Color(0, 0, 0));
        chooser_fecha_visita.setDateFormatString("yyyy/MM/dd");
        chooser_fecha_visita.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(1, 22, 39));
        jLabel19.setText("Mascota(ID)");

        txt_mascota.setBackground(new java.awt.Color(255, 255, 255));
        txt_mascota.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_mascota.setForeground(new java.awt.Color(0, 0, 0));

        combobox_mascota.setBackground(new java.awt.Color(255, 255, 255));
        combobox_mascota.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_mascota.setForeground(new java.awt.Color(0, 0, 0));
        combobox_mascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        combobox_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_mascotaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(1, 22, 39));
        jLabel20.setText("Veterinario(ID)");

        txt_veterinario.setBackground(new java.awt.Color(255, 255, 255));
        txt_veterinario.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_veterinario.setForeground(new java.awt.Color(0, 0, 0));

        combobox_veterinario.setBackground(new java.awt.Color(255, 255, 255));
        combobox_veterinario.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        combobox_veterinario.setForeground(new java.awt.Color(0, 0, 0));
        combobox_veterinario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        combobox_veterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_veterinarioActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 22, 39));
        jLabel12.setText("Diagnóstico");

        txt_diagnostico.setColumns(20);
        txt_diagnostico.setLineWrap(true);
        txt_diagnostico.setRows(5);
        txt_diagnostico.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txt_diagnostico);

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(1, 22, 39));
        jLabel15.setText("Tratamiento");

        txt_tratamiento.setColumns(20);
        txt_tratamiento.setLineWrap(true);
        txt_tratamiento.setRows(5);
        txt_tratamiento.setWrapStyleWord(true);
        txt_tratamiento.setPreferredSize(new java.awt.Dimension(268, 75));
        jScrollPane5.setViewportView(txt_tratamiento);

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(1, 22, 39));
        jLabel16.setText("Receta");

        txt_receta.setColumns(20);
        txt_receta.setLineWrap(true);
        txt_receta.setRows(5);
        txt_receta.setWrapStyleWord(true);
        txt_receta.setPreferredSize(new java.awt.Dimension(268, 75));
        jScrollPane6.setViewportView(txt_receta);

        txt_costo.setBackground(new java.awt.Color(255, 255, 255));
        txt_costo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txt_costo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel21.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(1, 22, 39));
        jLabel21.setText("Costo");

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
        btn_editar.setPreferredSize(new java.awt.Dimension(65, 41));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(132, 218, 244));
        btn_buscar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(1, 22, 39));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setPreferredSize(new java.awt.Dimension(65, 41));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(132, 218, 244));
        btn_eliminar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(1, 22, 39));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setEnabled(false);
        btn_eliminar.setPreferredSize(new java.awt.Dimension(65, 41));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 255));
        btn_refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refrescar.png"))); // NOI18N
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelVisLayout = new javax.swing.GroupLayout(PanelVis);
        PanelVis.setLayout(PanelVisLayout);
        PanelVisLayout.setHorizontalGroup(
            PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVisLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(627, 821, Short.MAX_VALUE))
                    .addGroup(PanelVisLayout.createSequentialGroup()
                        .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelVisLayout.createSequentialGroup()
                                .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chooser_fecha_visita, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelVisLayout.createSequentialGroup()
                                        .addComponent(txt_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combobox_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PanelVisLayout.createSequentialGroup()
                                            .addComponent(txt_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13)
                                            .addComponent(combobox_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_costo)
                                        .addComponent(jScrollPane6)))
                                .addGap(50, 50, 50)
                                .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))
                        .addContainerGap())))
        );
        PanelVisLayout.setVerticalGroup(
            PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVisLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combobox_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combobox_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chooser_fecha_visita, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelVisLayout.createSequentialGroup()
                                .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelVisLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelVisLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVisLayout.createSequentialGroup()
                                .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(25, 25, 25)
                        .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(5, 5, 5)
                        .addGroup(PanelVisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(PanelVisLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(PanelVis);

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

    private void combobox_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_mascotaActionPerformed
    String nombreMascotas = (String) combobox_mascota.getSelectedItem();
    if (nombreMascotas != null) {
        // Realizar la consulta en la base de datos para obtener el cliente_id
        Connection cn = Conexion.conectar();
        try  {
            String sql = "SELECT id FROM Mascotas WHERE nombre = ?";
            PreparedStatement stmt = cn.prepareStatement(sql);
            stmt.setString(1, nombreMascotas);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String clienteId = rs.getString("id");
                txt_mascota.setText(clienteId);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }}
    }//GEN-LAST:event_combobox_mascotaActionPerformed

    private void combobox_veterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_veterinarioActionPerformed
    String nombreVeterinarios = (String) combobox_veterinario.getSelectedItem();
    if (nombreVeterinarios != null) {
        // Realizar la consulta en la base de datos para obtener el cliente_id
        Connection cn = Conexion.conectar();
        try  {
            String sql = "SELECT veterinario_id FROM nombre_veterinarios WHERE nombre_veterinario = ?";
            PreparedStatement stmt = cn.prepareStatement(sql);
            stmt.setString(1, nombreVeterinarios);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String clienteId = rs.getString("veterinario_id");
                txt_veterinario.setText(clienteId);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }}
    }//GEN-LAST:event_combobox_veterinarioActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Visita visita = new Visita();
        // Define el formato de fecha deseado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Convierte la fecha a String utilizando el formato especificado
        String fecha_visita = formato.format(chooser_fecha_visita.getDate());
        visita.setFechaVisita(fecha_visita);
        visita.setHora(txt_hora.getText().trim());
        String mascotaTexto = txt_mascota.getText().trim();
        int mascota = Integer.parseInt(mascotaTexto);
        visita.setMascota(mascota);
        String vetTexto = txt_veterinario.getText().trim();
        int vet = Integer.parseInt(vetTexto);
        visita.setVeterinario(vet);
        visita.setCosto(txt_costo.getText().trim());
        visita.setDiagnostico(txt_diagnostico.getText().trim());
        visita.setTratamiento(txt_tratamiento.getText().trim());
        visita.setReceta(txt_receta.getText().trim());

        String hora=(txt_hora.getText().trim());
        String costo=(txt_costo.getText().trim());

        if (validarHora(hora)) {
            if (validarDecimal(costo)) {
                if (validarEntero(mascotaTexto)) {
                    if (validarEntero(vetTexto)) {
                boolean resultado = vis.agregar(visita);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "La visita se agrego correctamente");
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar visita");
                    CargarTabla("MostrarVisitas");
                }
        }else {
            JOptionPane.showMessageDialog(null, "Veterinario inválido");
        }}else {
            JOptionPane.showMessageDialog(null, "Mascota inválida");
        }} else {
            JOptionPane.showMessageDialog(null, "Costo inválido");
        }}else {
            JOptionPane.showMessageDialog(null, "Hora inválida");}
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        btn_editar.setEnabled(true);
        btn_eliminar.setEnabled(true);

        int fila = tabla.getSelectedRow();
        Date fecha_visita = (Date) tabla.getValueAt(fila, 1);
        String hora = (String) tabla.getValueAt(fila, 2);
        Integer mascotaint = (Integer) tabla.getValueAt(fila, 3);
        String mascota = mascotaint.toString();
        Integer veterinarioint = (Integer) tabla.getValueAt(fila, 5);
        String veterinario = veterinarioint.toString();
        String diagnostico = (String) tabla.getValueAt(fila, 7);
        String tratamiento = (String) tabla.getValueAt(fila, 8);
        String receta = (String) tabla.getValueAt(fila, 9);
        String costo = (String) tabla.getValueAt(fila, 10);

        // Pasa los datos obtenidos a los JTextFields correspondientes      
        chooser_fecha_visita.setDate(fecha_visita);
        txt_hora.setText(hora);
        txt_mascota.setText(mascota);
        txt_veterinario.setText(veterinario);
        txt_diagnostico.setText(diagnostico);
        txt_tratamiento.setText(tratamiento);
        txt_receta.setText(receta);
        txt_costo.setText(costo);
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        Visita visita = new Visita();
        int fila = tabla.getSelectedRow();
        visita.id = (Integer) tabla.getValueAt(fila, 0);
        // Define el formato de fecha deseado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

        // Convierte la fecha a String utilizando el formato especificado
        String fecha_visita = formato.format(chooser_fecha_visita.getDate());
        visita.setFechaVisita(fecha_visita);
        visita.setHora(txt_hora.getText().trim());
        String mascotaTexto = txt_mascota.getText().trim();
        int mascota = Integer.parseInt(mascotaTexto);
        visita.setMascota(mascota);
        String vetTexto = txt_veterinario.getText().trim();
        int vet = Integer.parseInt(vetTexto);
        visita.setVeterinario(vet);
        visita.setCosto(txt_costo.getText().trim());
        visita.setDiagnostico(txt_diagnostico.getText().trim());
        visita.setTratamiento(txt_tratamiento.getText().trim());
        visita.setReceta(txt_receta.getText().trim());

        String hora=(txt_hora.getText().trim());
        String costo=(txt_costo.getText().trim());

        if (validarHora(hora)) {
            if (validarDecimal(costo)) {
                if (validarEntero(mascotaTexto)) {
                    if (validarEntero(vetTexto)) {
                boolean resultado = vis.editar(visita);
                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "La visita se agrego correctamente");
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar visita");
                    CargarTabla("MostrarVisitas");
                }
        }else {
            JOptionPane.showMessageDialog(null, "Veterinario inválido");
        }}else {
            JOptionPane.showMessageDialog(null, "Mascota inválida");
        }} else {
            JOptionPane.showMessageDialog(null, "Costo inválido");
        }}else {
            JOptionPane.showMessageDialog(null, "Hora inválida");}
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // Guarda los valores de lo jtextfields
    String mascota = txt_mascota.getText().trim();

    // Verifica si el campo de texto está vacío y asigna "NULL" si es así
    if (mascota.isEmpty()) {
        mascota = "NULL";
    }else {
        mascota = "'" + mascota + "'";
    }

    // Llama al procedimiento almacenado pasando los valores correctamente formateados
    CargarTabla("BuscarVisitas(" + mascota + ")");
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tabla.getSelectedRow();
        int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        boolean resultado = vis.eliminar(id);

        if (resultado == true) {
            JOptionPane.showMessageDialog(null, "La visita se elimino correctamente");
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar visita");
            CargarTabla("MostrarVisitas");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_refrescarActionPerformed

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
    private javax.swing.JPanel PanelVis;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_refrescar;
    private com.toedter.calendar.JDateChooser chooser_fecha_visita;
    private javax.swing.JComboBox<String> combobox_mascota;
    private javax.swing.JComboBox<String> combobox_veterinario;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextArea txt_diagnostico;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_mascota;
    private javax.swing.JTextArea txt_receta;
    private javax.swing.JTextArea txt_tratamiento;
    private javax.swing.JTextField txt_veterinario;
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
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Hora");
        modeloTabla.addColumn("id_mascota");
        modeloTabla.addColumn("Mascota");
        modeloTabla.addColumn("id_veterinario");
        modeloTabla.addColumn("Veterinario");
        modeloTabla.addColumn("Diagnóstico");
        modeloTabla.addColumn("Tratamiento");
        modeloTabla.addColumn("Receta");
        modeloTabla.addColumn("Costo");
        modeloTabla.addColumn("cobrado");
        tabla.setModel(modeloTabla);

        // Se definen los tamaños de la tabla
        tabla.setRowHeight(70);
        tabla.getColumnModel().getColumn(0).setMinWidth(50);
        tabla.getColumnModel().getColumn(0).setMaxWidth(50);
        tabla.getColumnModel().getColumn(1).setMinWidth(100);
        tabla.getColumnModel().getColumn(1).setMaxWidth(100);
        tabla.getColumnModel().getColumn(2).setMinWidth(100);
        tabla.getColumnModel().getColumn(2).setMaxWidth(100);
        tabla.getColumnModel().getColumn(3).setMinWidth(0);
        tabla.getColumnModel().getColumn(3).setMaxWidth(0);
        tabla.getColumnModel().getColumn(5).setMinWidth(0);
        tabla.getColumnModel().getColumn(5).setMaxWidth(0);
        tabla.getColumnModel().getColumn(10).setMinWidth(60);
        tabla.getColumnModel().getColumn(10).setMaxWidth(60);
        tabla.getColumnModel().getColumn(11).setMinWidth(0);
        tabla.getColumnModel().getColumn(11).setMaxWidth(0);
        DefaultTableCellRenderer cellRenderer = new LineWrapTableCellRenderer();
        tabla.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(6).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(7).setCellRenderer(cellRenderer);
        tabla.getColumnModel().getColumn(8).setCellRenderer(cellRenderer);
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
            Object[] fila = new Object[12];
            fila[0] = resultSet.getInt("id");
            fila[1] = resultSet.getDate("fecha");
            fila[2] = resultSet.getString("hora");
            fila[3] = resultSet.getInt("mascota");
            fila[4] = resultSet.getString("nombre_mascota");
            fila[5] = resultSet.getInt("veterinario");
            fila[6] = resultSet.getString("nombre_veterinario");
            fila[7] = resultSet.getString("diagnostico");
            fila[8] = resultSet.getString("tratamiento");
            fila[9] = resultSet.getString("receta");
            fila[10] = resultSet.getString("costo");
            fila[11] = resultSet.getInt("cobrado");
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
        txt_mascota.setText("");
        txt_veterinario.setText("");
        txt_hora.setText("");
        txt_costo.setText("");
        txt_diagnostico.setText("");
        txt_tratamiento.setText("");
        txt_receta.setText("");
        vis.cargarMascotas(combobox_mascota);
        vis.cargarVets(combobox_veterinario);

        // Poner en blanco el JDateChooser
        chooser_fecha_visita.setDate(null);

        // Desactivar los botones
        btn_editar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        CargarTabla("MostrarVisitas");
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
