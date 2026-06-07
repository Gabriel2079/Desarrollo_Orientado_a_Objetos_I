
package model;

/**
 * @return Texto con el RUT.
 */
public class Rut {
    private String numero;

    // Constructor que acepta el RUT
    public Rut(String numeroRUT) {
        // limpia espacios y pasa a mayúscula la K
        this.numero = numeroRUT.trim().toUpperCase();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}