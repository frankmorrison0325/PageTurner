
package pageturner.model;

import java.util.Date;

public class Venta {

    private int idVenta;
    private Date fecha;
    private int cantidad;
    private Cliente cliente;
    private Libro libro;

    public Cliente getCliente() {
    return cliente;
}

    public Venta(int idVenta, Date fecha, int cantidad, Cliente cliente, Libro libro) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.libro = libro;
    }

    // Getters
    public int getIdVenta() {
        return idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    // Métodos del dominio
    public double calcularTotal() {
        return libro.getPrecio() * cantidad;
    }

    public void registrar() {
        if (libro.getStock() >= cantidad) {
            libro.actualizarStock(-cantidad);
            System.out.println("Venta registrada correctamente.");
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}
