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

public class Ctrl_Mascotas {

    /**
     * **************************************************
     * metodo para guardar una mascota nueva
     * **************************************************
     */
    public boolean agregar(Mascota mascota) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtMascota = null;

        try {
            // Preparar la llamada al procedimiento almacenado AltaMascota
            stmtMascota = cn.prepareCall("{ CALL AltaMascota(?, ?, ?, ?, ?, ?, ?, ?) }");
            stmtMascota.setString(1, mascota.getNombre());
            stmtMascota.setString(2, mascota.getEspecie());
            stmtMascota.setString(3, mascota.getRaza());
            stmtMascota.setString(4, mascota.getFecha_nacimiento());
            stmtMascota.setString(5, mascota.getSexo());
            stmtMascota.setString(6, mascota.getLongitud());
            stmtMascota.setString(7, mascota.getPeso());
            stmtMascota.setInt(8, mascota.getDueno());

            // Ejecutar la sentencia SQL
            stmtMascota.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al guardar mascota: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtMascota != null) {
                try {
                    stmtMascota.close();
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
     * metodo para actualizar una mascota
     * **************************************************
     */
    public boolean editar(Mascota mascota) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtMascota = null;

        try {
            // Preparar la llamada al procedimiento almacenado EditarMascota
            stmtMascota = cn.prepareCall("{ CALL EditarMascota(?, ?, ?, ?, ?, ?, ?, ?, ?) }");
            stmtMascota.setInt(1, mascota.getId());
            stmtMascota.setString(2, mascota.getNombre());
            stmtMascota.setString(3, mascota.getEspecie());
            stmtMascota.setString(4, mascota.getRaza());
            stmtMascota.setString(5, mascota.getFecha_nacimiento());
            stmtMascota.setString(6, mascota.getSexo());            
            stmtMascota.setString(7, mascota.getLongitud());
            stmtMascota.setString(8, mascota.getPeso());
            stmtMascota.setInt(9, mascota.getDueno());

            // Ejecutar la sentencia SQL
            stmtMascota.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar persona: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtMascota != null) {
                try {
                    stmtMascota.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar PreparedStatement de mascota: " + e);
                }
            }
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar una mascota
     * **************************************************
     */
    public boolean eliminar(int id) {
        boolean respuesta = false;
        CallableStatement stmt = null;
        Connection cn = Conexion.conectar();
        try {
            stmt = cn.prepareCall("{ CALL BajaMascota(?) }");
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
