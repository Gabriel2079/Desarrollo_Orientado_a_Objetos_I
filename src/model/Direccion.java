package model;

/**
 * Almacena la dirección física de una persona, incluyendo su región.
 */
    public class Direccion {
    private String calle;
    private int numero;
    private String departamento;
    private String comuna;
    private String region;
    /**
     * Constructor de la dirección.
     *
     * @param calle Calle
     * @param numero Número
     * @param departamento Departamento o casa
     * @param comuna Comuna
     * @param region Región
     */
    public Direccion(String calle, int numero, String departamento, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.departamento = departamento;
        this.comuna = comuna;
        this.region = region;
    }

    // getters y setters
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    /**
     * @return Texto con la dirección completa.
     */
    @Override
    public String toString() {
        String deptoInfo = (!departamento.equalsIgnoreCase("N/A")) ? " Depto/Casa: " + departamento : "";
        return calle + " #" + numero + deptoInfo + ", " + comuna + ", Región " + region;
    }
}
