package model;


/**
 * Representa a un empleado de la agencia.
 */
public class Empleado extends Persona {
    private String cargo;
    private int sueldoBase;

    public Empleado(Rut rut, String nombre, String correo, Direccion direccion, String cargo, int sueldoBase) {
        super(rut, nombre, correo, direccion);
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
    }

    // getters y Setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public int getSueldoBase() { return sueldoBase; }
    public void setSueldoBase(int sueldoBase) { this.sueldoBase = sueldoBase; }

    /**
     * @return Texto con los datos y cargo del empleado.
     */
    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo + " | Sueldo Base: $" + sueldoBase;
    }
}