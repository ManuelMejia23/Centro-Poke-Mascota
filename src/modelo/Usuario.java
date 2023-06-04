package modelo;

/**
 *
 * @author ediso
 */
public class Usuario {

    //Atributos
    private int idUsuario;
    private String nombre;
    private String password;

    //Contructor vacío
    public Usuario() {
        this.idUsuario = 0;
        this.nombre = "";
        this.password = "";
    }

    //set and get
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
