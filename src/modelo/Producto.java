package modelo;

/**
 *
 * @author manue
 */
public class Producto {
    
    //Atributos
    public int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int existencias;
    private String categoria;
    private String proveedor;
    
    //Contructor
    public Producto(){
        this.id = 0;
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0.0;
        this.existencias = 0;
        this.categoria = "";
        this.proveedor = "";
    }
    //Contructor sobrecargado
    public Producto(int id, String nombre, String descripcion, double precio, int existencias, String categoria, String proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }
    
    //Set and get

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

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
}
