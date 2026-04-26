package pageturner.model;

public class Cliente {


private String dni;
    private String nombre;
    private String correo;

    public Cliente(String dni, String nombre, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        setCorreo(correo);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correo = correo;
        }
    }
}



