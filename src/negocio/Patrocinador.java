package negocio;

/**
 * Plantilla de los patrocinadores de las campañas.
 * @author Emanuel Martínez Pinzón
 * @version 1.0
 */
public class Patrocinador {
    private String nit, nombre, sector;
    private int dinero;
    
    public Patrocinador(){}
    
    public Patrocinador(String nit, String nombre, int dinero, String sector) {
        this.nit = nit;
        this.nombre = nombre;
        this.dinero = dinero;
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

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dnero) {
        this.dinero = dnero;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
