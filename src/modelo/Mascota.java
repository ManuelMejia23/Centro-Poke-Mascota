package modelo;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;

/**
 *
 * @author manue
 */
public class Mascota {

    //Atributos
    public static int id;
    private String nombre;
    private String especie;
    private String raza;
    private String fecha_nacimiento;
    private String sexo;
    private String longitud;
    private String peso;
    public static int dueno;

    //Constructor
    public Mascota() {
        this.id = 0;
        this.nombre = "";
        this.especie = "";
        this.raza = "";
        this.fecha_nacimiento = "";
        this.sexo = "";
        this.longitud = "";
        this.peso = "";
        this.dueno = 0;
    }

    //Constructor sobrecargado
    public Mascota(int id, String nombre, String especie, String raza, String fecha_nacimiento, String sexo, String longitud, String peso, int dueno) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.longitud = longitud;
        this.peso = peso;
        this.dueno=dueno;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getDueno() {
        return dueno;
    }

    public void setDueno(int dueno) {
        this.dueno = dueno;
    }
}

