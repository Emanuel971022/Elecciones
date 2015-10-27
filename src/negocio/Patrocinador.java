package negocio;

public class Patrocinador {
    private String nit, nombre, dnero, sector;
    
    public Patrocinador(){}
    
    public Patrocinador(String nit, String nombre, String dnero, String sector) {
        this.nit = nit;
        this.nombre = nombre;
        this.dnero = dnero;
        this.sector = sector;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDnero() {
        return dnero;
    }

    public void setDnero(String dnero) {
        this.dnero = dnero;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
