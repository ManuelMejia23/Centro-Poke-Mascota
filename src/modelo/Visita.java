package modelo;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;

/**
 *
 * @author manue
 */
public class Visita {

    //Atributos
    public static int id;
    private String fecha_visita;
    private String hora;
    private String costo;
    private String diagnostico;
    private String tratamiento;
    private String receta;
    public static int mascota;
    public static int veterinario;

    //Constructor
    public Visita() {
        this.id = 0;
        this.fecha_visita = "";
        this.hora = "";
        this.costo = "";
        this.diagnostico = "";
        this.tratamiento = "";
        this.receta = "";
        this.mascota = 0;
        this.veterinario = 0;
    }

    //Constructor sobrecargado
    public Visita(int id, String fecha_visita, String hora, String costo, String diagnostico, String tratamiento, String receta, int mascota, int veterinario) {
        this.id = id;
        this.fecha_visita = fecha_visita;
        this.hora = hora;
        this.costo = costo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.receta = receta;
        this.mascota = mascota;
        this.veterinario=veterinario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaVisita() {
        return fecha_visita;
    }

    public void setFechaVisita(String fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public int getMascota() {
        return mascota;
    }

    public void setMascota(int mascota) {
        this.mascota = mascota;
    }

    public int getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(int veterinario) {
        this.veterinario = veterinario;
    }
}

