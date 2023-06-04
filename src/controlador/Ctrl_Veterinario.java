package controlador;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelo.Veterinario;

public class Ctrl_Veterinario {

    /**
     * **************************************************
     * metodo para guardar un nuevo veterinario
     * **************************************************
     */
    public boolean agregar(Veterinario veterinario) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    CallableStatement stmtPersona = null;
    CallableStatement stmtVeterinario = null;


    try {
        // Preparar la llamada al procedimiento almacenado AltaPersona
        stmtPersona = cn.prepareCall("{ CALL AltaPersona(?, ?, ?, ?, ?) }");
        stmtPersona.setString(1, veterinario.getNombre());
        stmtPersona.setString(2, veterinario.getDireccion());
        stmtPersona.setString(3, veterinario.getTelefono());
        stmtPersona.setString(4, veterinario.getFecha_nacimiento());
        stmtPersona.setString(5, veterinario.getCorreo());

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
                // Preparar la llamada al procedimiento almacenado AltaVeterinario
                stmtVeterinario = cn.prepareCall("{ CALL AltaVeterinario(?, ?) }");
                stmtVeterinario.setString(1, veterinario.getContrasena());
                stmtVeterinario.setString(2, veterinario.getTurno());
                
                // Ejecutar la sentencia SQL
                stmtVeterinario.executeUpdate();

                // Cerrar recursos
                stmtVeterinario.close();

                respuesta = true;
            } catch (SQLException e) {
                System.out.println("Error al guardar veterinario: " + e);
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
    public boolean editar(Veterinario veterinario) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();
    CallableStatement stmtPersona = null;

    try {
        // Preparar la llamada al procedimiento almacenado EditarVeterinario
        stmtPersona = cn.prepareCall("{ CALL EditarVeterinario(?, ?, ?, ?, ?, ?, ?, ?) }");
        stmtPersona.setInt(1, veterinario.getPersona());
        stmtPersona.setString(2, veterinario.getNombre());
        stmtPersona.setString(3, veterinario.getDireccion());
        stmtPersona.setString(4, veterinario.getTelefono());
        stmtPersona.setString(5, veterinario.getFecha_nacimiento());
        stmtPersona.setString(6, veterinario.getCorreo());
        stmtPersona.setString(7, veterinario.getContrasena());
        stmtPersona.setString(8, veterinario.getTurno());

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
            stmt = cn.prepareCall("{ CALL BajaVeterinario(?) }");
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


    /**
     * **************************************************
     * metodo para validar el nombre ingresado
     * **************************************************
     */
    public static boolean validarContrasena(String contrasena) {
        // Definir la expresión regular para verificar la contraseña
        String regex = ".{8,}"; // Al menos 8 caracteres

        // Crear el objeto Pattern y Matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contrasena);

        // Verificar si la contraseña coincide con el patrón
        return matcher.matches();
    }

}
