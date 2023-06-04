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
import modelo.Producto;

public class Ctrl_Productos {

    /**
     * **************************************************
     * metodo para guardar un nuevo cliente
     * **************************************************
     */
    public boolean agregar(Producto producto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtProducto = null;

        try {
            // Preparar la llamada al procedimiento almacenado AltaPersona
            stmtProducto = cn.prepareCall("{ CALL AltaProducto(?, ?, ?, ?, ?, ?) }");
            stmtProducto.setString(1, producto.getNombre());
            stmtProducto.setString(2, producto.getDescripcion());
            stmtProducto.setDouble(3, producto.getPrecio());
            stmtProducto.setInt(4, producto.getExistencias());
            stmtProducto.setString(5, producto.getCategoria());
            stmtProducto.setString(6, producto.getProveedor());

            // Ejecutar la sentencia SQL
            stmtProducto.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtProducto != null) {
                try {
                    stmtProducto.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar PreparedStatement de producto: " + e);
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
    public boolean editar(Producto producto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtProducto = null;

        try {
            // Preparar la llamada al procedimiento almacenado EditarCliente
            stmtProducto = cn.prepareCall("{ CALL EditarProducto(?, ?, ?, ?, ?, ?, ?) }");
            stmtProducto.setInt(1, producto.getId());
            stmtProducto.setString(2, producto.getNombre());
            stmtProducto.setString(3, producto.getDescripcion());
            stmtProducto.setDouble(4, producto.getPrecio());
            stmtProducto.setInt(5, producto.getExistencias());
            stmtProducto.setString(6, producto.getCategoria());            
            stmtProducto.setString(7, producto.getProveedor());

            // Ejecutar la sentencia SQL
            stmtProducto.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtProducto != null) {
                try {
                    stmtProducto.close();
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
            stmt = cn.prepareCall("{ CALL BajaProducto(?) }");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            respuesta = true;
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar mascota: " + e);
        } finally {
            return respuesta;
        }
    }

    /**
     * **************************************************
     * metodo para validar el numero decimal
     * **************************************************
     */
    public static boolean validarDecimal(String numero) {
        // Expresión regular para validar el número decimal
        String patron = "^\\d+(\\.\\d+)?$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(patron);

        // Comparar el número con la expresión regular
        Matcher matcher = pattern.matcher(numero);

        // Verificar si coincide con el patrón
        return matcher.matches();
    }

    /**
     * **************************************************
     * metodo para validar el nombre ingresado
     * **************************************************
     */
    public static boolean validarNombre(String nombre) {
    // Expresión regular para validar el nombre permitiendo acentos y espacios
    String patron = "^(?:[A-ZÁÉÍÓÚÑ][a-zA-ZÁÉÍÓÚÑ]+(?:\\s|$))+";

    // Compilar la expresión regular
    Pattern pattern = Pattern.compile(patron);

    // Comparar el nombre con la expresión regular
    Matcher matcher = pattern.matcher(nombre);

    // Verificar si coincide con el patrón
    return matcher.matches();
    }


public static boolean validarEntero(String numero) {
    // Expresión regular para validar números enteros
    String patron = "^\\d+$";

    // Compilar la expresión regular
    Pattern pattern = Pattern.compile(patron);

    // Comparar el número con la expresión regular
    Matcher matcher = pattern.matcher(numero);

    // Verificar si coincide con el patrón
    return matcher.matches();
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
}
