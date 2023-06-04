package controlador;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelo.Cliente;

public class Ctrl_Cliente {

    /**
     * **************************************************
     * metodo para guardar un nuevo cliente
     * **************************************************
     */
    public boolean agregar(Cliente cliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtPersona = null;
        CallableStatement stmtCliente = null;

        try {
            // Preparar la llamada al procedimiento almacenado AltaPersona
            stmtPersona = cn.prepareCall("{ CALL AltaPersona(?, ?, ?, ?, ?) }");
            stmtPersona.setString(1, cliente.getNombre());
            stmtPersona.setString(2, cliente.getDireccion());
            stmtPersona.setString(3, cliente.getTelefono());
            stmtPersona.setString(4, cliente.getFecha_nacimiento());
            stmtPersona.setString(5, cliente.getCorreo());

            // Ejecutar la sentencia SQL
            stmtPersona.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al guardar persona: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtPersona != null) {
                try {
                    stmtPersona.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar PreparedStatement de persona: " + e);
                }
            }
            if (cn != null) {
                try {
                    // Preparar la llamada al procedimiento almacenado AltaCliente
                    stmtCliente = cn.prepareCall("{ CALL AltaCliente}");

                    // Ejecutar la sentencia SQL
                    stmtCliente.executeUpdate();

                    // Cerrar recursos
                    stmtCliente.close();

                    respuesta = true;
                } catch (SQLException e) {
                    System.out.println("Error al guardar cliente: " + e);
                }
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
    public boolean editar(Cliente cliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtPersona = null;

        try {
            // Preparar la llamada al procedimiento almacenado EditarCliente
            stmtPersona = cn.prepareCall("{ CALL EditarCliente(?, ?, ?, ?, ?, ?) }");
            stmtPersona.setInt(1, cliente.getPersona());
            stmtPersona.setString(2, cliente.getNombre());
            stmtPersona.setString(3, cliente.getDireccion());
            stmtPersona.setString(4, cliente.getTelefono());
            stmtPersona.setString(5, cliente.getFecha_nacimiento());
            stmtPersona.setString(6, cliente.getCorreo());

            // Ejecutar la sentencia SQL
            stmtPersona.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar persona: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtPersona != null) {
                try {
                    stmtPersona.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar PreparedStatement de persona: " + e);
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
    public boolean eliminar(int persona) {
        boolean respuesta = false;
        CallableStatement stmt = null;
        Connection cn = Conexion.conectar();
        try {
            stmt = cn.prepareCall("{ CALL BajaCliente(?) }");
            stmt.setInt(1, persona);
            stmt.executeUpdate();
            respuesta = true;
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e);
        } finally {
            return respuesta;
        }
    }

    /**
     * **************************************************
     * metodo para validar el correo ingresado
     * **************************************************
     */
    public static boolean validarCorreo(String correo) {
        // Expresión regular para validar el correo electrónico
        String patron = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(patron);

        // Comparar el correo con la expresión regular
        Matcher matcher = pattern.matcher(correo);

        // Verificar si coincide con el patrón
        return matcher.matches();
    }

    /**
     * **************************************************
     * metodo para validar el telefono ingresado
     * **************************************************
     */
    public static boolean validarTelefono(String telefono) {
        // Expresión regular para validar el número de teléfono
        String patron = "^[0-9]{10}$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(patron);

        // Comparar el teléfono con la expresión regular
        Matcher matcher = pattern.matcher(telefono);

        // Verificar si coincide con el patrón
        return matcher.matches();
    }

    /**
     * **************************************************
     * metodo para validar el nombre ingresado
     * **************************************************
     */
    public static boolean validarNombre(String nombre) {
    // Expresión regular para validar el nombre permitiendo acentos
    String patron = "^[A-ZÁÉÍÓÚÑ][a-zA-ZÁÉÍÓÚÑ]+(\\s[A-ZÁÉÍÓÚÑ][a-zA-ZÁÉÍÓÚÑ]+)*$";

    // Compilar la expresión regular
    Pattern pattern = Pattern.compile(patron);

    // Comparar el nombre con la expresión regular
    Matcher matcher = pattern.matcher(nombre);

    // Verificar si coincide con el patrón
    return matcher.matches();
}

}
