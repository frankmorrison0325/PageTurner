
package pageturner.model;

import java.util.Date;

public class Reserva {

    private int idReserva;
    private Date fechaReserva;
    private Cliente cliente;
    private Libro libro;

    public Reserva(int idReserva, Date fechaReserva, Cliente cliente, Libro libro) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.cliente = cliente;
        this.libro = libro;
    }

    public void registrar() {
        System.out.println("Reserva registrada para el libro: " + libro.getTitulo());
    }

    public void cancelar() {
        System.out.println("Reserva cancelada.");
    }
    // Getters
    
    public int getIdReserva() {
    return idReserva;
}

    public Date getFechaReserva() {
    return fechaReserva;
}

    public Cliente getCliente() {
    return cliente;
}
}

