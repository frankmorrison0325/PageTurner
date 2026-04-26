package pageturner.model;

public class Libro {
    
private String ISBN;
    private String titulo;
    private String autor;
    private double precio;
    private int stock;

    public Libro(String ISBN, String titulo, String autor, double precio, int stock) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        setPrecio(precio);
        setStock(stock);
    }
    // Getters

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getAutor() {
    return autor;
}
    // Setters

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }
    // Método del dominio
    public void actualizarStock(int cantidad) {
        if (stock + cantidad >= 0) {
            stock += cantidad;
        }
    }
}


