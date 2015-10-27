/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Estudiante
 */
public class PartidoPolitico {
    private String id, nombre, fecha_Creacion, resumen;
    private boolean dineroPublico;
    private Miembro[] miembros;
    private Campaña campaña;
    private int indice;
    private int apoyoCampañas;

    public PartidoPolitico(String id, String nombre, String fecha_Creacion, String resumen, boolean dineroPublico) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_Creacion = fecha_Creacion;
        this.resumen = resumen;
        this.dineroPublico = dineroPublico;
        miembros = new Miembro[10];
        campaña = new Campaña();
    }
    
    //-----------------------REQUERIMIENTOS FUNCIONALES------------------------//
    public boolean registrarMiembro(String cc, String nombre, String telefono, String gustos){
        if(indice < miembros.length && miembros[indice] == null){
            miembros[indice] = new Miembro(cc, nombre, telefono, gustos);
            indice++;
            return true;
        }
        
        return false;
    }
    
    public boolean registrarCandidato(String cc, String fechaPostulacion, String discurso){
        String info[] = obtenerInfoMiembro(cc).split("~");
        
        return campaña.registrarCandidato(cc, info[1], info[2], info[3], fechaPostulacion, discurso);
    }
    
    public boolean registrarPatrocinador(String nit, String nombre, String dinero, String sector){
        return campaña.registrarPatrocinador(nit, nombre, dinero, sector);
    }
    
    public void setApoyo(int cantidad){
        apoyoCampañas = apoyoCampañas+cantidad;
    }
    
    public int getApoyo(){
        return apoyoCampañas;
    }
    
    //-----------------------REQUERIMIENTOS OPERACIONALES----------------------//
    public boolean verificarExistenciaMiembro(String cc){
        for(Miembro x: miembros)
            if(x != null && x.getCc().equals(cc))
                return true;
        
        return false;
    }
    
    public String concatenarMiembros(){
        String infoMiembros = "";
        
        for(Miembro x: miembros)
            if(x != null)
                infoMiembros += x.getCc()+"-"+x.getNombre()+"~";
        
        return infoMiembros;
    }
    
    protected String obtenerInfoMiembro(String cc){
        for(Miembro x: miembros)
            if(x != null && x.getCc().equals(cc))
                return x.getCc()+"~"+x.getNombre()+"~"+x.getTelefono()+"~"+x.getGustos();
        
        return "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_Creacion() {
        return fecha_Creacion;
    }

    public void setFecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public boolean isDineroPublico() {
        return dineroPublico;
    }

    public void setDineroPublico(boolean dineroPublico) {
        this.dineroPublico = dineroPublico;
    }   
}
