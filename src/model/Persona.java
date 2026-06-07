package model;

/**
 * Representa a una persona en el sistema.
 */
public class Persona {
    private Rut rut;
    private String nombre;
    private String correo;
    private Direccion direccion;

    public Persona(Rut rut, String nombre, String correo, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Getters y setters
    public Rut getRut() { return rut; }
    public void setRut(Rut rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Direccion getDirection() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    /**
     * @return Texto con los datos personales.
     */
    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Correo: " + correo + " | Dirección: [" + direccion + "]";
    }
}