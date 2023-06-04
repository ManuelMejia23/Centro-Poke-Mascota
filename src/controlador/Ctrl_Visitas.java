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
import modelo.Visita;

public class Ctrl_Visitas {

    /**
     * **************************************************
     * metodo para guardar un nuevo cliente
     * **************************************************
     */
    public boolean agregar(Visita visita) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtVisitas = null;

        try {
            // Preparar la llamada al procedimiento almacenado AltaPersona
            stmtVisitas = cn.prepareCall("{ CALL AltaVisita(?, ?, ?, ?, ?, ?, ?, ?, 0) }");
            stmtVisitas.setString(1, visita.getFechaVisita());
            stmtVisitas.setString(2, visita.getHora());
            stmtVisitas.setInt(3, visita.getMascota());
            stmtVisitas.setInt(4, visita.getVeterinario());
            stmtVisitas.setString(5, visita.getDiagnostico());
            stmtVisitas.setString(6, visita.getTratamiento());
            stmtVisitas.setString(7, visita.getReceta());
            stmtVisitas.setString(8, visita.getCosto());

            // Ejecutar la sentencia SQL
            stmtVisitas.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al guardar visita: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtVisitas != null) {
                try {
                    stmtVisitas.close();
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
    public boolean editar(Visita visita) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        CallableStatement stmtVisitas = null;

        try {
            // Preparar la llamada al procedimiento almacenado EditarCliente
            stmtVisitas = cn.prepareCall("{ CALL EditarVisita(?, ?, ?, ?, ?, ?, ?, ?, ?, 0) }");
            stmtVisitas.setInt(1, visita.getId());
            stmtVisitas.setString(2, visita.getFechaVisita());
            stmtVisitas.setString(3, visita.getHora());
            stmtVisitas.setInt(4, visita.getMascota());
            stmtVisitas.setInt(5, visita.getVeterinario());
            stmtVisitas.setString(6, visita.getDiagnostico());            
            stmtVisitas.setString(7, visita.getTratamiento());
            stmtVisitas.setString(8, visita.getReceta());
            stmtVisitas.setString(9, visita.getCosto());

            // Ejecutar la sentencia SQL
            stmtVisitas.executeUpdate();
            respuesta = true;
        } catch (SQLException e) {
            System.out.println("Error al actualizar visita: " + e);
        } finally {
            // Cerrar los objetos PreparedStatement y la conexión
            if (stmtVisitas != null) {
                try {
                    stmtVisitas.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar PreparedStatement de visita: " + e);
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
            stmt = cn.prepareCall("{ CALL BajaVisitas(?) }");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            respuesta = true;
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar visita: " + e);
        } finally {
            return respuesta;
        }
    }

    public static boolean validarHora(String hora) {
    // Expresión regular para validar el formato de hora
    String patron = "^([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)$";

    // Compilar la expresión regular
    Pattern pattern = Pattern.compile(patron);

    // Comparar la hora con la expresión regular
    Matcher matcher = pattern.matcher(hora);

    // Verificar si coincide con el patrón
    return matcher.matches();
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

    public void cargarMascotas(JComboBox<String> comboBox) {
        // Conexión a la base de datos
        Connection cn = Conexion.conectar();
        try  {
            // Consulta SQL para obtener los datos de la vista nombre_clientes
            String sql = "SELECT id, nombre FROM mascotas";
            
            // Preparar la consulta
            PreparedStatement stmt = cn.prepareStatement(sql);
            
            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();
            
            // Limpiar los elementos existentes en el ComboBox
            comboBox.removeAllItems();
            
            // Agregar los elementos al ComboBox
            while (rs.next()) {
                String mascotasId = rs.getString("id");
                String nombreMascota = rs.getString("nombre");
                comboBox.addItem(nombreMascota);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }}

    public void cargarVets(JComboBox<String> comboBox) {
        // Conexión a la base de datos
        Connection cn = Conexion.conectar();
        try  {
            // Consulta SQL para obtener los datos de la vista nombre_veterinarios
            String sql = "SELECT veterinario_id, nombre_veterinario FROM nombre_veterinarios";
            
            // Preparar la consulta
            PreparedStatement stmt = cn.prepareStatement(sql);
            
            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();
            
            // Limpiar los elementos existentes en el ComboBox
            comboBox.removeAllItems();
            
            // Agregar los elementos al ComboBox
            while (rs.next()) {
                String veterinarioId = rs.getString("veterinario_id");
                String nombreVeterinario = rs.getString("nombre_veterinario");
                comboBox.addItem(nombreVeterinario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }}
}
