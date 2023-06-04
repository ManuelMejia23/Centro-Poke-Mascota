package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/centropokemascota", "root", "");
            System.out.println("Conexión exitosa");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexión local " + e);
        }
        return null;
    }
}
