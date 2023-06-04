package controlador;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import modelo.Cliente;
import modelo.Mascota;
import modelo.Venta;

public class Ctrl_Ventas {

    /**
     * **************************************************
     * metodo para guardar un nuevo cliente
     * **************************************************
     */
    public boolean agregar(Venta venta) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtVenta = null;

        try {
            // Preparar la llamada al procedimiento almacenado AltaPersona
            stmtVenta = cn.prepareCall("{ CALL AltaVenta(?, ?, ?) }");
            stmtVenta.setInt(1, venta.getCliente());
            stmtVenta.setInt(2, venta.getProducto());
            stmtVenta.setInt(3, venta.getCantidad());

            // Ejecutar la sentencia SQL
            stmtVenta.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al guardar venta: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtVenta != null) {
                try {
                    stmtVenta.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar PreparedStatement de persona: " + e);
                }
            }
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar conexión: " + e);
                }
            }
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para actualizar un cliente
     * **************************************************
     */
    public boolean editar(Venta venta) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtVenta = null;

        try {
            // Preparar la llamada al procedimiento almacenado EditarCliente
            stmtVenta = cn.prepareCall("{ CALL EditarVenta(?, ?, ?, ?) }");
            stmtVenta.setInt(1, venta.getId());
            stmtVenta.setInt(2, venta.getCliente());
            stmtVenta.setInt(3, venta.getProducto());
            stmtVenta.setInt(4, venta.getCantidad());

            // Ejecutar la sentencia SQL
            stmtVenta.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar venta: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtVenta != null) {
                try {
                    stmtVenta.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar PreparedStatement de mascota: " + e);
                }
            }
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un cliente
     * **************************************************
     */
    public boolean eliminar(int id) {
        boolean respuesta = false;
        CallableStatement stmt = null;
        Connection cn = Conexion.conectar();
        try {
            stmt = cn.prepareCall("{ CALL BajaVenta(?) }");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            respuesta = true;
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar venta: " + e);
        } finally {
            return respuesta;
        }
    }


    public void cargarClientes(JComboBox<String> comboBox) {
        // Conexión a la base de datos
        Connection cn = Conexion.conectar();
        try  {
            // Consulta SQL para obtener los datos de la vista nombre_clientes
            String sql = "SELECT cliente_id, nombre_cliente FROM nombre_clientes";
            
            // Preparar la consulta
            PreparedStatement stmt = cn.prepareStatement(sql);
            
            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();
            
            // Limpiar los elementos existentes en el ComboBox
            comboBox.removeAllItems();
            
            // Agregar los elementos al ComboBox
            while (rs.next()) {
                String clienteId = rs.getString("cliente_id");
                String nombreCliente = rs.getString("nombre_cliente");
                comboBox.addItem(nombreCliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }}

    public void cargarProductos(JComboBox<String> comboBox) {
        // Conexión a la base de datos
        Connection cn = Conexion.conectar();
        try  {
            // Consulta SQL para obtener los datos de la vista nombre_clientes
            String sql = "SELECT id, nombre FROM productos";
            
            // Preparar la consulta
            PreparedStatement stmt = cn.prepareStatement(sql);
            
            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();
            
            // Limpiar los elementos existentes en el ComboBox
            comboBox.removeAllItems();
            
            // Agregar los elementos al ComboBox
            while (rs.next()) {
                String ProductoId = rs.getString("id");
                String nombreProducto = rs.getString("nombre");
                comboBox.addItem(nombreProducto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }}
}
