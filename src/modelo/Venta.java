package modelo;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;

/**
 *
 * @author manue
 */
public class Venta {

    //Atributos
    public static int id;
    private int cliente;
    private int producto;
    private int cantidad;

    //Constructor
    public Venta() {
        this.id = 0;
        this.cliente = 0;
        this.producto = 0;
        this.cantidad = 0;
    }

    //Constructor sobrecargado
    public Venta(int id, int cliente, int producto, int cantidad) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}