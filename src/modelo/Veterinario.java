package modelo;

public class Veterinario {

    //Atributos
    public static int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String fecha_nacimiento;
    private String correo;
    private String contrasena;
    private String turno;
    public static int persona;

    //Constructor
    public Veterinario() {
        this.id = 0;
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        this.fecha_nacimiento = "";
        this.correo = "";
        this.contrasena = "";
        this.turno = "";
        this.persona = 0;
    }

    //Constructor sobrecargado
    public Veterinario(int id, String nombre, String direccion, String telefono, String fecha_nacimiento, String correo, String turno, int persona) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.contrasena = contrasena;
        this.turno = turno;
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


    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }
}

