package modelo;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;

/**
 *
 * @author manue
 */
public class Cliente {

    //Atributos
    public static int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String fecha_nacimiento;
    public static int persona;

    //Constructor
    public Cliente() {
        this.id = 0;
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
        this.fecha_nacimiento = "";
        this.persona = 0;
    }

    //Constructor sobrecargado
    public Cliente(int id, String nombre, String direccion, String telefono, String correo, String fecha_nacimiento, int persona) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.persona=persona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }
}

