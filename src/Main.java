import pageturner.model.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro("978-123456", "Base de Datos", "Autor X", 120.0, 5);
        Cliente cliente = new Cliente("12345678", "Juan Pérez", "juan@email.com");

        Venta venta = new Venta(1, new Date(), 2, cliente, libro);
        venta.registrar();

        System.out.println("Stock actual: " + libro.getStock());
        System.out.println("Total venta: " + venta.calcularTotal());
    }
}
